package com.example.ProductServiceAug24.services;

import com.example.ProductServiceAug24.exceptions.ProductNotFoundException;
import com.example.ProductServiceAug24.models.Product;
import com.example.ProductServiceAug24.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("dbImpl")
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public Product getProductByID(long id) throws ProductNotFoundException {
        return null;
    }

    @Override
    public Product createProduct(String name, String category, String description) {

        Product p = productRepository.findFirstByName(name);
        if(p != null) {
            return p;
        }
        Product product = new Product();
        product.setCategory(category);
        product.setDescription(description);
        product.setName(name);
        product = productRepository.save(product);
        System.out.println(product.getName());
        return null;
    }

}
