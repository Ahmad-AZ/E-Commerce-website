package com.EC.webApp;

import com.EC.webApp.Data.CartRepository;
import com.EC.webApp.Data.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AZMarket {

	public static void main(String[] args) {
		SpringApplication.run(AZMarket.class, args);
	}


	@Autowired
    ItemRepository itemRepository;
	@Autowired
	CartRepository cartRepository;

//
//	@Bean
//	CommandLineRunner runner() {  //is used to run a code block only once in application’s lifetime – after application is initialized.
//
//		return args -> {
//
//
//			Item item1= new Item("12345","Herd",90.99);
//			Item item2= new Item("98751","Window",25);
//			Item item3= new Item("51845","Door",95.5);
//
//			Cart cart= new Cart("ShoppingCart");
//
//			List<Item> itemList= new ArrayList<>();
//			itemList.add(item1);
//			itemList.add(item2);
//			itemList.add(item3);
//			cart.setItems(itemList);
//
//			item1.setCart(cart);
//			item2.setCart(cart);
//			item3.setCart(cart);
//
//
//
//			cartData.save(cart);
//			itemData.save(item1);
//			itemData.save(item2);
//			itemData.save(item3);
//
//
//		};
	}






