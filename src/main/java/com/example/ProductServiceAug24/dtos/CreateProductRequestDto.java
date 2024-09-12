package com.example.ProductServiceAug24.dtos;

import lombok.Data;

@Data
public class CreateProductRequestDto {
    private String name;
    private String category;
    private String description;
}
