package io.PLDMorales.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import io.PLDMorales.client.model.Persona;
import java.util.ArrayList;
import java.util.List;


public class Respuesta {
  @SerializedName("personas")
  private List<Persona> personas = new ArrayList<Persona>();
  public Respuesta personas(List<Persona> personas) {
    this.personas = personas;
    return this;
  }
  public Respuesta addPersonasItem(Persona personasItem) {
    this.personas.add(personasItem);
    return this;
  }
   
  @ApiModelProperty(required = true, value = "Lista pública de personas encontradas.")
  public List<Persona> getPersonas() {
    return personas;
  }
  public void setPersonas(List<Persona> personas) {
    this.personas = personas;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Respuesta respuesta = (Respuesta) o;
    return Objects.equals(this.personas, respuesta.personas);
  }
  @Override
  public int hashCode() {
    return Objects.hash(personas);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Respuesta {\n");
    
    sb.append("    personas: ").append(toIndentedString(personas)).append("\n");
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
