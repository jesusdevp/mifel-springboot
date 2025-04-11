package com.mifel.controller;

import com.mifel.security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        if ("admin".equals(username) && "admin123".equals(password)) {
            return jwtUtil.generateToken(username);
        }
        throw new RuntimeException("Credenciales inválidas");
    }
}