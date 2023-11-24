// Code generated by jtd-codegen for Java + Jackson v0.2.1

package Datasworn;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Map;

/**
 * Describes game rules compatible with the Ironsworn tabletop role-playing game
 * by Shawn Tomkin.
 */
@JsonSerialize
public class Ruleset {
    @JsonProperty("id")
    private NamespaceId id;

    @JsonProperty("source")
    private Source source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("assets")
    private Map<String, AssetType> assets;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("atlas")
    private Map<String, Atlas> atlas;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("delve_sites")
    private Map<String, DelveSite> delveSites;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("moves")
    private Map<String, MoveCategory> moves;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("npcs")
    private Map<String, NpcCollection> npcs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("oracles")
    private Map<String, OracleCollection> oracles;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("rarities")
    private Map<String, Rarity> rarities;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("rules")
    private Rules rules;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("site_domains")
    private Map<String, DelveSiteDomain> siteDomains;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("site_themes")
    private Map<String, DelveSiteTheme> siteThemes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("truths")
    private Map<String, Truth> truths;

    public Ruleset() {
    }

    /**
     * Getter for id.<p>
     */
    public NamespaceId getId() {
        return id;
    }

    /**
     * Setter for id.<p>
     */
    public void setId(NamespaceId id) {
        this.id = id;
    }

    /**
     * Getter for source.<p>
     */
    public Source getSource() {
        return source;
    }

    /**
     * Setter for source.<p>
     */
    public void setSource(Source source) {
        this.source = source;
    }

    /**
     * Getter for assets.<p>
     * A dictionary object containing asset types, which contain assets.
     */
    public Map<String, AssetType> getAssets() {
        return assets;
    }

    /**
     * Setter for assets.<p>
     * A dictionary object containing asset types, which contain assets.
     */
    public void setAssets(Map<String, AssetType> assets) {
        this.assets = assets;
    }

    /**
     * Getter for atlas.<p>
     * A dictionary object containing atlas collections, which contain atlas
     * entries.
     */
    public Map<String, Atlas> getAtlas() {
        return atlas;
    }

    /**
     * Setter for atlas.<p>
     * A dictionary object containing atlas collections, which contain atlas
     * entries.
     */
    public void setAtlas(Map<String, Atlas> atlas) {
        this.atlas = atlas;
    }

    /**
     * Getter for delveSites.<p>
     * A dictionary object of delve sites, like the premade delve sites
     * presented in Ironsworn: Delve
     */
    public Map<String, DelveSite> getDelveSites() {
        return delveSites;
    }

    /**
     * Setter for delveSites.<p>
     * A dictionary object of delve sites, like the premade delve sites
     * presented in Ironsworn: Delve
     */
    public void setDelveSites(Map<String, DelveSite> delveSites) {
        this.delveSites = delveSites;
    }

    /**
     * Getter for moves.<p>
     * A dictionary object containing move categories, which contain moves.
     */
    public Map<String, MoveCategory> getMoves() {
        return moves;
    }

    /**
     * Setter for moves.<p>
     * A dictionary object containing move categories, which contain moves.
     */
    public void setMoves(Map<String, MoveCategory> moves) {
        this.moves = moves;
    }

    /**
     * Getter for npcs.<p>
     * A dictionary object containing NPC collections, which contain NPCs.
     */
    public Map<String, NpcCollection> getNpcs() {
        return npcs;
    }

    /**
     * Setter for npcs.<p>
     * A dictionary object containing NPC collections, which contain NPCs.
     */
    public void setNpcs(Map<String, NpcCollection> npcs) {
        this.npcs = npcs;
    }

    /**
     * Getter for oracles.<p>
     * A dictionary object containing oracle collections, which may contain
     * oracle tables and/or oracle collections.
     */
    public Map<String, OracleCollection> getOracles() {
        return oracles;
    }

    /**
     * Setter for oracles.<p>
     * A dictionary object containing oracle collections, which may contain
     * oracle tables and/or oracle collections.
     */
    public void setOracles(Map<String, OracleCollection> oracles) {
        this.oracles = oracles;
    }

    /**
     * Getter for rarities.<p>
     * A dictionary object containing rarities, like those presented in
     * Ironsworn: Delve.
     */
    public Map<String, Rarity> getRarities() {
        return rarities;
    }

    /**
     * Setter for rarities.<p>
     * A dictionary object containing rarities, like those presented in
     * Ironsworn: Delve.
     */
    public void setRarities(Map<String, Rarity> rarities) {
        this.rarities = rarities;
    }

    /**
     * Getter for rules.<p>
     */
    public Rules getRules() {
        return rules;
    }

    /**
     * Setter for rules.<p>
     */
    public void setRules(Rules rules) {
        this.rules = rules;
    }

    /**
     * Getter for siteDomains.<p>
     * A dictionary object containing delve site domains.
     */
    public Map<String, DelveSiteDomain> getSiteDomains() {
        return siteDomains;
    }

    /**
     * Setter for siteDomains.<p>
     * A dictionary object containing delve site domains.
     */
    public void setSiteDomains(Map<String, DelveSiteDomain> siteDomains) {
        this.siteDomains = siteDomains;
    }

    /**
     * Getter for siteThemes.<p>
     * A dictionary object containing delve site themes.
     */
    public Map<String, DelveSiteTheme> getSiteThemes() {
        return siteThemes;
    }

    /**
     * Setter for siteThemes.<p>
     * A dictionary object containing delve site themes.
     */
    public void setSiteThemes(Map<String, DelveSiteTheme> siteThemes) {
        this.siteThemes = siteThemes;
    }

    /**
     * Getter for truths.<p>
     * A dictionary object of truth categories.
     */
    public Map<String, Truth> getTruths() {
        return truths;
    }

    /**
     * Setter for truths.<p>
     * A dictionary object of truth categories.
     */
    public void setTruths(Map<String, Truth> truths) {
        this.truths = truths;
    }
}