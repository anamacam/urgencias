package org.adaurgencias.controller;


import org.adaurgencias.dto.dto.PersonDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/persons")
public class PersonController {

    @PostMapping
    public ResponseEntity create(@RequestHeader(value = "client-id")String clientId,
                                 @RequestBody PersonDTO personDTO){
        return new ResponseEntity(HttpStatus.CREATED);

    }


}
