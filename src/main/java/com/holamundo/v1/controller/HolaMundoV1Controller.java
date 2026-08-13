package com.holamundo.v1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("api/v1")
public class HolaMundoV1Controller {

    @GetMapping 
    public String holaMundo() {
        return "hola Mundo v1.0.0";
    }

    @PostMapping
    public String despedida() {
        return "despedida V1.1.0";
    }
}