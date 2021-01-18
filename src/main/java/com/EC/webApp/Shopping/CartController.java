package com.EC.webApp.Shopping;


import com.EC.webApp.Data.CartRepository;
import com.EC.webApp.Data.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/cart")
public class CartController {

    @Autowired
    ItemRepository itemRepository;
    @Autowired
    CartRepository cartRepository;

    @GetMapping

    public String showCart(Model model){

        List<Item> items= itemRepository.findAll();


        model.addAttribute("items",items);

        return "shopping/cart";
    }



     @GetMapping ("/saveItem/{id}") // passing the item.id after adding to the cart

    public String saveItemInTheCart(@PathVariable long id, RedirectAttributes redirectAttributes){

       Cart cart= new Cart();
       Item item=  itemRepository.findById(id).get();


         cart.setItems(item);  // TODO: saving the item in the cart


        // Code here
        return "redirect:/";
    }

}



    // we don't need it cuz we save it in the cart
    //    redirectAttributes.addFlashAttribute(" itemAfterSavingInCart",item);



