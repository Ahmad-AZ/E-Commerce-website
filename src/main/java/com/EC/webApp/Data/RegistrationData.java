package com.EC.webApp.Data;

import com.EC.webApp.customer.Registration;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface RegistrationData extends CrudRepository<Registration,Long> {

    @Override
    List<Registration> findAll();

    default String findByEmail( Registration registration){

        return registration.getEmail();
    };
}
