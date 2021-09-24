package com.digitalinovation.RestfullApplication.service;

import com.digitalinovation.RestfullApplication.dto.Soldado;
import org.springframework.stereotype.Service;

@Service
public class SoldadoService {


    public Soldado buscarSoldado(String cpf){
        Soldado soldado = new Soldado();
        soldado.setCpf(cpf);
        soldado.setNome("Legoias");
        soldado.setRaça("Elfo");
        soldado.setArma("Arco e flexa");

        return soldado;


}
}