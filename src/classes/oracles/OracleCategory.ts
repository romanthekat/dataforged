import SourceInheritor from "@dataforged/classes/common/SourceInheritor.js";
import Oracle from "@dataforged/classes/oracles/Oracle.js";
import OracleCategoryDisplay from "@dataforged/classes/oracles/OracleCategoryDisplay.js";
import OracleUsage from "@dataforged/classes/oracles/OracleUsage.js";
import type { ParagraphsString } from "@dataforged/interfaces/json_out/common/strings/MdString.js";
import type { IOracleCategory } from "@dataforged/interfaces/json_out/oracles/IOracleCategory.js";
import type { OracleCategoryJaggedId, OracleCategoryName } from "@dataforged/interfaces/json_out/oracles/strings/OracleCategoryId.js";
import type { OracleCategoryId } from "@dataforged/interfaces/json_out/oracles/strings/OracleCategoryId.js";
import type IOracleCategoryYaml from "@dataforged/interfaces/yaml_in/oracles/IOracleCategoryYaml.js";
import type IOracleYaml from "@dataforged/interfaces/yaml_in/oracles/IOracleYaml.js";
import buildOracleId from "@dataforged/utils/buildOracleId.js";
import buildLog from "@dataforged/utils/logging/buildLog.js";
import propagateToChildren from "@dataforged/utils/object_transform/propagateToChildren.js";
import _ from "lodash-es";

export default class OracleCategory extends SourceInheritor implements IOracleCategory {
  $id: OracleCategoryId;
  Name: OracleCategoryName;
  Aliases?: string[] | undefined;
  Category?: OracleCategoryJaggedId | undefined;
  Description?: ParagraphsString | undefined;
  Display: OracleCategoryDisplay;
  Usage?: OracleUsage | undefined;
  Oracles?: Oracle[] | undefined;
  Categories?: OracleCategory[] | undefined;
  "Sample Names"?: string[];
  constructor(
    json: IOracleCategoryYaml,
    category?: OracleCategoryJaggedId | undefined,
    ...ancestorsJson: (IOracleYaml | IOracleCategoryYaml)[]
  ) {
    // if (!is<IOracleCategoryData>(json)) {
    //   buildLog(this.constructor, "Json does not conform to type!");
    //   throw new Error();
    // }
    super(json.Source ?? {}, ..._.compact(ancestorsJson.map(item => item.Source)));

    this.$id = buildOracleId(json, ...ancestorsJson) as OracleCategoryId;
    buildLog(this.constructor, `Building: ${this.$id}`);
    this.Name = json.Name;
    this.Aliases = json.Aliases;
    this.Description = json.Description;
    this.Display = new OracleCategoryDisplay(json.Display ?? {}, this.Name);
    this.Category = category ?? undefined;
    this["Sample Names"] = json["Sample Names"];
    if (json.Usage) {
      this.Usage = new OracleUsage(json.Usage);
    }
    if (json.Oracles) {
      this.Oracles = json.Oracles.map(oracleInfo => {
        if (json.Usage) {
          propagateToChildren(json.Usage, "Usage", oracleInfo);
        }
        if (json.Requires) {
          propagateToChildren(json.Requires, "Requires", oracleInfo);
        }
        return new Oracle(oracleInfo, this.$id, undefined, json, ...ancestorsJson);
      });
    }
    if (json.Categories) {
      this.Categories = json.Categories.map(
        oracleCat => {
          if (json.Usage) {
            propagateToChildren(json.Usage, "Usage", oracleCat);
          }
          if (json.Requires) {
            propagateToChildren(json.Requires, "Requires", oracleCat);
          }
          return new OracleCategory(oracleCat, this.$id as OracleCategoryJaggedId, json, ...ancestorsJson);
        }
      );
    }
  }
}