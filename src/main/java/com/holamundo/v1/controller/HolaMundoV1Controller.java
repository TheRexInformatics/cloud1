package com.holamundo.v1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/v1")
public class HolaMundoV1Controller {

    @GetMapping
    
    // Este es un ejemplo de un endpoint GET que no recibe parámetros y retorna un saludo 
    public String holaMundo() {
        return "hola Mundo v1.0.0";
    }

    // Este es un ejemplo de un endpoint POST que no recibe parámetros y retorna un mensaje de despedida
    @PostMapping
    public String despedida() {
        return "despedida V1.1.0";
    }

}