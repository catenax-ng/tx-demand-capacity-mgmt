package eclipse.tractusx.demand_capacity_mgmt_specification.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import eclipse.tractusx.demand_capacity_mgmt_specification.model.ProductDto;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * DemandResponseDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class DemandResponseDto {

  @JsonProperty("id")
  private String id;

  @JsonProperty("startDate")
  private String startDate;

  @JsonProperty("endDate")
  private String endDate;

  @JsonProperty("requiredValue")
  private BigDecimal requiredValue;

  @JsonProperty("deliveredValue")
  private BigDecimal deliveredValue;

  @JsonProperty("maximumValue")
  private BigDecimal maximumValue;

  @JsonProperty("description")
  private String description;

  @JsonProperty("demandCategory")
  private String demandCategory;

  @JsonProperty("companyId")
  private String companyId;

  @JsonProperty("product")
  private ProductDto product;

  public DemandResponseDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", required = false)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DemandResponseDto startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
  */
  
  @Schema(name = "startDate", required = false)
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public DemandResponseDto endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
  */
  
  @Schema(name = "endDate", required = false)
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public DemandResponseDto requiredValue(BigDecimal requiredValue) {
    this.requiredValue = requiredValue;
    return this;
  }

  /**
   * Get requiredValue
   * @return requiredValue
  */
  @Valid 
  @Schema(name = "requiredValue", required = false)
  public BigDecimal getRequiredValue() {
    return requiredValue;
  }

  public void setRequiredValue(BigDecimal requiredValue) {
    this.requiredValue = requiredValue;
  }

  public DemandResponseDto deliveredValue(BigDecimal deliveredValue) {
    this.deliveredValue = deliveredValue;
    return this;
  }

  /**
   * Get deliveredValue
   * @return deliveredValue
  */
  @Valid 
  @Schema(name = "deliveredValue", required = false)
  public BigDecimal getDeliveredValue() {
    return deliveredValue;
  }

  public void setDeliveredValue(BigDecimal deliveredValue) {
    this.deliveredValue = deliveredValue;
  }

  public DemandResponseDto maximumValue(BigDecimal maximumValue) {
    this.maximumValue = maximumValue;
    return this;
  }

  /**
   * Get maximumValue
   * @return maximumValue
  */
  @Valid 
  @Schema(name = "maximumValue", required = false)
  public BigDecimal getMaximumValue() {
    return maximumValue;
  }

  public void setMaximumValue(BigDecimal maximumValue) {
    this.maximumValue = maximumValue;
  }

  public DemandResponseDto description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  
  @Schema(name = "description", required = false)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DemandResponseDto demandCategory(String demandCategory) {
    this.demandCategory = demandCategory;
    return this;
  }

  /**
   * Get demandCategory
   * @return demandCategory
  */
  
  @Schema(name = "demandCategory", required = false)
  public String getDemandCategory() {
    return demandCategory;
  }

  public void setDemandCategory(String demandCategory) {
    this.demandCategory = demandCategory;
  }

  public DemandResponseDto companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * Get companyId
   * @return companyId
  */
  
  @Schema(name = "companyId", required = false)
  public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }

  public DemandResponseDto product(ProductDto product) {
    this.product = product;
    return this;
  }

  /**
   * Get product
   * @return product
  */
  @Valid 
  @Schema(name = "product", required = false)
  public ProductDto getProduct() {
    return product;
  }

  public void setProduct(ProductDto product) {
    this.product = product;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DemandResponseDto demandResponseDto = (DemandResponseDto) o;
    return Objects.equals(this.id, demandResponseDto.id) &&
        Objects.equals(this.startDate, demandResponseDto.startDate) &&
        Objects.equals(this.endDate, demandResponseDto.endDate) &&
        Objects.equals(this.requiredValue, demandResponseDto.requiredValue) &&
        Objects.equals(this.deliveredValue, demandResponseDto.deliveredValue) &&
        Objects.equals(this.maximumValue, demandResponseDto.maximumValue) &&
        Objects.equals(this.description, demandResponseDto.description) &&
        Objects.equals(this.demandCategory, demandResponseDto.demandCategory) &&
        Objects.equals(this.companyId, demandResponseDto.companyId) &&
        Objects.equals(this.product, demandResponseDto.product);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, startDate, endDate, requiredValue, deliveredValue, maximumValue, description, demandCategory, companyId, product);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DemandResponseDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    requiredValue: ").append(toIndentedString(requiredValue)).append("\n");
    sb.append("    deliveredValue: ").append(toIndentedString(deliveredValue)).append("\n");
    sb.append("    maximumValue: ").append(toIndentedString(maximumValue)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    demandCategory: ").append(toIndentedString(demandCategory)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
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

