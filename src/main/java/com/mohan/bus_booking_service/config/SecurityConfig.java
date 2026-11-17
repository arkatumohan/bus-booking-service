//package com.mohan.bus_booking_service.config;
//
//import com.mohan.bus_booking_service.filter.JwtAuthFilter;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
//@Configuration
//public class SecurityConfig {
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(
//            HttpSecurity http,
//            JwtAuthFilter jwtAuthFilter)
//            throws Exception {
//        http
//                .csrf(csrf -> csrf.disable())
//                .authorizeHttpRequests(auth -> auth
//                        .requestMatchers("/access/login").permitAll()
//                        .anyRequest().authenticated()
//                );
//        http.addFilterBefore(
//                jwtAuthFilter,
//                UsernamePasswordAuthenticationFilter.class
//        );
//
//        return http.build();
//    }
//}