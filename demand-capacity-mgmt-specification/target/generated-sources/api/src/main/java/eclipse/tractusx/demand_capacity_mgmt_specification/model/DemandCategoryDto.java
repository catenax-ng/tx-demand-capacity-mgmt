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
 * DemandCategoryDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class DemandCategoryDto {

  @JsonProperty("demandCategory")
  private String demandCategory;

  public DemandCategoryDto demandCategory(String demandCategory) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DemandCategoryDto demandCategoryDto = (DemandCategoryDto) o;
    return Objects.equals(this.demandCategory, demandCategoryDto.demandCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(demandCategory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DemandCategoryDto {\n");
    sb.append("    demandCategory: ").append(toIndentedString(demandCategory)).append("\n");
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

