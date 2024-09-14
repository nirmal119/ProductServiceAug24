package com.example.ProductServiceAug24.services;

import com.example.ProductServiceAug24.exceptions.ProductNotFoundException;
import com.example.ProductServiceAug24.models.Product;
import com.example.ProductServiceAug24.projections.ProductInfo;
import com.example.ProductServiceAug24.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service("dbImpl")
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public Product getProductByID(long id) throws ProductNotFoundException {
        ProductInfo productInfo = productRepository.getProductInfo(id);
        System.out.println(productInfo.getDescription());
        System.out.println(productInfo.getName());
        System.out.println(productInfo.getId());


        Optional<Product> optionalProduct = productRepository.findById(id);
        if(optionalProduct.isPresent()){
            Product product = optionalProduct.get();
            return product;
        } else {
            throw new ProductNotFoundException("Product not found");
        }
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
