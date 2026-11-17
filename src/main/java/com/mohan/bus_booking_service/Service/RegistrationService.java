package com.mohan.bus_booking_service.Service;

import com.mohan.bus_booking_service.DTO.RegistrationRequest;
import com.mohan.bus_booking_service.DTO.RegistrationResponse;

public interface RegistrationService {

    RegistrationResponse register(RegistrationRequest request);
}
