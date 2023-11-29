// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Datasworn
{
    /// <summary>
    /// A delve site Domain card.
    /// </summary>
    public class DelveSiteDomain
    {
        [JsonPropertyName("dangers")]
        public IList<DelveSiteDomainDangerRow> Dangers { get; set; }

        [JsonPropertyName("features")]
        public IList<DelveSiteDomainFeatureRow> Features { get; set; }

        /// <summary>
        /// The unique Datasworn ID for this item.
        /// </summary>
        [JsonPropertyName("id")]
        public DelveSiteDomainId Id { get; set; }

        /// <summary>
        /// The primary name/label for this item.
        /// </summary>
        [JsonPropertyName("name")]
        public Label Name { get; set; }

        /// <summary>
        /// Attribution for the original source (such as a book or website) of
        /// this item, including the author and licensing information.
        /// </summary>
        [JsonPropertyName("source")]
        public Source Source { get; set; }

        [JsonPropertyName("summary")]
        public MarkdownString Summary { get; set; }

        /// <summary>
        /// The name of this item as it appears on the page in the book, if it's
        /// different from `name`.
        /// </summary>
        [JsonPropertyName("canonical_name")]
        [JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)]
        public Label? CanonicalName { get; set; }

        [JsonPropertyName("description")]
        [JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)]
        public MarkdownString? Description { get; set; }

        [JsonPropertyName("icon")]
        [JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)]
        public SvgImageUrl? Icon { get; set; }

        /// <summary>
        /// An oracle table ID containing place name elements. For examples, see
        /// oracle ID `delve/oracles/site_name/place/barrow`, and its siblings
        /// in oracle collection ID `delve/collections/oracles/site_name/place`.
        /// These oracles are used by the site name oracle from Ironsworn: Delve
        /// (ID: delve/oracles/site_name/format) to create random names for
        /// delve sites.
        /// </summary>
        [JsonPropertyName("name_oracle")]
        [JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)]
        public OracleTableId? NameOracle { get; set; }

        [JsonPropertyName("suggestions")]
        [JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)]
        public Suggestions? Suggestions { get; set; }
    }
}
