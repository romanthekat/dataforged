// Code generated by jtd-codegen for Java + Jackson v0.2.1

package Datasworn;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.List;

@JsonSerialize
public class DelveSiteDomain {
    @JsonProperty("card_type")
    private DelveSiteDomainCardType cardType;

    @JsonProperty("dangers")
    private List<DelveSiteDomainDangerRow> dangers;

    @JsonProperty("features")
    private List<DelveSiteDomainFeatureRow> features;

    @JsonProperty("id")
    private DelveSiteDomainId id;

    @JsonProperty("name")
    private Label name;

    @JsonProperty("source")
    private Source source;

    @JsonProperty("summary")
    private MarkdownString summary;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("canonical_name")
    private Label canonicalName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("description")
    private MarkdownString description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("icon")
    private SvgImageUrl icon;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("name_oracle")
    private OracleTableId nameOracle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("suggestions")
    private Suggestions suggestions;

    public DelveSiteDomain() {
    }

    /**
     * Getter for cardType.<p>
     */
    public DelveSiteDomainCardType getCardType() {
        return cardType;
    }

    /**
     * Setter for cardType.<p>
     */
    public void setCardType(DelveSiteDomainCardType cardType) {
        this.cardType = cardType;
    }

    /**
     * Getter for dangers.<p>
     */
    public List<DelveSiteDomainDangerRow> getDangers() {
        return dangers;
    }

    /**
     * Setter for dangers.<p>
     */
    public void setDangers(List<DelveSiteDomainDangerRow> dangers) {
        this.dangers = dangers;
    }

    /**
     * Getter for features.<p>
     */
    public List<DelveSiteDomainFeatureRow> getFeatures() {
        return features;
    }

    /**
     * Setter for features.<p>
     */
    public void setFeatures(List<DelveSiteDomainFeatureRow> features) {
        this.features = features;
    }

    /**
     * Getter for id.<p>
     */
    public DelveSiteDomainId getId() {
        return id;
    }

    /**
     * Setter for id.<p>
     */
    public void setId(DelveSiteDomainId id) {
        this.id = id;
    }

    /**
     * Getter for name.<p>
     */
    public Label getName() {
        return name;
    }

    /**
     * Setter for name.<p>
     */
    public void setName(Label name) {
        this.name = name;
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
     * Getter for summary.<p>
     */
    public MarkdownString getSummary() {
        return summary;
    }

    /**
     * Setter for summary.<p>
     */
    public void setSummary(MarkdownString summary) {
        this.summary = summary;
    }

    /**
     * Getter for canonicalName.<p>
     */
    public Label getCanonicalName() {
        return canonicalName;
    }

    /**
     * Setter for canonicalName.<p>
     */
    public void setCanonicalName(Label canonicalName) {
        this.canonicalName = canonicalName;
    }

    /**
     * Getter for description.<p>
     */
    public MarkdownString getDescription() {
        return description;
    }

    /**
     * Setter for description.<p>
     */
    public void setDescription(MarkdownString description) {
        this.description = description;
    }

    /**
     * Getter for icon.<p>
     */
    public SvgImageUrl getIcon() {
        return icon;
    }

    /**
     * Setter for icon.<p>
     */
    public void setIcon(SvgImageUrl icon) {
        this.icon = icon;
    }

    /**
     * Getter for nameOracle.<p>
     * An oracle table ID containing place name elements. For examples, see
     * oracle ID `delve/oracles/site_name/place/barrow`, and its siblings in
     * oracle collection ID `delve/collections/oracles/site_name/place`. These
     * oracles are used by the site name oracle from Ironsworn: Delve (ID:
     * delve/oracles/site_name/format) to create random names for delve sites.
     */
    public OracleTableId getNameOracle() {
        return nameOracle;
    }

    /**
     * Setter for nameOracle.<p>
     * An oracle table ID containing place name elements. For examples, see
     * oracle ID `delve/oracles/site_name/place/barrow`, and its siblings in
     * oracle collection ID `delve/collections/oracles/site_name/place`. These
     * oracles are used by the site name oracle from Ironsworn: Delve (ID:
     * delve/oracles/site_name/format) to create random names for delve sites.
     */
    public void setNameOracle(OracleTableId nameOracle) {
        this.nameOracle = nameOracle;
    }

    /**
     * Getter for suggestions.<p>
     */
    public Suggestions getSuggestions() {
        return suggestions;
    }

    /**
     * Setter for suggestions.<p>
     */
    public void setSuggestions(Suggestions suggestions) {
        this.suggestions = suggestions;
    }
}