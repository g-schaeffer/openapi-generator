/*
 * Generation info:
 *   - generator version: 6.6.5-amadeus
 *   - datetime: 2024-02-23T13:46:41.838Z[UTC]
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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets OuterEnumInteger
 */
@JsonAdapter(OuterEnumInteger.Adapter.class)
public enum OuterEnumInteger {
  
  NUMBER_0(0),
  
  NUMBER_1(1),
  
  NUMBER_2(2);

  private Integer value;

  OuterEnumInteger(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OuterEnumInteger fromValue(Integer value) {
    for (OuterEnumInteger b : OuterEnumInteger.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<OuterEnumInteger> {
    @Override
    public void write(final JsonWriter jsonWriter, final OuterEnumInteger enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public OuterEnumInteger read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return OuterEnumInteger.fromValue(value);
    }
  }
}

