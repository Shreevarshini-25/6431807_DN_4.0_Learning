package com.example.jwt.controller;

import com.example.jwt.util.JwtUtil;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class AuthController {

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(Authentication authentication) {
        Map<String, String> response = new HashMap<>();

        try {
            if (authentication == null) {
                throw new RuntimeException("Authentication object is null. Make sure Spring Security is correctly configured.");
            }

            String username = authentication.getName();
            System.out.println("Authenticated user: " + username);

            String token = JwtUtil.generateToken(username);
            response.put("token", token);

        } catch (Exception e) {
            e.printStackTrace();  // will print error in Eclipse Console
            response.put("error", "Failed to authenticate: " + e.getMessage());
        }

        return response;
    }
}
