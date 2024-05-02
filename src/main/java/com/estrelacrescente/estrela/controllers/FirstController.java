package com.estrelacrescente.estrela.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @RequestMapping
    public String hey(){
       return "Hey, Welcome!!";
    }
}
