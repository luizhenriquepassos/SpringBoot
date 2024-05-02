package com.estrelacrescente.estrela.controllers;

import com.estrelacrescente.estrela.model.entities.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ClientController {

    @GetMapping("/random")
    public Client obterClient(){
        return new Client(28, "Jorge", "123.456.789-11");
    }
}
