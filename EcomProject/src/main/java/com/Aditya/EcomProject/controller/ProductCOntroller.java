package com.Aditya.EcomProject.controller;


import com.Aditya.EcomProject.model.ProductModel;
import com.Aditya.EcomProject.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductCOntroller {

    @Autowired
    private ProductService service;

    @RequestMapping("/")
    public String greet(){
        return "hello";
    }

    @GetMapping("/products")

    public List<ProductModel> getProducts(){
        return service.gerProducts();

    }
}
