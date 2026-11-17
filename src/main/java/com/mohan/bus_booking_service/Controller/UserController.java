package com.mohan.bus_booking_service.Controller;


import com.mohan.bus_booking_service.DTO.UserRequest;
import com.mohan.bus_booking_service.DTO.UserResponse;
import com.mohan.bus_booking_service.Service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService use;

    public UserController(UserService user)
    {
        this.use=user;
    }
@GetMapping("/details")
    public UserResponse userd(@RequestBody UserRequest ureq){
        return use.user(ureq);
    }
}
