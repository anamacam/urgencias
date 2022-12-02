package org.adaurgencias.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/persons")
public class PersonController {

    @PostMapping
    public ResponseEntity create(){
        return new ResponseEntity(HttpStatus.CREATED);

    }


}
