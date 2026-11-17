package com.mohan.bus_booking_service.DTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginRequest {

    String phoneNumber;
    String password;
}
