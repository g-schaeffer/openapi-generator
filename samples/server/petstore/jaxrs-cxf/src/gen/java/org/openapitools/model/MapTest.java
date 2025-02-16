package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MapTest  {
  
  @ApiModelProperty(value = "")
  @Valid
  private Map<String, Map<String, String>> mapMapOfString = new HashMap<>();

public enum Inner {

UPPER(String.valueOf("UPPER")), LOWER(String.valueOf("lower"));


    private String value;

    Inner (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static Inner fromValue(String value) {
        for (Inner b : Inner.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")
  private Map<String, Inner> mapOfEnumString = new HashMap<>();

  @ApiModelProperty(value = "")
  private Map<String, Boolean> directMap = new HashMap<>();

  @ApiModelProperty(value = "")
  private Map<String, Boolean> indirectMap = new HashMap<>();
 /**
   * Get mapMapOfString
   * @return mapMapOfString
  **/
  @JsonProperty("map_map_of_string")
  public Map<String, Map<String, String>> getMapMapOfString() {
    return mapMapOfString;
  }

  public void setMapMapOfString(Map<String, Map<String, String>> mapMapOfString) {
    this.mapMapOfString = mapMapOfString;
  }

  public MapTest mapMapOfString(Map<String, Map<String, String>> mapMapOfString) {
    this.mapMapOfString = mapMapOfString;
    return this;
  }

  public MapTest putMapMapOfStringItem(String key, Map<String, String> mapMapOfStringItem) {
    this.mapMapOfString.put(key, mapMapOfStringItem);
    return this;
  }

 /**
   * Get mapOfEnumString
   * @return mapOfEnumString
  **/
  @JsonProperty("map_of_enum_string")
  public Map<String, Inner> getMapOfEnumString() {
    return mapOfEnumString;
  }

  public void setMapOfEnumString(Map<String, Inner> mapOfEnumString) {
    this.mapOfEnumString = mapOfEnumString;
  }

  public MapTest mapOfEnumString(Map<String, Inner> mapOfEnumString) {
    this.mapOfEnumString = mapOfEnumString;
    return this;
  }

  public MapTest putMapOfEnumStringItem(String key, Inner mapOfEnumStringItem) {
    this.mapOfEnumString.put(key, mapOfEnumStringItem);
    return this;
  }

 /**
   * Get directMap
   * @return directMap
  **/
  @JsonProperty("direct_map")
  public Map<String, Boolean> getDirectMap() {
    return directMap;
  }

  public void setDirectMap(Map<String, Boolean> directMap) {
    this.directMap = directMap;
  }

  public MapTest directMap(Map<String, Boolean> directMap) {
    this.directMap = directMap;
    return this;
  }

  public MapTest putDirectMapItem(String key, Boolean directMapItem) {
    this.directMap.put(key, directMapItem);
    return this;
  }

 /**
   * Get indirectMap
   * @return indirectMap
  **/
  @JsonProperty("indirect_map")
  public Map<String, Boolean> getIndirectMap() {
    return indirectMap;
  }

  public void setIndirectMap(Map<String, Boolean> indirectMap) {
    this.indirectMap = indirectMap;
  }

  public MapTest indirectMap(Map<String, Boolean> indirectMap) {
    this.indirectMap = indirectMap;
    return this;
  }

  public MapTest putIndirectMapItem(String key, Boolean indirectMapItem) {
    this.indirectMap.put(key, indirectMapItem);
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MapTest mapTest = (MapTest) o;
    return Objects.equals(mapMapOfString, mapTest.mapMapOfString) &&
        Objects.equals(mapOfEnumString, mapTest.mapOfEnumString) &&
        Objects.equals(directMap, mapTest.directMap) &&
        Objects.equals(indirectMap, mapTest.indirectMap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mapMapOfString, mapOfEnumString, directMap, indirectMap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MapTest {\n");
    
    sb.append("    mapMapOfString: ").append(toIndentedString(mapMapOfString)).append("\n");
    sb.append("    mapOfEnumString: ").append(toIndentedString(mapOfEnumString)).append("\n");
    sb.append("    directMap: ").append(toIndentedString(directMap)).append("\n");
    sb.append("    indirectMap: ").append(toIndentedString(indirectMap)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

