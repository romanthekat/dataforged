import type { ICustomStatOption } from "@json_out/index.js";
import { formatIdFragment } from "@utils/toIdFragment.js";

/**
 * @internal
 */
export class CustomStatOption implements ICustomStatOption {
  $id: ICustomStatOption["$id"];
  Name: string;
  Label: string;
  Value: number;
  constructor(json: Omit<ICustomStatOption, "$id">, parentId: ICustomStatOption["$id"]) {
    this.$id = `${parentId}/${formatIdFragment(json.Name)}`;
    this.Name = json.Name;
    this.Label = json.Label;
    this.Value = json.Value;
  }
}