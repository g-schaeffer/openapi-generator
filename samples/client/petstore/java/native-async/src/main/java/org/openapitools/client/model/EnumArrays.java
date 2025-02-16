/*
 * Generation info:
 *   - generator version: 6.6.5-amadeus
 *   - datetime: 2024-02-23T13:46:40.337Z[UTC]
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

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * EnumArrays
 */
@JsonPropertyOrder({
  EnumArrays.JSON_PROPERTY_JUST_SYMBOL,
  EnumArrays.JSON_PROPERTY_ARRAY_ENUM
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EnumArrays {
  /**
   * Gets or Sets justSymbol
   */
  public enum JustSymbol {
    GREATER_THAN_OR_EQUAL_TO(">="),
    
    DOLLAR("$");

    private String value;

    JustSymbol(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static JustSymbol fromValue(String value) {
      for (JustSymbol b : JustSymbol.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_JUST_SYMBOL = "just_symbol";
  private JustSymbol justSymbol;

  /**
   * Gets or Sets arrayEnum
   */
  public enum ArrayEnum {
    FISH("fish"),
    
    CRAB("crab");

    private String value;

    ArrayEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ArrayEnum fromValue(String value) {
      for (ArrayEnum b : ArrayEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ARRAY_ENUM = "array_enum";
  private List<ArrayEnum> arrayEnum;

  public EnumArrays() { 
  }

  public EnumArrays justSymbol(JustSymbol justSymbol) {
    this.justSymbol = justSymbol;
    return this;
  }

   /**
   * Get justSymbol
   * @return justSymbol
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_JUST_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JustSymbol getJustSymbol() {
    return justSymbol;
  }


  @JsonProperty(JSON_PROPERTY_JUST_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setJustSymbol(JustSymbol justSymbol) {
    this.justSymbol = justSymbol;
  }


  public EnumArrays arrayEnum(List<ArrayEnum> arrayEnum) {
    this.arrayEnum = arrayEnum;
    return this;
  }

  public EnumArrays addArrayEnumItem(ArrayEnum arrayEnumItem) {
    if (this.arrayEnum == null) {
      this.arrayEnum = new ArrayList<>();
    }
    this.arrayEnum.add(arrayEnumItem);
    return this;
  }

   /**
   * Get arrayEnum
   * @return arrayEnum
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ARRAY_ENUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ArrayEnum> getArrayEnum() {
    return arrayEnum;
  }


  @JsonProperty(JSON_PROPERTY_ARRAY_ENUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArrayEnum(List<ArrayEnum> arrayEnum) {
    this.arrayEnum = arrayEnum;
  }


  /**
   * Return true if this EnumArrays object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnumArrays enumArrays = (EnumArrays) o;
    return Objects.equals(this.justSymbol, enumArrays.justSymbol) &&
        Objects.equals(this.arrayEnum, enumArrays.arrayEnum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(justSymbol, arrayEnum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnumArrays {\n");
    sb.append("    justSymbol: ").append(toIndentedString(justSymbol)).append("\n");
    sb.append("    arrayEnum: ").append(toIndentedString(arrayEnum)).append("\n");
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

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `just_symbol` to the URL query string
    if (getJustSymbol() != null) {
      joiner.add(String.format("%sjust_symbol%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getJustSymbol()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `array_enum` to the URL query string
    if (getArrayEnum() != null) {
      for (int i = 0; i < getArrayEnum().size(); i++) {
        joiner.add(String.format("%sarray_enum%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(String.valueOf(getArrayEnum().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    return joiner.toString();
  }
}

