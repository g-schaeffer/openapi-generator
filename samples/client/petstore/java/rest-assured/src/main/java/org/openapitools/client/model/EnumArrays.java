/*
 * Generation info:
 *   - generator version: 6.6.5-amadeus
 *   - datetime: 2024-02-23T13:46:43.438Z[UTC]
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
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * EnumArrays
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EnumArrays {
  /**
   * Gets or Sets justSymbol
   */
  @JsonAdapter(JustSymbol.Adapter.class)
  public enum JustSymbol {
    GREATER_THAN_OR_EQUAL_TO(">="),
    
    DOLLAR("$");

    private String value;

    JustSymbol(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static JustSymbol fromValue(String value) {
      for (JustSymbol b : JustSymbol.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<JustSymbol> {
      @Override
      public void write(final JsonWriter jsonWriter, final JustSymbol enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public JustSymbol read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return JustSymbol.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_JUST_SYMBOL = "just_symbol";
  @SerializedName(SERIALIZED_NAME_JUST_SYMBOL)
  private JustSymbol justSymbol;

  /**
   * Gets or Sets arrayEnum
   */
  @JsonAdapter(ArrayEnum.Adapter.class)
  public enum ArrayEnum {
    FISH("fish"),
    
    CRAB("crab");

    private String value;

    ArrayEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ArrayEnum fromValue(String value) {
      for (ArrayEnum b : ArrayEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ArrayEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ArrayEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ArrayEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ArrayEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ARRAY_ENUM = "array_enum";
  @SerializedName(SERIALIZED_NAME_ARRAY_ENUM)
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


  public JustSymbol getJustSymbol() {
    return justSymbol;
  }


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


  public List<ArrayEnum> getArrayEnum() {
    return arrayEnum;
  }


  public void setArrayEnum(List<ArrayEnum> arrayEnum) {
    this.arrayEnum = arrayEnum;
  }

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

}

