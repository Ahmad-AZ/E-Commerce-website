package com.EC.webApp.controllers;

import com.EC.webApp.Data.ItemRepository;
import com.EC.webApp.Shopping.Item;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("/")
public class HomePage {






    @Autowired
    ItemRepository ItemRepo;
    @GetMapping
    public String displayHomePage(Model model){


        List<Item> allItems=ItemRepo.findAll();
        model.addAttribute("itemsList",allItems);
        return "Home";
    }















}
