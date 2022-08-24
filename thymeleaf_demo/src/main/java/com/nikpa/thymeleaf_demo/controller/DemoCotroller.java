package com.nikpa.thymeleaf_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoCotroller {
    
    @GetMapping("/hello")
    public String sayHello(Model theModel) {
        
        theModel.addAttribute("theDate", new java.util.Date());

        return "helloworld";
    }
}
