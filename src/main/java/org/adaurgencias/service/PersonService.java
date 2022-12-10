package org.adaurgencias.service;


import org.adaurgencias.dto.PersonDTO;
import org.adaurgencias.entity.Person;
import org.adaurgencias.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


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

    public List<PersonDTO> retrieveAll() {
        List<Person> persons = personRepository.findAll();


        return persons.stream()
                .map(person -> mapToDTO(person))
                .collect(Collectors.toList());

    }

    public PersonDTO retrieveById(String id) throws Exception {
        Optional<Person> person = personRepository.findById(id);
        if (person.isEmpty()) {

            throw new Exception("La persona consulta no existe.");
        }

        return mapToDTO(person.get());
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

    private PersonDTO mapToDTO(Person person) {
        PersonDTO personDTO = new PersonDTO(person.getId(), person.getNombre(), person.getApellido(),
                person.getFechaNacimiento().toString(),person.getGenero(), person.getEstadoCivil();

        return personDTO;

    }

}
