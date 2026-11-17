package com.mohan.bus_booking_service.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginResponse {

    private Long id;
    private String name;
    private String phoneNumber;
    private String email;
    private String message;
    private String token;
}