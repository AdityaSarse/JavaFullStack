package com.Aditya.SimpleWebApp.Service;

import com.Aditya.SimpleWebApp.Model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    List<Product> Product = Arrays.asList(new Product (101 , "Canon Camera" , 50000),
            new Product(102, "iPhone", 150000));

    public List<Product> getProducts() {
        return Product;
    }

}
