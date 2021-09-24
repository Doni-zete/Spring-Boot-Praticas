package com.digitalinovation.RestfullApplication.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/soldado")
public class SoldadoController {

    @GetMapping
    public ResponseEntity<Soldado> buscarSoldado(){
        return "Tenente da marinha coronel do Exercito";
    }


}
