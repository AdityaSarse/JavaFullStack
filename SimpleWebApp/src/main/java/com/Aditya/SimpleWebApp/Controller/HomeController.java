package com.Aditya.SimpleWebApp.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){

        return "Hello from Home ....!";
    }
}
