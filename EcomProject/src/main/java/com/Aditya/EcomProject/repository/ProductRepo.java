package com.Aditya.EcomProject.repository;

import com.Aditya.EcomProject.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryConfigurationAware;
import org.springframework.stereotype.Repository;

import static org.hibernate.boot.model.NamedEntityGraphDefinition.Source.JPA;

@Repository
public interface ProductRepo extends JpaRepository<ProductModel,Integer> {
}
