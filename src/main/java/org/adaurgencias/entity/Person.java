package org.adaurgencias.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "person")
public class Person {

    @Id
    private String id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String apellido;

    @Column(name = "fecha_nacimiento", nullable = false)
    private LocalDate fechaNacimiento;

    private Character genero;

    @Column(name = "estado_civil", nullable = false)
    private String estadoCivil;

    @OneToMany(mappedBy = "person", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<Urgencia> urgencia;

    public Person() {
    }

    public Person(String id, String nombre, String apellido, LocalDate fechaNacimiento,
                  Character genero, String estadoCivil) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.estadoCivil = estadoCivil;
    }

    public Person(String id, String nombre, String apellido, LocalDate fechaNacimiento, Character genero,
                  String estadoCivil, List<Urgencia> urgencia) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.estadoCivil = estadoCivil;
        this.urgencia = urgencia;
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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public Character getGenero() {
        return genero;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }


    public List<Urgencia> getUrgencia() {
        if (urgencia == null) {
            urgencia = new ArrayList<>();

        }

        return urgencia;


    }

}

