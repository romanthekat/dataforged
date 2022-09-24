import type { PlaceRecord, SettlementInitialContact, SettlementRecord, StarshipInitialContact } from "@game_objects";
import type { StarshipRecord } from "@game_objects/StarshipRecord.js";
import type { AttributeKey, DerelictType, GameObjectType } from "@schema_json";

/**
 * @internal
 */
export type DerelictRecord = PlaceRecord<GameObjectType.Derelict, AttributeKey.DerelictType|AttributeKey.InitialContact> & {
  [AttributeKey.InitialContact]: StarshipInitialContact.Derelict|SettlementInitialContact.Derelict;
};

/**
 * @internal
 */
export type DerelictStarshipRecord = Omit<StarshipRecord<AttributeKey.DerelictType>, "Object type"> & {
  "Object type": GameObjectType.Derelict;
  [AttributeKey.DerelictType]: DerelictType.Starship;
  [AttributeKey.InitialContact]: StarshipInitialContact.Derelict;
};
/**
 * @internal
 */
export type DerelictSettlementRecord = Omit<SettlementRecord<AttributeKey.DerelictType>, "Object type"> & {
  "Object type": GameObjectType.Derelict;
  [AttributeKey.DerelictType]: DerelictType.Settlement;
  [AttributeKey.InitialContact]: SettlementInitialContact.Derelict;
};