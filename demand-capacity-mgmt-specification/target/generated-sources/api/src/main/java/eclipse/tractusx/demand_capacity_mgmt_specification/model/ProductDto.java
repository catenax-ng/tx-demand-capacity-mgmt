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
 * ProductDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ProductDto {

  @JsonProperty("name")
  private String name;

  @JsonProperty("un")
  private String un;

  public ProductDto name(String name) {
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

  public ProductDto un(String un) {
    this.un = un;
    return this;
  }

  /**
   * Get un
   * @return un
  */
  
  @Schema(name = "un", required = false)
  public String getUn() {
    return un;
  }

  public void setUn(String un) {
    this.un = un;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductDto productDto = (ProductDto) o;
    return Objects.equals(this.name, productDto.name) &&
        Objects.equals(this.un, productDto.un);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, un);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDto {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    un: ").append(toIndentedString(un)).append("\n");
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

