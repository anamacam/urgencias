package org.adaurgencias.service;


import org.adaurgencias.dto.PersonDTO;
import org.adaurgencias.entity.Person;
import org.adaurgencias.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Service
public class PersonService {

    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public PersonDTO create(PersonDTO personDTO){
        Person person = mapToEntity(personDTO);
        person = personRepository.save(person);

        return personDTO;

        }

        private Person mapToEntity(PersonDTO personDTO){
        Person person = new Person(personDTO.getId(),
                personDTO.getNombre(),
                personDTO.getApellido(),
                LocalDate.parse(personDTO.getFechaNacimiento(), DATE_TIME_FORMATTER),
                personDTO.getGenero(),
                personDTO.getEstadoCivil());

        return person;


    }


}
