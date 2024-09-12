package com.example.ProductServiceAug24.repositories;

import com.example.ProductServiceAug24.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    Product findFirstByName(String name);

    Product findById(long productId);

    List<Product> findAll();

    List<Product> findAllByCategory(String category);
}
