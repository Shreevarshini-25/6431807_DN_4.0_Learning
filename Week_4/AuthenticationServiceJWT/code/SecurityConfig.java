package com.cognizant.jwt_service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig {
	
	public SecurityConfig() {
        System.out.println("IN SecurityConfig constructor");
    }
	@Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		System.out.println("In filterChain() method");
        http.csrf().disable()
            .authorizeHttpRequests()
            .requestMatchers("/authenticate").permitAll()
            .anyRequest().authenticated()
            .and()
            .httpBasic(); // Needed for curl -u

        return http.build();
    }
	@Bean
	public UserDetailsService users() {
	    UserDetails user = User.builder()
	        .username("vidya")
	        .password("{noop}vidya123") // {noop} means plain text
	        .roles("USER")
	        .build();
	    return new InMemoryUserDetailsManager(user);
	}
}
