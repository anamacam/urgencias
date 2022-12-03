package org.adaurgencias.controller;


import org.adaurgencias.dto.PersonDTO;
import org.adaurgencias.service.PersonService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/persons")
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public ResponseEntity create(@RequestHeader(value = "client-id")String clientId,
                                 @RequestBody PersonDTO personDTO){
        PersonDTO createdPersonDT = personService.create((personDTO));

        return new ResponseEntity(personDTO.getId(),HttpStatus.CREATED);

    }


}
