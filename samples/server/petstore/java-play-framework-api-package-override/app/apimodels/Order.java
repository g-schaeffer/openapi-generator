package apimodels;

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * An order for a pets from the pet store
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Order   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("petId")
  
  private Long petId;

  @JsonProperty("quantity")
  
  private Integer quantity;

  @JsonProperty("shipDate")
  @Valid

  private OffsetDateTime shipDate;

  /**
   * Order Status
   */
  public enum Status {
    PLACED("placed"),
    
    APPROVED("approved"),
    
    DELIVERED("delivered");

    private final String value;

    Status(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
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

  @JsonProperty("status")
  
  private Status status;

  @JsonProperty("complete")
  
  private Boolean complete = false;

  public Order id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Order petId(Long petId) {
    this.petId = petId;
    return this;
  }

   /**
   * Get petId
   * @return petId
  **/
  public Long getPetId() {
    return petId;
  }

  public void setPetId(Long petId) {
    this.petId = petId;
  }

  public Order quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Order shipDate(OffsetDateTime shipDate) {
    this.shipDate = shipDate;
    return this;
  }

   /**
   * Get shipDate
   * @return shipDate
  **/
  public OffsetDateTime getShipDate() {
    return shipDate;
  }

  public void setShipDate(OffsetDateTime shipDate) {
    this.shipDate = shipDate;
  }

  public Order status(Status status) {
    this.status = status;
    return this;
  }

   /**
   * Order Status
   * @return status
  **/
  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public Order complete(Boolean complete) {
    this.complete = complete;
    return this;
  }

   /**
   * Get complete
   * @return complete
  **/
  public Boolean getComplete() {
    return complete;
  }

  public void setComplete(Boolean complete) {
    this.complete = complete;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Order order = (Order) o;
    return Objects.equals(id, order.id) &&
        Objects.equals(petId, order.petId) &&
        Objects.equals(quantity, order.quantity) &&
        Objects.equals(shipDate, order.shipDate) &&
        Objects.equals(status, order.status) &&
        Objects.equals(complete, order.complete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, petId, quantity, shipDate, status, complete);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    petId: ").append(toIndentedString(petId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    shipDate: ").append(toIndentedString(shipDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    complete: ").append(toIndentedString(complete)).append("\n");
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

