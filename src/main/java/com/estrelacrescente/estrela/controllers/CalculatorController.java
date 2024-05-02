package com.estrelacrescente.estrela.controllers;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    @GetMapping("/sum/{a}/{b}")
    public int sum(@PathVariable int a, @PathVariable int b) {
        return a + b;
    }

    @GetMapping("/sub")
    public int sub(
            @RequestParam(name = "a") int a,
            @RequestParam(name = "b") int b){
        return a - b;
    }
    @GetMapping("/div")
    public int div(
            @RequestParam(name = "a") int a,
            @RequestParam(name = "b") int b){
        return a / b;
    }

    @GetMapping("/mult")
    public int multiplication(
            @RequestParam(name = "a") int a,
            @RequestParam(name = "b") int b){
        return a * b;
    }


}
