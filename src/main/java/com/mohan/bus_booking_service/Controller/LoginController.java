//package com.mohan.bus_booking_service.Controller;
//
//
//import com.mohan.bus_booking_service.DTO.LoginRequest;
//import com.mohan.bus_booking_service.DTO.LoginResponse;
//import com.mohan.bus_booking_service.Service.LoginService;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/access")a
//public class LoginController {
//
//    private final LoginService loserv;
//
//    public LoginController(LoginService loserv){
//        this.loserv = loserv;
//    }
//    @PostMapping("/login")
//
//    public LoginResponse log(@RequestBody LoginRequest req){
//        return loserv.login(req);
//    }
//
//}
