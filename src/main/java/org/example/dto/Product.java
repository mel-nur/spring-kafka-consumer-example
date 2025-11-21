package org.example.dto;

import lombok.Data;

@Data
public class Product {
    private String title;
    public String description;
    public String color;
    public int price;
    public boolean isInStock;
}
