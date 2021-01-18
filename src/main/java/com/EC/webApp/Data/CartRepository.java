package com.EC.webApp.Data;

import com.EC.webApp.Shopping.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart,Long> {
}
