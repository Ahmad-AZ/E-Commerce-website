package com.EC.webApp.customer;


import com.EC.webApp.Data.RegistrationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {


    //TODO: create a method to display login form

   @Autowired
   RegistrationData registrationData;

    @GetMapping("/new")
    public String login(Model model){

        model.addAttribute("login",new Registration());

        return "Registration/logIn";
    }

    @GetMapping("/registration")
    public String registration(Model model){

        model.addAttribute("registration",new Registration());
        return "Registration/registrationForm";
    }


    
    @PostMapping("/save")
    public String saveForm( Registration registration  ,  RedirectAttributes redirect){



        List<Registration> allUsers= registrationData.findAll();

        for ( Registration user: allUsers) {
            if (user.getEmail().equals(registration.getEmail())){

                System.out.println("the user is already exists");

            }
            else {
                registrationData.save(registration);
            }
        }




        redirect.addFlashAttribute("regForm",registration); // temporary to display the data

        return "redirect:/customer/display";
    }

    @GetMapping("/display")
    public String display(@ModelAttribute("regForm") Registration registration){



        return "Registration/submittedForm";
    }




}
