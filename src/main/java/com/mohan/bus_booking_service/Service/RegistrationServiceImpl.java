package com.mohan.bus_booking_service.Service;

import com.mohan.bus_booking_service.DTO.RegistrationRequest;
import com.mohan.bus_booking_service.DTO.RegistrationResponse;
import com.mohan.bus_booking_service.Entity.Registration;
import com.mohan.bus_booking_service.Exception.RegistrationAlreadyExistsException;
import com.mohan.bus_booking_service.Repository.RegistrationRepository;
import org.springframework.stereotype.Service;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    private final RegistrationRepository registrationRepository;

    public RegistrationServiceImpl(
            RegistrationRepository registrationRepository) {

        this.registrationRepository = registrationRepository;
    }

    @Override
    public RegistrationResponse register(RegistrationRequest request) {

        boolean phoneExists =
                registrationRepository.existsByPhoneNumber(request.getPhoneNumber());

        boolean emailExists =
                registrationRepository.existsByEmail(request.getEmail());

        if (phoneExists && emailExists) {
            throw new RegistrationAlreadyExistsException(
                    "Phone number and email already registered"
                    
            );
        }

        if (phoneExists) {
            throw new RegistrationAlreadyExistsException(
                    "Phone number already registered"
            );
        }

        if (emailExists) {
            throw new RegistrationAlreadyExistsException ("Email already registered");
        }

        Registration registration = new Registration();

        registration.setName(request.getName());
        registration.setPhoneNumber(request.getPhoneNumber());
        registration.setEmail(request.getEmail());
        registration.setPassword(request.getPassword());

        Registration savedRegistration =
                registrationRepository.save(registration);

        RegistrationResponse response = new RegistrationResponse();

        response.setId(savedRegistration.getId());
        response.setName(savedRegistration.getName());
        response.setPhoneNumber(savedRegistration.getPhoneNumber());
        response.setEmail(savedRegistration.getEmail());
        response.setMessage("Registration successful");

        return response;
    }
}