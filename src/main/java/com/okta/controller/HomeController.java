package com.okta.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
	
	@GetMapping("/")
    public String echoTheUsersEmailAddress() {
        //return "Hey there! Your email address is: " + principal.getName();
		 return "home";
    }
	
	
	@GetMapping("/checkCalories")
    public String checkCalories() {
        //return "Hey there! Your email address is: " + principal.getName();
		 return "checkCalories";
    }

}
