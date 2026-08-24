package com.holamundo.v1.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HolaMundoV1Controller {

    @GetMapping("/public")
    public String holaMundoPublico() {
        return "hola Mundo v1.0.0 (Endpoint Público)";
    }

    // Escucha en GET /api/v1
    @GetMapping
    public String holaMundoPrivado(@AuthenticationPrincipal Jwt jwt) {
        String username = jwt.getSubject();
        return "Hola " + username + ", bienvenido al endpoint privado (GET)";
    }

    // Escucha en POST /api/v1
    @PostMapping
    public String despedidaPrivada(@AuthenticationPrincipal Jwt jwt) {
        String username = jwt.getSubject();
        return "Hasta luego " + username + ", mensaje desde endpoint protegido (POST)";
    }
}