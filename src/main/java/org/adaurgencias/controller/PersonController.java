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
    public ResponseEntity create(@RequestHeader(value = "client-id") String clientId,
                                 @RequestBody PersonDTO personDTO) {
        PersonDTO createdPersonDT = personService.create((personDTO));

        return new ResponseEntity(personDTO.getId(), HttpStatus.CREATED);

    }

    @GetMapping
    public ResponseEntity retrieve() {

        return new ResponseEntity(personService.retrieveAll(),HttpStatus.OK);

    }
    @GetMapping("/{personId}")
    public ResponseEntity retrieveById(@PathVariable String personId) throws Exception {
        try {
            PersonDTO personDTO = personService.retrieveById(personId);

            return new ResponseEntity(personDTO,HttpStatus.OK);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

}

