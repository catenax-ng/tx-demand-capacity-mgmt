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
 * DemandRequestDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class DemandRequestDto {

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

  @JsonProperty("productId")
  private String productId;

  @JsonProperty("projectId")
  private String projectId;

  @JsonProperty("demandCategory")
  private String demandCategory;

  @JsonProperty("companyId")
  private String companyId;

  @JsonProperty("description")
  private String description;

  public DemandRequestDto startDate(String startDate) {
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

  public DemandRequestDto endDate(String endDate) {
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

  public DemandRequestDto requiredValue(BigDecimal requiredValue) {
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

  public DemandRequestDto deliveredValue(BigDecimal deliveredValue) {
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

  public DemandRequestDto maximumValue(BigDecimal maximumValue) {
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

  public DemandRequestDto productId(String productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Get productId
   * @return productId
  */
  
  @Schema(name = "productId", required = false)
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public DemandRequestDto projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * Get projectId
   * @return projectId
  */
  
  @Schema(name = "projectId", required = false)
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public DemandRequestDto demandCategory(String demandCategory) {
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

  public DemandRequestDto companyId(String companyId) {
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

  public DemandRequestDto description(String description) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DemandRequestDto demandRequestDto = (DemandRequestDto) o;
    return Objects.equals(this.startDate, demandRequestDto.startDate) &&
        Objects.equals(this.endDate, demandRequestDto.endDate) &&
        Objects.equals(this.requiredValue, demandRequestDto.requiredValue) &&
        Objects.equals(this.deliveredValue, demandRequestDto.deliveredValue) &&
        Objects.equals(this.maximumValue, demandRequestDto.maximumValue) &&
        Objects.equals(this.productId, demandRequestDto.productId) &&
        Objects.equals(this.projectId, demandRequestDto.projectId) &&
        Objects.equals(this.demandCategory, demandRequestDto.demandCategory) &&
        Objects.equals(this.companyId, demandRequestDto.companyId) &&
        Objects.equals(this.description, demandRequestDto.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, requiredValue, deliveredValue, maximumValue, productId, projectId, demandCategory, companyId, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DemandRequestDto {\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    requiredValue: ").append(toIndentedString(requiredValue)).append("\n");
    sb.append("    deliveredValue: ").append(toIndentedString(deliveredValue)).append("\n");
    sb.append("    maximumValue: ").append(toIndentedString(maximumValue)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    demandCategory: ").append(toIndentedString(demandCategory)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

