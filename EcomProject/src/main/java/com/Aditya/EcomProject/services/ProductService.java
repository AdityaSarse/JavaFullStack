package com.Aditya.EcomProject.services;

import com.Aditya.EcomProject.model.ProductModel;
import com.Aditya.EcomProject.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo repo ;

    public List<ProductModel> gerProducts() {

        return repo.findAll();
    }
}
