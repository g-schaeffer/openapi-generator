/*
 * Generation info:
 *   - generator version: 6.6.5-amadeus
 *   - datetime: 2024-02-23T13:46:40.850Z[UTC]
 *
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import org.openapitools.client.model.OuterEnum;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * EnumTest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EnumTest {
  /**
   * Gets or Sets enumString
   */
  @JsonAdapter(EnumString.Adapter.class)
  public enum EnumString {
    UPPER("UPPER"),
    
    LOWER("lower"),
    
    EMPTY("");

    private String value;

    EnumString(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EnumString fromValue(String value) {
      for (EnumString b : EnumString.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EnumString> {
      @Override
      public void write(final JsonWriter jsonWriter, final EnumString enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EnumString read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EnumString.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ENUM_STRING = "enum_string";
  @SerializedName(SERIALIZED_NAME_ENUM_STRING)
  private EnumString enumString;

  /**
   * Gets or Sets enumStringRequired
   */
  @JsonAdapter(EnumStringRequired.Adapter.class)
  public enum EnumStringRequired {
    UPPER("UPPER"),
    
    LOWER("lower"),
    
    EMPTY("");

    private String value;

    EnumStringRequired(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EnumStringRequired fromValue(String value) {
      for (EnumStringRequired b : EnumStringRequired.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EnumStringRequired> {
      @Override
      public void write(final JsonWriter jsonWriter, final EnumStringRequired enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EnumStringRequired read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EnumStringRequired.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ENUM_STRING_REQUIRED = "enum_string_required";
  @SerializedName(SERIALIZED_NAME_ENUM_STRING_REQUIRED)
  private EnumStringRequired enumStringRequired;

  /**
   * Gets or Sets enumInteger
   */
  @JsonAdapter(EnumInteger.Adapter.class)
  public enum EnumInteger {
    NUMBER_1(1),
    
    NUMBER_MINUS_1(-1);

    private Integer value;

    EnumInteger(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EnumInteger fromValue(Integer value) {
      for (EnumInteger b : EnumInteger.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EnumInteger> {
      @Override
      public void write(final JsonWriter jsonWriter, final EnumInteger enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EnumInteger read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return EnumInteger.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ENUM_INTEGER = "enum_integer";
  @SerializedName(SERIALIZED_NAME_ENUM_INTEGER)
  private EnumInteger enumInteger;

  /**
   * Gets or Sets enumNumber
   */
  @JsonAdapter(EnumNumber.Adapter.class)
  public enum EnumNumber {
    NUMBER_1_DOT_1(1.1),
    
    NUMBER_MINUS_1_DOT_2(-1.2);

    private Double value;

    EnumNumber(Double value) {
      this.value = value;
    }

    public Double getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EnumNumber fromValue(Double value) {
      for (EnumNumber b : EnumNumber.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EnumNumber> {
      @Override
      public void write(final JsonWriter jsonWriter, final EnumNumber enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EnumNumber read(final JsonReader jsonReader) throws IOException {
        Double value =  jsonReader.nextDouble();
        return EnumNumber.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ENUM_NUMBER = "enum_number";
  @SerializedName(SERIALIZED_NAME_ENUM_NUMBER)
  private EnumNumber enumNumber;

  public static final String SERIALIZED_NAME_OUTER_ENUM = "outerEnum";
  @SerializedName(SERIALIZED_NAME_OUTER_ENUM)
  private OuterEnum outerEnum;

  public EnumTest() {
  }

  public EnumTest enumString(EnumString enumString) {
    
    this.enumString = enumString;
    return this;
  }

   /**
   * Get enumString
   * @return enumString
  **/
  @javax.annotation.Nullable
  public EnumString getEnumString() {
    return enumString;
  }


  public void setEnumString(EnumString enumString) {
    this.enumString = enumString;
  }


  public EnumTest enumStringRequired(EnumStringRequired enumStringRequired) {
    
    this.enumStringRequired = enumStringRequired;
    return this;
  }

   /**
   * Get enumStringRequired
   * @return enumStringRequired
  **/
  @javax.annotation.Nonnull
  public EnumStringRequired getEnumStringRequired() {
    return enumStringRequired;
  }


  public void setEnumStringRequired(EnumStringRequired enumStringRequired) {
    this.enumStringRequired = enumStringRequired;
  }


  public EnumTest enumInteger(EnumInteger enumInteger) {
    
    this.enumInteger = enumInteger;
    return this;
  }

   /**
   * Get enumInteger
   * @return enumInteger
  **/
  @javax.annotation.Nullable
  public EnumInteger getEnumInteger() {
    return enumInteger;
  }


  public void setEnumInteger(EnumInteger enumInteger) {
    this.enumInteger = enumInteger;
  }


  public EnumTest enumNumber(EnumNumber enumNumber) {
    
    this.enumNumber = enumNumber;
    return this;
  }

   /**
   * Get enumNumber
   * @return enumNumber
  **/
  @javax.annotation.Nullable
  public EnumNumber getEnumNumber() {
    return enumNumber;
  }


  public void setEnumNumber(EnumNumber enumNumber) {
    this.enumNumber = enumNumber;
  }


  public EnumTest outerEnum(OuterEnum outerEnum) {
    
    this.outerEnum = outerEnum;
    return this;
  }

   /**
   * Get outerEnum
   * @return outerEnum
  **/
  @javax.annotation.Nullable
  public OuterEnum getOuterEnum() {
    return outerEnum;
  }


  public void setOuterEnum(OuterEnum outerEnum) {
    this.outerEnum = outerEnum;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnumTest enumTest = (EnumTest) o;
    return Objects.equals(this.enumString, enumTest.enumString) &&
        Objects.equals(this.enumStringRequired, enumTest.enumStringRequired) &&
        Objects.equals(this.enumInteger, enumTest.enumInteger) &&
        Objects.equals(this.enumNumber, enumTest.enumNumber) &&
        Objects.equals(this.outerEnum, enumTest.outerEnum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enumString, enumStringRequired, enumInteger, enumNumber, outerEnum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnumTest {\n");
    sb.append("    enumString: ").append(toIndentedString(enumString)).append("\n");
    sb.append("    enumStringRequired: ").append(toIndentedString(enumStringRequired)).append("\n");
    sb.append("    enumInteger: ").append(toIndentedString(enumInteger)).append("\n");
    sb.append("    enumNumber: ").append(toIndentedString(enumNumber)).append("\n");
    sb.append("    outerEnum: ").append(toIndentedString(outerEnum)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("enum_string");
    openapiFields.add("enum_string_required");
    openapiFields.add("enum_integer");
    openapiFields.add("enum_number");
    openapiFields.add("outerEnum");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("enum_string_required");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EnumTest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EnumTest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EnumTest is not found in the empty JSON string", EnumTest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EnumTest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EnumTest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EnumTest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("enum_string") != null && !jsonObj.get("enum_string").isJsonNull()) && !jsonObj.get("enum_string").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enum_string` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enum_string").toString()));
      }
      if (!jsonObj.get("enum_string_required").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enum_string_required` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enum_string_required").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnumTest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnumTest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnumTest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnumTest.class));

       return (TypeAdapter<T>) new TypeAdapter<EnumTest>() {
           @Override
           public void write(JsonWriter out, EnumTest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EnumTest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EnumTest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EnumTest
  * @throws IOException if the JSON string is invalid with respect to EnumTest
  */
  public static EnumTest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnumTest.class);
  }

 /**
  * Convert an instance of EnumTest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

