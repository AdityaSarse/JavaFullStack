package com.Aditya.Myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop implements Computer{

    public void compile(){
        System.out.println("Hello from Laptop ...!");
    }
}
