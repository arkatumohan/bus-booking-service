//package com.mohan.bus_booking_service.Service;
//
//
//import com.mohan.bus_booking_service.DTO.LoginRequest;
//import com.mohan.bus_booking_service.DTO.LoginResponse;
//import com.mohan.bus_booking_service.Entity.Registration;
//import com.mohan.bus_booking_service.Repository.RegistrationRepository;
//import com.mohan.bus_booking_service.util.JwtUtil;
//import org.springframework.stereotype.Service;
//
//@Service
//public class LoginServiceImpl implements LoginService {
//
//    private final RegistrationRepository registrationRepository;
//    private final JwtUtil jwtUtil;
//
//    public LoginServiceImpl(RegistrationRepository registrationRepository, JwtUtil jwtUtil){
//        this.registrationRepository = registrationRepository;
//        this.jwtUtil = jwtUtil;
//    }
//
//
//    @Override
//
//    public LoginResponse login(LoginRequest request) {
//
//        Registration registration =
//                registrationRepository.findByPhoneNumber(request.getPhoneNumber());
//
//        if (registration == null) {
//            throw new RuntimeException("Phone number not registered");
//        }
//
//        if (!registration.getPassword().equals(request.getPassword())) {
//            throw new RuntimeException("Invalid password");
//        }
//        String token = jwtUtil.generateToken(
//                registration.getPhoneNumber()
//        );
//
//        LoginResponse response = new LoginResponse();
//
//        response.setId(registration.getId());
//        response.setName(registration.getName());
//        response.setPhoneNumber(registration.getPhoneNumber());
//        response.setEmail(registration.getEmail());
//        response.setMessage("Login successful");
//        response.setToken(token);
//
//        return response;
//    }
//}
