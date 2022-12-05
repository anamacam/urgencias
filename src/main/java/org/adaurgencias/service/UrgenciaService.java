package org.adaurgencias.service;

import org.adaurgencias.entity.Person;
import org.adaurgencias.entity.Urgencia;
import org.adaurgencias.repository.PersonRepository;
import org.adaurgencias.repository.UrgenciaRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class UrgenciaService {

    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

    private final UrgenciaRepository urgenciaRepository;

    private final PersonRepository personRepository;


    public UrgenciaService(UrgenciaRepository urgenciaRepository, PersonRepository personRepository) {
        this.urgenciaRepository = urgenciaRepository;
        this.personRepository = personRepository;
    }

    public void create(List<Urgencia> urgenciaDTOS, Person person) {
        List<Urgencia> urgencias = urgenciaDTOS.stream()
                .map(urgenciaDTO -> mapEntity(urgenciaDTO, person))
                .collect(Collectors.toList());
        urgenciaRepository.saveAll(urgencias);


    }

    private Urgencia mapEntity(Urgencia urgenciaDTO, Person person) {
        Urgencia urgencia = new Urgencia(LocalDateTime.parse(urgenciaDTO.getFechaHoraIngreso(), DATE_TIME_FORMATTER),
                urgenciaDTO.getNombrePaciente(),
                urgenciaDTO.getSintomas(),
                urgenciaDTO.getClasificacionTriage(),
                LocalDateTime.parse(urgenciaDTO.getFechaHoraSalida(), DATE_TIME_FORMATTER),
                person);

        return urgencia;

    }
}
