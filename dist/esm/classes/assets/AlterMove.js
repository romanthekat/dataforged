import { MoveTrigger } from "../index.js";
import _ from "lodash-es";
/**
 * @internal
 */
export class AlterMove {
    constructor(json, parent, index) {
        var _a;
        this.$id = `${parent.$id}/Alter_Moves/${index + 1}`;
        this.Moves = (_a = json.Moves) !== null && _a !== void 0 ? _a : null;
        if (json.Trigger) {
            const triggerClone = _.cloneDeep(json.Trigger);
            this.Trigger = new MoveTrigger(triggerClone, `${this.$id}/Trigger`);
        }
    }
}
//# sourceMappingURL=AlterMove.js.map