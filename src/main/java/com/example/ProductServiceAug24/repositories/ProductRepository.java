package com.example.ProductServiceAug24.repositories;

import com.example.ProductServiceAug24.models.Product;
import com.example.ProductServiceAug24.projections.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {

    Product findFirstByName(String name);

    Optional<Product> findById(long productId);

    List<Product> findAll();

    List<Product> findAllByCategory(String category);

    List<Product> findAllByNameLike(String name);

    List<Product> findAllByNameLikeIgnoreCase(String name);

    @Query(value = "SELECT p FROM products p WHERE p.id = :id")
    List<Product> selectById(long id);

    @Query(value = "select p.id, p.name, p.description from products p where id=:id", nativeQuery = true)
    ProductInfo getProductInfo(long id);
}
