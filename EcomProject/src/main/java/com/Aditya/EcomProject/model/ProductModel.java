package com.Aditya.EcomProject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductModel {

    @Id
    private int id;
    private String name;
    private String desc;
    private String brand;
    private String category;
    private BigDecimal price;
    private boolean available;
    private Date releaseDate;
    private int quantity;


}
