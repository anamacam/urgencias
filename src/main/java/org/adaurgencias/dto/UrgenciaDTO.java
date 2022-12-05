package org.adaurgencias.dto;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.time.LocalDateTime;
import java.util.List;

public class UrgenciaDTO {

    private Integer id;

    @JsonAlias("numero_urgencia")
    private String numeroUrgencia;

    @JsonAlias("fecha_ingreso_hora")
    private LocalDateTime fechaHoraIngreso;

    @JsonAlias("nombre_paciente")
    private String nombrePaciente;
    private String sintomas;

    @JsonAlias("clasificacion_triage")
    private String clasificacionTriage;

    @JsonAlias("fecha_hora_salida")
    private LocalDateTime fechaHoraSalida;

    private List<UrgenciaDTO> urgenciaDTOS;

    public UrgenciaDTO(String numeroUrgencia, LocalDateTime fechaHoraIngreso, String nombrePaciente, String sintomas,
                       String clasificacionTriage, LocalDateTime fechaHoraSalida) {
        this.id = id;
        this.numeroUrgencia = numeroUrgencia;
        this.fechaHoraIngreso = fechaHoraIngreso;
        this.nombrePaciente = nombrePaciente;
        this.sintomas = sintomas;
        this.clasificacionTriage = clasificacionTriage;
        this.fechaHoraSalida = fechaHoraSalida;

    }

    public Integer getId() {
        return id;
    }

    public String getNumeroUrgencia() {
        return numeroUrgencia;
    }

    public LocalDateTime getFechaHoraIngreso() {
        return fechaHoraIngreso;
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

    public List<UrgenciaDTO> getUrgenciaDTOS() {
        return urgenciaDTOS;
    }
}



