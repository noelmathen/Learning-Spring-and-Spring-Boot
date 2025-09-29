package com.example.simpleWebApp.model;


public class Product {

    private int productID;
    private String productName;
    private int price;

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
