package com.mohan.bus_booking_service.Service;

import com.mohan.bus_booking_service.DTO.UserRequest;
import com.mohan.bus_booking_service.DTO.UserResponse;
import com.mohan.bus_booking_service.Entity.Registration;
import com.mohan.bus_booking_service.Repository.RegistrationRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    private final RegistrationRepository derepo;

    public UserServiceImpl(RegistrationRepository derepo)
    {
        this.derepo= derepo;
    }

    @Override
    public UserResponse user(UserRequest reqb){

        Registration entityuser = derepo.findByPhoneNumber(reqb.getPhoneNumber());

        if(entityuser==null){
            throw new RuntimeException("This Phone number was not registered");
        }
        UserResponse response = new UserResponse();

        response.setId(entityuser.getId());
        response.setName(entityuser.getName());
        response.setPhoneNumber(entityuser.getPhoneNumber());
        response.setEmail(entityuser.getEmail());

        return response;

    }

}
