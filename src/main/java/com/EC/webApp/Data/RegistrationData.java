package com.EC.webApp.Data;

import com.EC.webApp.customer.Registration;
import org.springframework.data.repository.CrudRepository;

public interface RegistrationData extends CrudRepository<Registration,Long> {



}
