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
 * CompanyDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CompanyDto {

  @JsonProperty("bpn")
  private String bpn;

  @JsonProperty("companyName")
  private String companyName;

  @JsonProperty("street")
  private String street;

  @JsonProperty("number")
  private String number;

  @JsonProperty("zipCode")
  private String zipCode;

  @JsonProperty("country")
  private String country;

  @JsonProperty("myCompany")
  private String myCompany;

  public CompanyDto bpn(String bpn) {
    this.bpn = bpn;
    return this;
  }

  /**
   * Get bpn
   * @return bpn
  */
  
  @Schema(name = "bpn", required = false)
  public String getBpn() {
    return bpn;
  }

  public void setBpn(String bpn) {
    this.bpn = bpn;
  }

  public CompanyDto companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

  /**
   * Get companyName
   * @return companyName
  */
  
  @Schema(name = "companyName", required = false)
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public CompanyDto street(String street) {
    this.street = street;
    return this;
  }

  /**
   * Get street
   * @return street
  */
  
  @Schema(name = "street", required = false)
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public CompanyDto number(String number) {
    this.number = number;
    return this;
  }

  /**
   * Get number
   * @return number
  */
  
  @Schema(name = "number", required = false)
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public CompanyDto zipCode(String zipCode) {
    this.zipCode = zipCode;
    return this;
  }

  /**
   * Get zipCode
   * @return zipCode
  */
  
  @Schema(name = "zipCode", required = false)
  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public CompanyDto country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
  */
  
  @Schema(name = "country", required = false)
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public CompanyDto myCompany(String myCompany) {
    this.myCompany = myCompany;
    return this;
  }

  /**
   * Get myCompany
   * @return myCompany
  */
  
  @Schema(name = "myCompany", required = false)
  public String getMyCompany() {
    return myCompany;
  }

  public void setMyCompany(String myCompany) {
    this.myCompany = myCompany;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyDto companyDto = (CompanyDto) o;
    return Objects.equals(this.bpn, companyDto.bpn) &&
        Objects.equals(this.companyName, companyDto.companyName) &&
        Objects.equals(this.street, companyDto.street) &&
        Objects.equals(this.number, companyDto.number) &&
        Objects.equals(this.zipCode, companyDto.zipCode) &&
        Objects.equals(this.country, companyDto.country) &&
        Objects.equals(this.myCompany, companyDto.myCompany);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bpn, companyName, street, number, zipCode, country, myCompany);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyDto {\n");
    sb.append("    bpn: ").append(toIndentedString(bpn)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    myCompany: ").append(toIndentedString(myCompany)).append("\n");
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

