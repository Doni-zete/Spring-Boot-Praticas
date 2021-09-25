package com.digitalinovation.RestfullApplication.controller;

import com.digitalinovation.RestfullApplication.dto.Soldado;
import com.digitalinovation.RestfullApplication.service.SoldadoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/v1/soldado")
public class SoldadoController {
    private SoldadoService soldadoService;

    public SoldadoController(SoldadoService soldadoService) {
        this.soldadoService = soldadoService;
    }

    @GetMapping("/cpf")
    public ResponseEntity<Soldado> buscarSoldado(@PathVariable() String cpf){
        Soldado soldado = soldadoService.buscarSoldado(cpf);
        return ResponseEntity.status(HttpStatus.OK).body(soldado);
    }


}
