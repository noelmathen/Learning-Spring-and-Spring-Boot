package com.example.simpleWebApp.model;

import lombok.Data;

public class Product {

    @Data
    private int productID;
    private String productName;
    private int price;
}
