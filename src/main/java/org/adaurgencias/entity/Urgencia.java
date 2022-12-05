package org.adaurgencias.entity;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "urgencia")
public class Urgencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "numero_urgencia", nullable = false)
    private String numeroUrgencia;

    @Column(name = "fecha_hora_ingreso",nullable = false)
    private LocalDateTime fechaHoraIngreso;

    @Column(name = "nombre_paciente",nullable = false)
    private String nombrePaciente;

    @Column(nullable = false)
    private String sintomas;

    @Column(name = "clasificación_triage",nullable = false)
    private String clasificacionTriage;

    @Column(name = "fecha_hora_salida", nullable = false)
    private LocalDateTime fechaHoraSalida;

    @ManyToOne(fetch = FetchType.EAGER )
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;

    public Urgencia() {
    }

    public Urgencia(LocalDateTime fechaHoraIngreso, String nombrePaciente, String sintomas,
                    String clasificacionTriage, LocalDateTime fechaHoraSalida, Person person) {

        this.fechaHoraIngreso = fechaHoraIngreso;
        this.nombrePaciente = nombrePaciente;
        this.sintomas = sintomas;
        this.clasificacionTriage = clasificacionTriage;
        this.fechaHoraSalida = fechaHoraSalida;
        this.person = person;
    }

    public Integer getId() {
        return id;
    }

    public String getNumeroUrgencia() {
        return numeroUrgencia;
    }

    public String getFechaHoraIngreso() {
        return String.valueOf(fechaHoraIngreso);
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public String getSintomas() {
        return sintomas;
    }

    public String getClasificacionTriage() {
        return clasificacionTriage;
    }

    public LocalDateTime getFechaHoraSalida() {
        return fechaHoraSalida;
    }

    public Person getPerson() {
        return person;
    }
}
