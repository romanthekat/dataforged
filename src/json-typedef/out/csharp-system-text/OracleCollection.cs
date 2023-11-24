// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Datasworn
{
    public class OracleCollection
    {
        [JsonPropertyName("collections")]
        public IDictionary<string, OracleCollection> Collections { get; set; }

        [JsonPropertyName("contents")]
        public IDictionary<string, OracleTable> Contents { get; set; }

        [JsonPropertyName("id")]
        public OracleCollectionId Id { get; set; }

        [JsonPropertyName("name")]
        public Label Name { get; set; }

        [JsonPropertyName("source")]
        public Source Source { get; set; }

        [JsonPropertyName("canonical_name")]
        [JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)]
        public Label? CanonicalName { get; set; }

        [JsonPropertyName("color")]
        [JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)]
        public Csscolor? Color { get; set; }

        [JsonPropertyName("description")]
        [JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)]
        public MarkdownString? Description { get; set; }

        /// <summary>
        /// This collection's content enhances the identified collection, rather
        /// than being a standalone collection of its own.
        /// </summary>
        [JsonPropertyName("enhances")]
        [JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)]
        public OracleCollectionId? Enhances { get; set; }

        [JsonPropertyName("icon")]
        [JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)]
        public SvgimageUrl? Icon { get; set; }

        [JsonPropertyName("images")]
        [JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)]
        public IList<WebpimageUrl> Images { get; set; }

        [JsonPropertyName("rendering")]
        [JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)]
        public OracleCollectionRendering? Rendering { get; set; }

        /// <summary>
        /// This collection replaces the identified collection. References
        /// to the replaced collection can be considered equivalent to this
        /// collection.
        /// </summary>
        [JsonPropertyName("replaces")]
        [JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)]
        public OracleCollectionId? Replaces { get; set; }

        [JsonPropertyName("suggestions")]
        [JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)]
        public Suggestions? Suggestions { get; set; }

        [JsonPropertyName("summary")]
        [JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)]
        public MarkdownString? Summary { get; set; }
    }
}
