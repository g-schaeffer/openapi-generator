/*
 * Generation info:
 *   - generator version: 6.6.5-amadeus
 *   - datetime: 2024-02-23T13:46:39.094Z[UTC]
 *
 * Echo Server API
 * Echo Server API
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: team@openapitools.org
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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.StringEnumRef;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * to test the default value of properties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DefaultValue {
  public static final String SERIALIZED_NAME_ARRAY_STRING_ENUM_REF_DEFAULT = "array_string_enum_ref_default";
  @SerializedName(SERIALIZED_NAME_ARRAY_STRING_ENUM_REF_DEFAULT)
  private List<StringEnumRef> arrayStringEnumRefDefault = new ArrayList<>(Arrays.asList(StringEnumRef.SUCCESS, StringEnumRef.FAILURE));

  /**
   * Gets or Sets arrayStringEnumDefault
   */
  @JsonAdapter(ArrayStringEnumDefault.Adapter.class)
  public enum ArrayStringEnumDefault {
    SUCCESS("success"),
    
    FAILURE("failure"),
    
    UNCLASSIFIED("unclassified");

    private String value;

    ArrayStringEnumDefault(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ArrayStringEnumDefault fromValue(String value) {
      for (ArrayStringEnumDefault b : ArrayStringEnumDefault.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ArrayStringEnumDefault> {
      @Override
      public void write(final JsonWriter jsonWriter, final ArrayStringEnumDefault enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ArrayStringEnumDefault read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ArrayStringEnumDefault.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ARRAY_STRING_ENUM_DEFAULT = "array_string_enum_default";
  @SerializedName(SERIALIZED_NAME_ARRAY_STRING_ENUM_DEFAULT)
  private List<ArrayStringEnumDefault> arrayStringEnumDefault = new ArrayList<>(Arrays.asList(ArrayStringEnumDefault.SUCCESS, ArrayStringEnumDefault.FAILURE));

  public static final String SERIALIZED_NAME_ARRAY_STRING_DEFAULT = "array_string_default";
  @SerializedName(SERIALIZED_NAME_ARRAY_STRING_DEFAULT)
  private List<String> arrayStringDefault = new ArrayList<>(Arrays.asList("failure", "skipped"));

  public static final String SERIALIZED_NAME_ARRAY_INTEGER_DEFAULT = "array_integer_default";
  @SerializedName(SERIALIZED_NAME_ARRAY_INTEGER_DEFAULT)
  private List<Integer> arrayIntegerDefault = new ArrayList<>(Arrays.asList(1, 3));

  public static final String SERIALIZED_NAME_ARRAY_STRING = "array_string";
  @SerializedName(SERIALIZED_NAME_ARRAY_STRING)
  private List<String> arrayString;

  public static final String SERIALIZED_NAME_ARRAY_STRING_NULLABLE = "array_string_nullable";
  @SerializedName(SERIALIZED_NAME_ARRAY_STRING_NULLABLE)
  private List<String> arrayStringNullable;

  public static final String SERIALIZED_NAME_ARRAY_STRING_EXTENSION_NULLABLE = "array_string_extension_nullable";
  @SerializedName(SERIALIZED_NAME_ARRAY_STRING_EXTENSION_NULLABLE)
  private List<String> arrayStringExtensionNullable;

  public static final String SERIALIZED_NAME_STRING_NULLABLE = "string_nullable";
  @SerializedName(SERIALIZED_NAME_STRING_NULLABLE)
  private String stringNullable;

  public DefaultValue() {
  }

  public DefaultValue arrayStringEnumRefDefault(List<StringEnumRef> arrayStringEnumRefDefault) {
    
    this.arrayStringEnumRefDefault = arrayStringEnumRefDefault;
    return this;
  }

  public DefaultValue addArrayStringEnumRefDefaultItem(StringEnumRef arrayStringEnumRefDefaultItem) {
    if (this.arrayStringEnumRefDefault == null) {
      this.arrayStringEnumRefDefault = new ArrayList<>(Arrays.asList(StringEnumRef.SUCCESS, StringEnumRef.FAILURE));
    }
    this.arrayStringEnumRefDefault.add(arrayStringEnumRefDefaultItem);
    return this;
  }

   /**
   * Get arrayStringEnumRefDefault
   * @return arrayStringEnumRefDefault
  **/
  @javax.annotation.Nullable

  public List<StringEnumRef> getArrayStringEnumRefDefault() {
    return arrayStringEnumRefDefault;
  }


  public void setArrayStringEnumRefDefault(List<StringEnumRef> arrayStringEnumRefDefault) {
    this.arrayStringEnumRefDefault = arrayStringEnumRefDefault;
  }


  public DefaultValue arrayStringEnumDefault(List<ArrayStringEnumDefault> arrayStringEnumDefault) {
    
    this.arrayStringEnumDefault = arrayStringEnumDefault;
    return this;
  }

  public DefaultValue addArrayStringEnumDefaultItem(ArrayStringEnumDefault arrayStringEnumDefaultItem) {
    if (this.arrayStringEnumDefault == null) {
      this.arrayStringEnumDefault = new ArrayList<>(Arrays.asList(ArrayStringEnumDefault.SUCCESS, ArrayStringEnumDefault.FAILURE));
    }
    this.arrayStringEnumDefault.add(arrayStringEnumDefaultItem);
    return this;
  }

   /**
   * Get arrayStringEnumDefault
   * @return arrayStringEnumDefault
  **/
  @javax.annotation.Nullable

  public List<ArrayStringEnumDefault> getArrayStringEnumDefault() {
    return arrayStringEnumDefault;
  }


  public void setArrayStringEnumDefault(List<ArrayStringEnumDefault> arrayStringEnumDefault) {
    this.arrayStringEnumDefault = arrayStringEnumDefault;
  }


  public DefaultValue arrayStringDefault(List<String> arrayStringDefault) {
    
    this.arrayStringDefault = arrayStringDefault;
    return this;
  }

  public DefaultValue addArrayStringDefaultItem(String arrayStringDefaultItem) {
    if (this.arrayStringDefault == null) {
      this.arrayStringDefault = new ArrayList<>(Arrays.asList("failure", "skipped"));
    }
    this.arrayStringDefault.add(arrayStringDefaultItem);
    return this;
  }

   /**
   * Get arrayStringDefault
   * @return arrayStringDefault
  **/
  @javax.annotation.Nullable

  public List<String> getArrayStringDefault() {
    return arrayStringDefault;
  }


  public void setArrayStringDefault(List<String> arrayStringDefault) {
    this.arrayStringDefault = arrayStringDefault;
  }


  public DefaultValue arrayIntegerDefault(List<Integer> arrayIntegerDefault) {
    
    this.arrayIntegerDefault = arrayIntegerDefault;
    return this;
  }

  public DefaultValue addArrayIntegerDefaultItem(Integer arrayIntegerDefaultItem) {
    if (this.arrayIntegerDefault == null) {
      this.arrayIntegerDefault = new ArrayList<>(Arrays.asList(1, 3));
    }
    this.arrayIntegerDefault.add(arrayIntegerDefaultItem);
    return this;
  }

   /**
   * Get arrayIntegerDefault
   * @return arrayIntegerDefault
  **/
  @javax.annotation.Nullable

  public List<Integer> getArrayIntegerDefault() {
    return arrayIntegerDefault;
  }


  public void setArrayIntegerDefault(List<Integer> arrayIntegerDefault) {
    this.arrayIntegerDefault = arrayIntegerDefault;
  }


  public DefaultValue arrayString(List<String> arrayString) {
    
    this.arrayString = arrayString;
    return this;
  }

  public DefaultValue addArrayStringItem(String arrayStringItem) {
    if (this.arrayString == null) {
      this.arrayString = new ArrayList<>();
    }
    this.arrayString.add(arrayStringItem);
    return this;
  }

   /**
   * Get arrayString
   * @return arrayString
  **/
  @javax.annotation.Nullable

  public List<String> getArrayString() {
    return arrayString;
  }


  public void setArrayString(List<String> arrayString) {
    this.arrayString = arrayString;
  }


  public DefaultValue arrayStringNullable(List<String> arrayStringNullable) {
    
    this.arrayStringNullable = arrayStringNullable;
    return this;
  }

  public DefaultValue addArrayStringNullableItem(String arrayStringNullableItem) {
    if (this.arrayStringNullable == null) {
      this.arrayStringNullable = new ArrayList<>();
    }
    this.arrayStringNullable.add(arrayStringNullableItem);
    return this;
  }

   /**
   * Get arrayStringNullable
   * @return arrayStringNullable
  **/
  @javax.annotation.Nullable

  public List<String> getArrayStringNullable() {
    return arrayStringNullable;
  }


  public void setArrayStringNullable(List<String> arrayStringNullable) {
    this.arrayStringNullable = arrayStringNullable;
  }


  public DefaultValue arrayStringExtensionNullable(List<String> arrayStringExtensionNullable) {
    
    this.arrayStringExtensionNullable = arrayStringExtensionNullable;
    return this;
  }

  public DefaultValue addArrayStringExtensionNullableItem(String arrayStringExtensionNullableItem) {
    if (this.arrayStringExtensionNullable == null) {
      this.arrayStringExtensionNullable = new ArrayList<>();
    }
    this.arrayStringExtensionNullable.add(arrayStringExtensionNullableItem);
    return this;
  }

   /**
   * Get arrayStringExtensionNullable
   * @return arrayStringExtensionNullable
  **/
  @javax.annotation.Nullable

  public List<String> getArrayStringExtensionNullable() {
    return arrayStringExtensionNullable;
  }


  public void setArrayStringExtensionNullable(List<String> arrayStringExtensionNullable) {
    this.arrayStringExtensionNullable = arrayStringExtensionNullable;
  }


  public DefaultValue stringNullable(String stringNullable) {
    
    this.stringNullable = stringNullable;
    return this;
  }

   /**
   * Get stringNullable
   * @return stringNullable
  **/
  @javax.annotation.Nullable

  public String getStringNullable() {
    return stringNullable;
  }


  public void setStringNullable(String stringNullable) {
    this.stringNullable = stringNullable;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DefaultValue defaultValue = (DefaultValue) o;
    return Objects.equals(this.arrayStringEnumRefDefault, defaultValue.arrayStringEnumRefDefault) &&
        Objects.equals(this.arrayStringEnumDefault, defaultValue.arrayStringEnumDefault) &&
        Objects.equals(this.arrayStringDefault, defaultValue.arrayStringDefault) &&
        Objects.equals(this.arrayIntegerDefault, defaultValue.arrayIntegerDefault) &&
        Objects.equals(this.arrayString, defaultValue.arrayString) &&
        Objects.equals(this.arrayStringNullable, defaultValue.arrayStringNullable) &&
        Objects.equals(this.arrayStringExtensionNullable, defaultValue.arrayStringExtensionNullable) &&
        Objects.equals(this.stringNullable, defaultValue.stringNullable);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(arrayStringEnumRefDefault, arrayStringEnumDefault, arrayStringDefault, arrayIntegerDefault, arrayString, arrayStringNullable, arrayStringExtensionNullable, stringNullable);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefaultValue {\n");
    sb.append("    arrayStringEnumRefDefault: ").append(toIndentedString(arrayStringEnumRefDefault)).append("\n");
    sb.append("    arrayStringEnumDefault: ").append(toIndentedString(arrayStringEnumDefault)).append("\n");
    sb.append("    arrayStringDefault: ").append(toIndentedString(arrayStringDefault)).append("\n");
    sb.append("    arrayIntegerDefault: ").append(toIndentedString(arrayIntegerDefault)).append("\n");
    sb.append("    arrayString: ").append(toIndentedString(arrayString)).append("\n");
    sb.append("    arrayStringNullable: ").append(toIndentedString(arrayStringNullable)).append("\n");
    sb.append("    arrayStringExtensionNullable: ").append(toIndentedString(arrayStringExtensionNullable)).append("\n");
    sb.append("    stringNullable: ").append(toIndentedString(stringNullable)).append("\n");
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

}

