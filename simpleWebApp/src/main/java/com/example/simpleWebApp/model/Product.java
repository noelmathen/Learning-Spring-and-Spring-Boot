package com.example.simpleWebApp.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Component
@Entity
public class Product {

    @Id
    private int productID;
    private String productName;
    private int price;

    public Product(){
    }

    public Product(int prodID, String productName, int price){
        this.productID = prodID;
        this.productName = productName;
        this.price = price;
    }

    public int getProdID(){
        return productID;
    }

    public void setProdID(int productID){
        this.productID = productID;
    }

    public String getProductName(){
        return productName;
    }

    public void setProductName(String productName){
        this.productName = productName;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }
    
}
