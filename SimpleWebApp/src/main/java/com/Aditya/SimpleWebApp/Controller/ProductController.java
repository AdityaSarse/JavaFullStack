package com.Aditya.SimpleWebApp.Controller;

import com.Aditya.SimpleWebApp.Model.Product;
import com.Aditya.SimpleWebApp.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
@RestController
public class ProductController {
    @Autowired
    ProductService service ;
    @RequestMapping("/products")
    public List<Product> getService() {
        return service.getProducts();
    }
}
