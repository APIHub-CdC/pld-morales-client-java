package io.PLDMorales.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

public class Persona {
  @SerializedName("porcentaje")
  private Integer porcentaje = null;
  @SerializedName("rfc")
  private String rfc = null;
  @SerializedName("fechaIncorporacion")
  private String fechaIncorporacion = null;
  @SerializedName("lista")
  private String lista = null;
  @SerializedName("estatus")
  private String estatus = null;
  @SerializedName("razonSocial")
  private String razonSocial = null;
  @SerializedName("fechaCargoInicio")
  private String fechaCargoInicio = null;
  @SerializedName("fechaCargoFin")
  private String fechaCargoFin = null;
  @SerializedName("tipoPersona")
  private String tipoPersona = null;
  public Persona porcentaje(Integer porcentaje) {
    this.porcentaje = porcentaje;
    return this;
  }
   
  @ApiModelProperty(example = "98", value = "Nivel de coincidencia entre los parámetros de entrada y los resultados obtenidos.")
  public Integer getPorcentaje() {
    return porcentaje;
  }
  public void setPorcentaje(Integer porcentaje) {
    this.porcentaje = porcentaje;
  }
  public Persona rfc(String rfc) {
    this.rfc = rfc;
    return this;
  }
   
  @ApiModelProperty(example = "SAZR010101Q23", value = "RFC con homoclave de la persona.")
  public String getRfc() {
    return rfc;
  }
  public void setRfc(String rfc) {
    this.rfc = rfc;
  }
  public Persona fechaIncorporacion(String fechaIncorporacion) {
    this.fechaIncorporacion = fechaIncorporacion;
    return this;
  }
   
  @ApiModelProperty(example = "2001-01-01", value = "Fecha de incorporacion de la persona moral (formato por defecto yyyy-MM-dd).")
  public String getFechaIncorporacion() {
    return fechaIncorporacion;
  }
  public void setFechaIncorporacion(String fechaIncorporacion) {
    this.fechaIncorporacion = fechaIncorporacion;
  }
  public Persona lista(String lista) {
    this.lista = lista;
    return this;
  }
   
  @ApiModelProperty(example = "SAT69", value = "Lista pública en la que se encuentra.")
  public String getLista() {
    return lista;
  }
  public void setLista(String lista) {
    this.lista = lista;
  }
  public Persona estatus(String estatus) {
    this.estatus = estatus;
    return this;
  }
   
  @ApiModelProperty(example = "ACTIVO", value = "Información adicional del registro.")
  public String getEstatus() {
    return estatus;
  }
  public void setEstatus(String estatus) {
    this.estatus = estatus;
  }
  public Persona razonSocial(String razonSocial) {
    this.razonSocial = razonSocial;
    return this;
  }
   
  @ApiModelProperty(example = "MORAL", value = "Razón social (física o moral).")
  public String getRazonSocial() {
    return razonSocial;
  }
  public void setRazonSocial(String razonSocial) {
    this.razonSocial = razonSocial;
  }
  public Persona fechaCargoInicio(String fechaCargoInicio) {
    this.fechaCargoInicio = fechaCargoInicio;
    return this;
  }
   
  @ApiModelProperty(example = "2001-01-01", value = "Fecha en que la persona inició labores en el cargo (formato por defecto yyyy-MM-dd).")
  public String getFechaCargoInicio() {
    return fechaCargoInicio;
  }
  public void setFechaCargoInicio(String fechaCargoInicio) {
    this.fechaCargoInicio = fechaCargoInicio;
  }
  public Persona fechaCargoFin(String fechaCargoFin) {
    this.fechaCargoFin = fechaCargoFin;
    return this;
  }
   
  @ApiModelProperty(example = "2010-01-01", value = "Fecha en que la persona terminó labores en el cargo (formato por defecto yyyy-MM-dd).")
  public String getFechaCargoFin() {
    return fechaCargoFin;
  }
  public void setFechaCargoFin(String fechaCargoFin) {
    this.fechaCargoFin = fechaCargoFin;
  }
  public Persona tipoPersona(String tipoPersona) {
    this.tipoPersona = tipoPersona;
    return this;
  }
   
  @ApiModelProperty(example = "PM", value = "Tipo de persona (física o moral).")
  public String getTipoPersona() {
    return tipoPersona;
  }
  public void setTipoPersona(String tipoPersona) {
    this.tipoPersona = tipoPersona;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Persona persona = (Persona) o;
    return Objects.equals(this.porcentaje, persona.porcentaje) &&
        Objects.equals(this.rfc, persona.rfc) &&
        Objects.equals(this.fechaIncorporacion, persona.fechaIncorporacion) &&
        Objects.equals(this.lista, persona.lista) &&
        Objects.equals(this.estatus, persona.estatus) &&
        Objects.equals(this.razonSocial, persona.razonSocial) &&
        Objects.equals(this.fechaCargoInicio, persona.fechaCargoInicio) &&
        Objects.equals(this.fechaCargoFin, persona.fechaCargoFin) &&
        Objects.equals(this.tipoPersona, persona.tipoPersona);
  }
  @Override
  public int hashCode() {
    return Objects.hash(porcentaje, rfc, fechaIncorporacion, lista, estatus, razonSocial, fechaCargoInicio, fechaCargoFin, tipoPersona);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Persona {\n");
    
    sb.append("    porcentaje: ").append(toIndentedString(porcentaje)).append("\n");
    sb.append("    rfc: ").append(toIndentedString(rfc)).append("\n");
    sb.append("    fechaIncorporacion: ").append(toIndentedString(fechaIncorporacion)).append("\n");
    sb.append("    lista: ").append(toIndentedString(lista)).append("\n");
    sb.append("    estatus: ").append(toIndentedString(estatus)).append("\n");
    sb.append("    razonSocial: ").append(toIndentedString(razonSocial)).append("\n");
    sb.append("    fechaCargoInicio: ").append(toIndentedString(fechaCargoInicio)).append("\n");
    sb.append("    fechaCargoFin: ").append(toIndentedString(fechaCargoFin)).append("\n");
    sb.append("    tipoPersona: ").append(toIndentedString(tipoPersona)).append("\n");
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
