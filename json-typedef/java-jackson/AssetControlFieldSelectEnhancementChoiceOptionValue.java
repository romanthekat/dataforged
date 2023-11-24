// Code generated by jtd-codegen for Java + Jackson v0.2.1

package Datasworn;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.List;

/**
 * The current value of this input.
 */
@JsonSerialize
public class AssetControlFieldSelectEnhancementChoiceOptionValue {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("enhance_asset")
    private AssetEnhancement enhanceAsset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("enhance_moves")
    private List<MoveEnhancement> enhanceMoves;

    public AssetControlFieldSelectEnhancementChoiceOptionValue() {
    }

    /**
     * Getter for enhanceAsset.<p>
     */
    public AssetEnhancement getEnhanceAsset() {
        return enhanceAsset;
    }

    /**
     * Setter for enhanceAsset.<p>
     */
    public void setEnhanceAsset(AssetEnhancement enhanceAsset) {
        this.enhanceAsset = enhanceAsset;
    }

    /**
     * Getter for enhanceMoves.<p>
     */
    public List<MoveEnhancement> getEnhanceMoves() {
        return enhanceMoves;
    }

    /**
     * Setter for enhanceMoves.<p>
     */
    public void setEnhanceMoves(List<MoveEnhancement> enhanceMoves) {
        this.enhanceMoves = enhanceMoves;
    }
}