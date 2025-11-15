package com.example.springboottask.Entity;

import lombok.Data;

@Data
public class Product {

    private Long id;

    private String name;

    private double price;

    private String category;


    private int stockCount;

    private String description;
}
