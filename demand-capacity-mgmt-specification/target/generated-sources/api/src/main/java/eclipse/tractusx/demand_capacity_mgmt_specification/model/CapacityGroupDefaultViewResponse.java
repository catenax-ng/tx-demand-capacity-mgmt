package eclipse.tractusx.demand_capacity_mgmt_specification.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CapacityGroupDefaultViewResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CapacityGroupDefaultViewResponse {

  @JsonProperty("internalId")
  private String internalId;

  @JsonProperty("catXUuid")
  private String catXUuid;

  @JsonProperty("name")
  private String name;

  @JsonProperty("customerBPNL")
  private String customerBPNL;

  @JsonProperty("customerName")
  private String customerName;

  @JsonProperty("supplierBNPL")
  private String supplierBNPL;

  @JsonProperty("numberOfMaterials")
  private BigDecimal numberOfMaterials;

  @JsonProperty("favoritedBy")
  private String favoritedBy;

  @JsonProperty("status")
  private String status;

  public CapacityGroupDefaultViewResponse internalId(String internalId) {
    this.internalId = internalId;
    return this;
  }

  /**
   * Get internalId
   * @return internalId
  */
  
  @Schema(name = "internalId", required = false)
  public String getInternalId() {
    return internalId;
  }

  public void setInternalId(String internalId) {
    this.internalId = internalId;
  }

  public CapacityGroupDefaultViewResponse catXUuid(String catXUuid) {
    this.catXUuid = catXUuid;
    return this;
  }

  /**
   * Get catXUuid
   * @return catXUuid
  */
  
  @Schema(name = "catXUuid", required = false)
  public String getCatXUuid() {
    return catXUuid;
  }

  public void setCatXUuid(String catXUuid) {
    this.catXUuid = catXUuid;
  }

  public CapacityGroupDefaultViewResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", required = false)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CapacityGroupDefaultViewResponse customerBPNL(String customerBPNL) {
    this.customerBPNL = customerBPNL;
    return this;
  }

  /**
   * Get customerBPNL
   * @return customerBPNL
  */
  
  @Schema(name = "customerBPNL", required = false)
  public String getCustomerBPNL() {
    return customerBPNL;
  }

  public void setCustomerBPNL(String customerBPNL) {
    this.customerBPNL = customerBPNL;
  }

  public CapacityGroupDefaultViewResponse customerName(String customerName) {
    this.customerName = customerName;
    return this;
  }

  /**
   * Get customerName
   * @return customerName
  */
  
  @Schema(name = "customerName", required = false)
  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public CapacityGroupDefaultViewResponse supplierBNPL(String supplierBNPL) {
    this.supplierBNPL = supplierBNPL;
    return this;
  }

  /**
   * Get supplierBNPL
   * @return supplierBNPL
  */
  
  @Schema(name = "supplierBNPL", required = false)
  public String getSupplierBNPL() {
    return supplierBNPL;
  }

  public void setSupplierBNPL(String supplierBNPL) {
    this.supplierBNPL = supplierBNPL;
  }

  public CapacityGroupDefaultViewResponse numberOfMaterials(BigDecimal numberOfMaterials) {
    this.numberOfMaterials = numberOfMaterials;
    return this;
  }

  /**
   * Get numberOfMaterials
   * @return numberOfMaterials
  */
  @Valid 
  @Schema(name = "numberOfMaterials", required = false)
  public BigDecimal getNumberOfMaterials() {
    return numberOfMaterials;
  }

  public void setNumberOfMaterials(BigDecimal numberOfMaterials) {
    this.numberOfMaterials = numberOfMaterials;
  }

  public CapacityGroupDefaultViewResponse favoritedBy(String favoritedBy) {
    this.favoritedBy = favoritedBy;
    return this;
  }

  /**
   * Get favoritedBy
   * @return favoritedBy
  */
  
  @Schema(name = "favoritedBy", required = false)
  public String getFavoritedBy() {
    return favoritedBy;
  }

  public void setFavoritedBy(String favoritedBy) {
    this.favoritedBy = favoritedBy;
  }

  public CapacityGroupDefaultViewResponse status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  
  @Schema(name = "status", required = false)
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CapacityGroupDefaultViewResponse capacityGroupDefaultViewResponse = (CapacityGroupDefaultViewResponse) o;
    return Objects.equals(this.internalId, capacityGroupDefaultViewResponse.internalId) &&
        Objects.equals(this.catXUuid, capacityGroupDefaultViewResponse.catXUuid) &&
        Objects.equals(this.name, capacityGroupDefaultViewResponse.name) &&
        Objects.equals(this.customerBPNL, capacityGroupDefaultViewResponse.customerBPNL) &&
        Objects.equals(this.customerName, capacityGroupDefaultViewResponse.customerName) &&
        Objects.equals(this.supplierBNPL, capacityGroupDefaultViewResponse.supplierBNPL) &&
        Objects.equals(this.numberOfMaterials, capacityGroupDefaultViewResponse.numberOfMaterials) &&
        Objects.equals(this.favoritedBy, capacityGroupDefaultViewResponse.favoritedBy) &&
        Objects.equals(this.status, capacityGroupDefaultViewResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(internalId, catXUuid, name, customerBPNL, customerName, supplierBNPL, numberOfMaterials, favoritedBy, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CapacityGroupDefaultViewResponse {\n");
    sb.append("    internalId: ").append(toIndentedString(internalId)).append("\n");
    sb.append("    catXUuid: ").append(toIndentedString(catXUuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    customerBPNL: ").append(toIndentedString(customerBPNL)).append("\n");
    sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
    sb.append("    supplierBNPL: ").append(toIndentedString(supplierBNPL)).append("\n");
    sb.append("    numberOfMaterials: ").append(toIndentedString(numberOfMaterials)).append("\n");
    sb.append("    favoritedBy: ").append(toIndentedString(favoritedBy)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

