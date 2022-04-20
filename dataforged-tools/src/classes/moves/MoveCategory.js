import { Move, Source } from "@classes/index.js";
import { MoveCategoryDisplay } from "@classes/moves/MoveCategoryDisplay.js";
/**
 * @internal
 */
export class MoveCategory {
    constructor(json, gamespace, ...ancestorSourceJson) {
        var _a, _b;
        this.$id = `${gamespace}/Moves/${json.Name.replaceAll(" ", "_")}`;
        this.Name = json.Name;
        this.Description = json.Description;
        this.Source = new Source(json.Source, ...ancestorSourceJson);
        this.Display = new MoveCategoryDisplay(`${json.Name} Moves`, (_b = (_a = json.Display) === null || _a === void 0 ? void 0 : _a.Color) !== null && _b !== void 0 ? _b : null);
        this.Moves = json.Moves.map(move => {
            move.Category = this.$id;
            return new Move(move, gamespace, this.Source, ...ancestorSourceJson);
        });
    }
}