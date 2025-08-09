package com.example.jwt.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public boolean validate(String username, String password) {
        return "user".equals(username) && "pwd".equals(password);
    }
}

