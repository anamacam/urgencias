package org.adaurgencias.dto.dto;

import com.fasterxml.jackson.annotation.JsonAlias;

public class PersonDTO {

    private String id;
    private String nombre;
    private String apellido;

    @JsonAlias ("fecha_nacimiento")
    private String fechaNacimiento;
    private char genero;

    @JsonAlias("estado_civil")
    private String estadoCivil;

    public PersonDTO(String id, String nombre, String apellido, String fechaNacimiento,
                     char genero, String estadoCivil) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.estadoCivil = estadoCivil;
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
}
