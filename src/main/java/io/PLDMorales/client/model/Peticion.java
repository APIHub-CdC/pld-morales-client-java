package io.PLDMorales.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "")
public class Peticion {
  @SerializedName("razonSocial")
  private String razonSocial = null;
  public Peticion razonSocial(String razonSocial) {
    this.razonSocial = razonSocial;
    return this;
  }
   
  @ApiModelProperty(example = "EMPRESA SA DE CV", required = true, value = "Razon Social.")
  public String getRazonSocial() {
    return razonSocial;
  }
  public void setRazonSocial(String razonSocial) {
    this.razonSocial = razonSocial;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Peticion peticion = (Peticion) o;
    return Objects.equals(this.razonSocial, peticion.razonSocial);
  }
  @Override
  public int hashCode() {
    return Objects.hash(razonSocial);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Peticion {\n");
    
    sb.append("    razonSocial: ").append(toIndentedString(razonSocial)).append("\n");
    sb.append("}");
    return sb.toString();
  }
  
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
