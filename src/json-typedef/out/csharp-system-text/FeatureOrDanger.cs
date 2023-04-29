// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Dataforged
{
    public class FeatureOrDanger
    {
        [JsonPropertyName("high")]
        public byte High { get; set; }

        [JsonPropertyName("id")]
        public Id Id { get; set; }

        [JsonPropertyName("low")]
        public byte Low { get; set; }

        [JsonPropertyName("result")]
        public MarkdownString Result { get; set; }

        [JsonPropertyName("description")]
        [JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)]
        public MarkdownString? Description { get; set; }

        [JsonPropertyName("embed_table")]
        [JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)]
        public Id? EmbedTable { get; set; }

        [JsonPropertyName("icon")]
        [JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)]
        public SvgImageUrl? Icon { get; set; }

        [JsonPropertyName("rolls")]
        [JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)]
        public IList<OracleTableRoll> Rolls { get; set; }

        [JsonPropertyName("suggestions")]
        [JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)]
        public Suggestions? Suggestions { get; set; }

        [JsonPropertyName("summary")]
        [JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)]
        public MarkdownString? Summary { get; set; }

        [JsonPropertyName("template")]
        [JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)]
        public OracleRollTemplate? Template { get; set; }
    }
}