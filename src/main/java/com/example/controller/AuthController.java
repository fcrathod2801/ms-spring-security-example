package com.example.controller;

import com.example.config.JwtUtil;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final JwtUtil jwtUtil = new JwtUtil();

    @PostMapping("/login")
    public Map<String, String> login(
            @RequestParam String username,
            @RequestParam String password
    ) {

        // Dummy validation
        if(username.equals("admin")
                && password.equals("admin123")) {

            String token = jwtUtil.generateToken(username);

            return Map.of("token", token);
        }

        throw new RuntimeException("Invalid Credentials");
    }
}