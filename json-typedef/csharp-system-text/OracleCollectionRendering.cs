// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Datasworn
{
    public class OracleCollectionRendering
    {
        [JsonPropertyName("columns")]
        public IDictionary<string, OracleCollectionTableColumn> Columns { get; set; }

        [JsonPropertyName("color")]
        [JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)]
        public CssColor? Color { get; set; }

        [JsonPropertyName("table_style")]
        [JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)]
        public OracleCollectionStyle? TableStyle { get; set; }
    }
}