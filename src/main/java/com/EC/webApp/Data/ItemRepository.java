package com.EC.webApp.Data;

import com.EC.webApp.Shopping.Item;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface ItemRepository extends CrudRepository<Item,Long> {

    @Override
    List<Item> findAll();
}
