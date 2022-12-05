package org.adaurgencias.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import org.adaurgencias.entity.Urgencia;

import java.util.List;

public class PersonDTO {

    private String id;
    private String nombre;
    private String apellido;

    @JsonAlias("fecha_nacimiento")
    private String fechaNacimiento;
    private char genero;

    @JsonAlias("estado_civil")
    private String estadoCivil;

    @JsonAlias("ugencias")
    private List<Urgencia> urgenciaDTO;

    public PersonDTO(String id, String nombre, String apellido, String fechaNacimiento,
                     char genero, String estadoCivil,
                     List<Urgencia> urgenciaDTO) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.estadoCivil = estadoCivil;
        this.urgenciaDTO = urgenciaDTO;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public char getGenero() {
        return genero;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public List<Urgencia> getUrgenciaDTO() {
        return urgenciaDTO;
    }
}





