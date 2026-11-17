//package com.mohan.bus_booking_service.util;
//
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.security.Keys;
//import org.springframework.stereotype.Component;
//
//import javax.crypto.SecretKey;
//import java.nio.charset.StandardCharsets;
//import java.util.Date;
//
//@Component
//public class JwtUtil {
//
//
//    private final String secretKey = "my-secret-key-for-bus-booking-12345";
//
//    private SecretKey getSigningKey() {
//
//        return Keys.hmacShaKeyFor(
//                secretKey.getBytes(StandardCharsets.UTF_8)
//        );
//    }
//    public String generateToken(String phoneNumber) {
//
//
//        return Jwts.builder()
//                .subject(phoneNumber)
//                .issuedAt(new Date())
//                .expiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60))
//                .signWith(getSigningKey())
//                .compact();
//
//    }
//    public String extractPhoneNumber(String token) {
//
//        return Jwts.parser()
//                .verifyWith(getSigningKey())
//                .build()
//                .parseSignedClaims(token)
//                .getPayload()
//                .getSubject();
//    }
//
//}