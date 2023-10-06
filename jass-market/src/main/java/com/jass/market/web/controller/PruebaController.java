package com.jass.market.web.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludo")
public class PruebaController {
    @GetMapping("/hola")
    public String saludar(){


        return "Nunca Pares de aprender \uD83D\uDDFD \uD83C\uDFCE\uFE0F ";
    }
}
