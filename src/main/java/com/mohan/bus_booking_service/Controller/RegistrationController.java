package com.mohan.bus_booking_service.Controller;

import com.mohan.bus_booking_service.DTO.RegistrationRequest;
import com.mohan.bus_booking_service.DTO.RegistrationResponse;
import com.mohan.bus_booking_service.Service.RegistrationService;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;


@RestController
@RequestMapping("/api/registrations")
public class RegistrationController {

    private final RegistrationService registrationService;

    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @PostMapping("/first")
    public RegistrationResponse register(
            @Valid@RequestBody RegistrationRequest request) {

        return registrationService.register(request);
    }
}