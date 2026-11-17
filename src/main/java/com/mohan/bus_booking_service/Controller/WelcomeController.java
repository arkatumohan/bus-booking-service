package com.mohan.bus_booking_service.Controller;

import com.mohan.bus_booking_service.Service.WelcomeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    private final WelcomeService welcomeService;

    public WelcomeController(WelcomeService welcomeService){
            this.welcomeService=welcomeService;
    }
    @GetMapping("hello")
    public String welcome(){
        return welcomeService.welcomemessage();
    }

}
