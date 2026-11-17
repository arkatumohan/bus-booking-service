package com.mohan.bus_booking_service.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Email;

@Getter
@Setter
public class RegistrationRequest {

    @NotBlank(message = "this_field_ not_ be_ blank")
    @Size(min=3, message = "the_min_size_of _the  _name _3 _characters")
    private String name;

    @Pattern(regexp = "^[0-9]{10}$",
            message = "Phone_number_ must_ be _exactly_ 10 _digits")
    private String phoneNumber;


    @Email(message = "please _enter_ valid_ mail_ id ")
    private String email;

    @Size(min = 6, message = "Password _must_ be _at_ least_ 6 _characters")
    private String password;

}
