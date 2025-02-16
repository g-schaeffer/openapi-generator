/*
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

package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.openapitools.server.model.Category;
import org.openapitools.server.model.Tag;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;


public class Pet  {
  
  private Long id;

  private Category category;

  private String name;

  private Set<String> photoUrls = new LinkedHashSet<>();

  private List<Tag> tags = null;

public enum Status {

    AVAILABLE(String.valueOf("available")), PENDING(String.valueOf("pending")), SOLD(String.valueOf("sold"));


    private String value;

    Status (String v) {
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

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
	public static Status fromString(String s) {
        for (Status b : Status.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
	}
	
    @JsonCreator
    public static Status fromValue(String value) {
        for (Status b : Status.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
   * pet status in the store
  **/
  private Status status;

 /**
   * Get id
   * @return id
  **/
  public Long getId() {
    return id;
  }

  /**
    * Set id
  **/
  public void setId(Long id) {
    this.id = id;
  }

  public Pet id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Get category
   * @return category
  **/
  public Category getCategory() {
    return category;
  }

  /**
    * Set category
  **/
  public void setCategory(Category category) {
    this.category = category;
  }

  public Pet category(Category category) {
    this.category = category;
    return this;
  }

 /**
   * Get name
   * @return name
  **/
  @NotNull
  public String getName() {
    return name;
  }

  /**
    * Set name
  **/
  public void setName(String name) {
    this.name = name;
  }

  public Pet name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get photoUrls
   * @return photoUrls
  **/
  @NotNull
  public Set<String> getPhotoUrls() {
    return photoUrls;
  }

  /**
    * Set photoUrls
  **/
    @JsonDeserialize(as = LinkedHashSet.class)
  public void setPhotoUrls(Set<String> photoUrls) {
    this.photoUrls = photoUrls;
  }

  public Pet photoUrls(Set<String> photoUrls) {
    this.photoUrls = photoUrls;
    return this;
  }

  public Pet addPhotoUrlsItem(String photoUrlsItem) {
    this.photoUrls.add(photoUrlsItem);
    return this;
  }

 /**
   * Get tags
   * @return tags
  **/
  public List<Tag> getTags() {
    return tags;
  }

  /**
    * Set tags
  **/
  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }

  public Pet tags(List<Tag> tags) {
    this.tags = tags;
    return this;
  }

  public Pet addTagsItem(Tag tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

 /**
   * pet status in the store
   * @return status
  **/
  public Status getStatus() {
    return status;
  }

  /**
    * Set status
  **/
  public void setStatus(Status status) {
    this.status = status;
  }

  public Pet status(Status status) {
    this.status = status;
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pet {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    photoUrls: ").append(toIndentedString(photoUrls)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

