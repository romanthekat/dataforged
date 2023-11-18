/**
 * Abstract interfaces and utility types that are only used internally. They are not included in the final schema.
 */
import {
	TOmit,
	TOptional,
	TRecord,
	Type,
	type ObjectOptions,
	type SchemaOptions,
	type Static,
	type TBoolean,
	type TLiteral,
	type TNumber,
	type TObject,
	type TRef,
	type TSchema,
	type TString
} from '@sinclair/typebox'
import { mapValues } from 'lodash-es'
import { type PartialDeep, type Simplify } from 'type-fest'
import type { OracleTableRow } from '../oracles.js'
import { DictKey } from './id.js'
import * as Localize from './localize.js'
import * as Metadata from './metadata.js'
import * as Utils from './utils.js'

export type MergeObjectSchemas<A extends TObject, B extends TObject> = TObject<
	A['properties'] & B['properties']
>

export function Dictionary<T extends TSchema>(
	valuesSchema: T,
	options: ObjectOptions = {}
) {
	return Type.Record(DictKey, valuesSchema, {
		...options,
		$comment: 'Deserialize as a dictionary object.'
	}) as TDictionary<T>
}
export type TDictionary<T extends TSchema> = TRecord<TString, T>

type TransformFn<T, K, TResult> = (value: T, key: K) => TResult

type MappedKeys<T, K extends keyof T, V> = {
	[P in keyof T]: P extends K ? V : T[P]
}

export function MappedKeys<
	T extends TObject,
	Keys extends keyof Static<T>,
	Transform extends TransformFn<
		T['properties'][keyof Static<T>],
		keyof Static<T>,
		TSchema
	>
>(schema: T, keys: Keys[], fn: Transform, options: ObjectOptions = {}) {
	type MappedProps = MappedKeys<T['properties'], Keys, ReturnType<Transform>>

	const properties: Simplify<MappedProps> = mapValues<
		(typeof schema)['properties']
	>(
		schema.properties,
		<K extends Keys>(subschema: T['properties'][K], key: K) => {
			return keys.includes(key) ? fn(subschema, key) : subschema
		}
	) as any

	return Type.Object(properties, options)
}

/**
 * A rollable number range for oracle table rows. Type parameters are for for row-like objects that have a static range, such as delve features/dangers.
 * @internal
 */
export const DiceRange = Type.Object({
	min: Type.Integer({ description: 'The low end of the dice range.' }),
	max: Type.Integer({ description: 'The high end of the dice range.' })
})
export type DiceRange = Static<typeof DiceRange>

export function StaticDiceRange<Min extends number, Max extends number>(
	range: { min: Min; max: Max },
	options: ObjectOptions = {}
) {
	return MappedKeys(
		DiceRange,
		['min', 'max'],
		({ description }, k) => Type.Literal(range[k], { description }),
		options
	) as TObject<{
		min: TLiteral<Min>
		max: TLiteral<Max>
	}>
}
export type StaticDiceRange<Low extends number, High extends number> = Static<
	ReturnType<typeof StaticDiceRange<Low, High>>
>

export const BlankDiceRange = MappedKeys(
	DiceRange,
	Object.keys(DiceRange.properties) as Array<
		keyof (typeof DiceRange)['properties']
	>,
	() => Type.Null(),
	{}
)
export type BlankDiceRange = Static<typeof BlankDiceRange>

export function toDefaultsStub<T extends Static<TObject>>(object: T) {
	return mapValues(object, (v) => Type.Any({ default: v }))
}

export function toLiteralsStub<
	T extends Static<TObject<Record<string, TString | TNumber | TBoolean>>>
>(object: T) {
	return mapValues(object, (v) => Type.Literal(v))
}

/** Extracts all properties that can be rendered as Type.Literal with typebox */
type CanBeLiteral<T> = {
	[K in keyof T as Required<T>[K] extends boolean | number | string | null
		? K
		: never]: T[K]
}

export function StaticRowStub(
	literals: Partial<CanBeLiteral<OracleTableRow>> & {
		min?: number
		max?: number
	},
	defaults: PartialDeep<OracleTableRow> = {}
) {
	const result = Type.Object({
		...toLiteralsStub(literals),
		...toDefaultsStub(defaults)
	})
	return result
}

const SourcedNodeBase = Type.Object({
	id: Type.String(),
	name: Type.Ref(Localize.Label),
	canonical_name: Type.Optional(Type.Ref(Localize.Label)),
	source: Type.Ref(Metadata.Source),
	suggestions: Type.Optional(Type.Ref(Metadata.Suggestions))
})

export function SourcedNode<T extends TObject>(
	schema: T,
	options: ObjectOptions = {}
) {
	return Type.Composite(
		[
			Type.Omit(
				SourcedNodeBase,
				// @ts-expect-error
				Object.keys(schema.properties) as (keyof Static<T>)[]
			),
			schema
		],
		options
	) as unknown as MergeObjectSchemas<TOmit<typeof SourcedNodeBase, 'id'>, T>
	// simplify type so TS doesn't have to do as much work
}

export type SourcedNode = Static<typeof SourcedNodeBase>

const CyclopediaMixin = Type.Object({
	name: Type.Ref(Localize.Label),
	features: Type.Array(Type.Ref(Localize.MarkdownString)),
	summary: Type.Optional(Type.Ref(Localize.MarkdownString)),
	description: Type.Ref(Localize.MarkdownString),
	quest_starter: Type.Ref(Localize.MarkdownString),
	your_truth: Type.Optional(Type.Ref(Localize.MarkdownString))
})

export function Cyclopedia<T extends TObject>(
	schema: T,
	options: ObjectOptions = {}
) {
	const base = Type.Composite([
		CyclopediaMixin,
		schema
	]) as unknown as MergeObjectSchemas<typeof CyclopediaMixin, T>

	return SourcedNode(base, options)
}

// type LocalizeKeys = 'name' | 'label' | 'summary' | 'description' | 'text'
type MetaKeys = 'id' | 'source' | 'rendering' | 'name' | 'suggestions'

const MetaKeys = ['id', 'source', 'rendering', 'name', 'suggestions'] as const

/**
 * Omits common metadata and localization keys.
 */
export function OmitMeta<T extends TObject>(t: T) {
	return Type.Omit(t, MetaKeys)
}
export type OmitMeta<T> = Omit<T, MetaKeys>

/**
 * Enhances a single rules element
 */
export function EnhanceOne<T extends TObject>(t: T) {
	const base = OmitMeta(t)
	const mixin = Type.Object({ enhances: Type.Optional(t.properties.id) })
	return Type.Composite([
		base,
		Type.Object({ enhances: Type.Optional(t.properties.id) })
	]) as unknown as MergeObjectSchemas<typeof base, typeof mixin>
}
export type EnhanceOne<T extends TObject> = Static<
	ReturnType<typeof EnhanceOne<T>>
>

export function EnhanceMany<T extends TObject>(
	enhanceSchema: T,
	extendIds: TString | TRef<TString>,
	options: ObjectOptions = {}
) {
	const base = Utils.DeepPartial(OmitMeta(enhanceSchema))
	const mixin = Type.Object({ enhances: Type.Optional(Type.Array(extendIds)) })

	return Type.Composite([base, mixin], options) as MergeObjectSchemas<
		typeof base,
		typeof mixin
	>
}
export type EnhanceMany<T extends TObject> = Static<
	ReturnType<typeof EnhanceMany<T>>
>

const CollectionMixin = SourcedNode(
	Type.Object({
		color: Type.Optional(Type.Ref(Metadata.CSSColor)),
		summary: Type.Optional(Type.Ref(Localize.MarkdownString)),
		description: Type.Optional(Type.Ref(Localize.MarkdownString)),
		images: Type.Optional(Type.Array(Type.Ref(Metadata.WEBPImageURL))),
		icon: Type.Optional(Type.Ref(Metadata.SVGImageURL))
	})
)

export function Collection<T extends TRef>(
	collectable: T,
	collectionId: TRef<TString>,
	options: SchemaOptions = {}
) {
	const base = Type.Object({
		id: collectionId,
		enhances: Type.Optional({
			...collectionId,
			description:
				"This collection's content enhances the identified collection, rather than being a standalone collection of its own."
		}),
		replaces: Type.Optional({
			...collectionId,
			description:
				'This collection replaces the identified collection. References to the replaced collection can be considered equivalent to this collection.'
		}),
		contents: Dictionary(collectable)
	})

	return Type.Composite(
		[
			base,
			Type.Omit(
				CollectionMixin,
				// @ts-expect-error
				Object.keys(base.properties)
			)
		],
		options
	) as MergeObjectSchemas<typeof base, typeof CollectionMixin> & { $id: string }
}

export type Collection<T> = Simplify<
	SourcedNode &
		Static<typeof CollectionMixin> & {
			id: string
			enhances?: string
			contents: Record<string, T>
		}
>

export type TCollection<T extends TSchema> = ReturnType<
	typeof Collection<TRef<T>>
>

export type RecursiveCollection<T extends Collection<any>> = Utils.PartialBy<
	T,
	'contents'
> & {
	collections?: Record<string, RecursiveCollection<T>>
}

export type TRecursiveCollection<T extends TObject<{ contents: TSchema }>> =
	TObject<
		T['properties'] & {
			collections: TOptional<TDictionary<TRecursiveCollection<T>>>
		}
	>

export function RecursiveCollection<T extends TObject<{ contents: TSchema }>>(
	base: T,
	options: Utils.RequireBy<SchemaOptions, '$id'>
) {
	return Type.Composite(
		[
			Utils.PartialBy(base, ['contents']),
			Type.Object({
				collections: Type.Optional(Dictionary(Type.Ref(options.$id)))
			})
		],
		options
	) as unknown as TRecursiveCollection<typeof base>
}
