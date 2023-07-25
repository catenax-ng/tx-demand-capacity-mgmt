package eclipse.tractusx.demand_capacity_mgmt_specification.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * DemandCategoryResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class DemandCategoryResponse {

  @JsonProperty("id")
  private String id;

  @JsonProperty("demandCategoryCode")
  private String demandCategoryCode;

  @JsonProperty("demandCategoryName")
  private String demandCategoryName;

  public DemandCategoryResponse id(String id) {
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

  public DemandCategoryResponse demandCategoryCode(String demandCategoryCode) {
    this.demandCategoryCode = demandCategoryCode;
    return this;
  }

  /**
   * Get demandCategoryCode
   * @return demandCategoryCode
  */
  
  @Schema(name = "demandCategoryCode", required = false)
  public String getDemandCategoryCode() {
    return demandCategoryCode;
  }

  public void setDemandCategoryCode(String demandCategoryCode) {
    this.demandCategoryCode = demandCategoryCode;
  }

  public DemandCategoryResponse demandCategoryName(String demandCategoryName) {
    this.demandCategoryName = demandCategoryName;
    return this;
  }

  /**
   * Get demandCategoryName
   * @return demandCategoryName
  */
  
  @Schema(name = "demandCategoryName", required = false)
  public String getDemandCategoryName() {
    return demandCategoryName;
  }

  public void setDemandCategoryName(String demandCategoryName) {
    this.demandCategoryName = demandCategoryName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DemandCategoryResponse demandCategoryResponse = (DemandCategoryResponse) o;
    return Objects.equals(this.id, demandCategoryResponse.id) &&
        Objects.equals(this.demandCategoryCode, demandCategoryResponse.demandCategoryCode) &&
        Objects.equals(this.demandCategoryName, demandCategoryResponse.demandCategoryName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, demandCategoryCode, demandCategoryName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DemandCategoryResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    demandCategoryCode: ").append(toIndentedString(demandCategoryCode)).append("\n");
    sb.append("    demandCategoryName: ").append(toIndentedString(demandCategoryName)).append("\n");
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

