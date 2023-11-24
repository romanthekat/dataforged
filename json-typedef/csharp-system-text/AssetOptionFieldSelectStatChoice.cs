// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System;
using System.Text.Json;
using System.Text.Json.Serialization;

namespace Datasworn
{
    [JsonConverter(typeof(AssetOptionFieldSelectStatChoiceJsonConverter))]
    public abstract class AssetOptionFieldSelectStatChoice
    {
    }

    public class AssetOptionFieldSelectStatChoiceJsonConverter : JsonConverter<AssetOptionFieldSelectStatChoice>
    {
        public override AssetOptionFieldSelectStatChoice Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
        {
            var readerCopy = reader;
            var tagValue = JsonDocument.ParseValue(ref reader).RootElement.GetProperty("option_type").GetString();

            switch (tagValue)
            {
                case "option":
                    return JsonSerializer.Deserialize<AssetOptionFieldSelectStatChoiceOption>(ref readerCopy, options);
                case "option_group":
                    return JsonSerializer.Deserialize<AssetOptionFieldSelectStatChoiceOptionGroup>(ref readerCopy, options);
                default:
                    throw new ArgumentException(String.Format("Bad OptionType value: {0}", tagValue));
            }
        }

        public override void Write(Utf8JsonWriter writer, AssetOptionFieldSelectStatChoice value, JsonSerializerOptions options)
        {
            JsonSerializer.Serialize(writer, value, value.GetType(), options);
        }
    }
}