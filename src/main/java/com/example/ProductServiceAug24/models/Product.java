package com.example.ProductServiceAug24.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Product {

    @Id
    private Long id;
    String name;
    String category;
    String description;

}
