import type { GameObjectRecord } from "@game_objects/index.js";
import type { ISuggestions } from "@json_out/index.js";
import type { YamlStub, YamlStubTitle } from "@yaml_in/index.js";

/**
 * @internal
 */
export interface ISuggestionsYaml extends YamlStub<ISuggestions, "Game objects"> {
  "Game objects"?: GameObjectRecord[] | undefined;
}
