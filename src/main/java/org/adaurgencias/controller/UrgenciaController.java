package org.adaurgencias.controller;


import org.adaurgencias.service.UrgenciaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persons/{personId}/urgencias")
public class UrgenciaController {

    private final UrgenciaService urgenciaService;

    public UrgenciaController(UrgenciaService urgenciaService) {
        this.urgenciaService = urgenciaService;
    }


}
