package com.mohan.bus_booking_service.Exception;

public class RegistrationAlreadyExistsException extends RuntimeException {

    public RegistrationAlreadyExistsException(String message) {
        super(message);
    }
}