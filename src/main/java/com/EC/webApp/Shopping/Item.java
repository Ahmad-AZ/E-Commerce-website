package com.EC.webApp.Shopping;


import javax.persistence.*;
import javax.validation.constraints.Pattern;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator ="item_seq")
    private long id;
    private String name;
    private String description;
    private String image;
    @Pattern(regexp = "^[0-9]+([.][0-9]{1,2})?",message = "Expected Price: 2, 2.99, 22.99")
    private String price;


    @ManyToOne
    private Cart cart;

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Item() {
    }

    public Item(String description, String name, String price,String image) {
        this.description = description;
        this.name = name;
        this.price = price;
        this.image= image;
    }

    public String getImage() {
        return image;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
