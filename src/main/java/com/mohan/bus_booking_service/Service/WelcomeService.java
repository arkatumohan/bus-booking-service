package com.mohan.bus_booking_service.Service;

import org.springframework.stereotype.Service;

@Service
public class WelcomeService {

    public String welcomemessage(){
        return "welcome to the bus service project";
    }
}
