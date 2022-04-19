import type { AttributeKey, AttributeValue } from "../index.js";
/**
 * @public
 */
export interface IAttribute<T extends AttributeKey = AttributeKey> {
    Key: T;
    Value?: AttributeValue<this["Key"]> | undefined;
}
//# sourceMappingURL=IAttribute.d.ts.map