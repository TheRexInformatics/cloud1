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

    // 1. ENDPOINT PÚBLICO (Permitido por SecurityConfig mediante "/api/v1/public")
    @GetMapping("/public")
    public String holaMundoPublico() {
        return "hola Mundo v1.0.0 (Endpoint Público)";
    }

    // 2. ENDPOINT PROTEGIDO GET (Requiere Token Bearer)
    @GetMapping("/private")
    public String holaMundoPrivado(@AuthenticationPrincipal Jwt jwt) {
        // Obtenemos el usuario autenticado directamente desde el Token JWT
        String username = jwt.getSubject();
        return "Hola " + username + ", bienvenido al endpoint privado (GET)";
    }

    // 3. ENDPOINT PROTEGIDO POST (Requiere Token Bearer)
    @PostMapping("/private")
    public String despedidaPrivada(@AuthenticationPrincipal Jwt jwt) {
        String username = jwt.getSubject();
        return "Hasta luego " + username + ", mensaje desde endpoint protegido (POST)";
    }
}