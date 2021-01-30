package com.EC.webApp.Shopping;


import javax.persistence.*;
import java.util.List;
@Entity
public class Cart {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "cart_seq")
    private long id;

    // if we removed the cart , the items will be also removed
    @OneToMany(mappedBy = "cart",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Item> items;

    public Cart() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public List<Item> getItems() {
        return items;
    }

    public void setItems(Item item) {

        this.items.add(item);
    }






}
