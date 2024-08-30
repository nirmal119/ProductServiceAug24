package com.example.ProductServiceAug24.services;

import com.example.ProductServiceAug24.exceptions.ProductNotFoundException;
import com.example.ProductServiceAug24.models.Product;

public interface ProductService {

    public Product getProductByID(long id) throws ProductNotFoundException;

}
