package com.mohan.bus_booking_service.Repository;

import com.mohan.bus_booking_service.Entity.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepository extends JpaRepository<Registration, Long> {

    boolean existsByPhoneNumber(String phoneNumber);

    boolean existsByEmail(String email);

    Registration findByPhoneNumber(String phoneNumber);
}
