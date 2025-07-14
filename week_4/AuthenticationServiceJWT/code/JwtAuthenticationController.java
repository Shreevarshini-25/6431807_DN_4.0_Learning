package com.cognizant.jwt_service.controller;

import com.cognizant.jwt_service.util.JwtUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Collections;

@RestController
public class JwtAuthenticationController {
	
	@Autowired
	private JwtUtil jwtutil;
	
	 @RequestMapping(value = "/authenticate", method = RequestMethod.GET)
	    public ResponseEntity<?> generateToken(@RequestHeader("Authorization") String authHeader) {
	        // Extract username and password
	        String base64Credentials = authHeader.substring("Basic ".length()).trim();
	        byte[] credDecoded = Base64.getDecoder().decode(base64Credentials);
	        String credentials = new String(credDecoded, StandardCharsets.UTF_8);
	        final String[] values = credentials.split(":", 2);
	        String username = values[0];
	        String password = values[1];

	        System.out.println("Username: " + username + ", Password: " + password);


	        String token = jwtutil.generateToken(username);

	        // Return token
	        return ResponseEntity.ok(Collections.singletonMap("token", token));
	    }
	
	

}
