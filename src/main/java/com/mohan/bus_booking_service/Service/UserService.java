package com.mohan.bus_booking_service.Service;

import com.mohan.bus_booking_service.DTO.UserRequest;
import com.mohan.bus_booking_service.DTO.UserResponse;

public interface UserService {

    UserResponse user(UserRequest req);

}
