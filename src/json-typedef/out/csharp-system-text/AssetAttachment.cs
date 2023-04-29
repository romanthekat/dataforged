// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Dataforged
{
    /// <summary>
    /// Describes which assets can be attached to this asset. The "canonical"
    /// example for this are Starforged's Module assets, which can be equipped
    /// by Command Vehicle assets. See p. 55 of Starforged for more info.
    /// </summary>
    public class AssetAttachment
    {
        [JsonPropertyName("assets")]
        public IList<AssetIdwildcard> Assets { get; set; }

        /// <summary>
        /// The maximum number of attached assets. Omitted if there's no upper
        /// limit to the number of attached assets.
        /// </summary>
        [JsonPropertyName("max")]
        [JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)]
        public byte? Max { get; set; }
    }
}