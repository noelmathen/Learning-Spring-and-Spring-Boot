package com.example.simpleWebApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.simpleWebApp.model.Product;
import com.example.simpleWebApp.service.ProductService;

@RestController
public class ProductController {
    
    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getProducts(){
        return service.getProducts();
    }

    @GetMapping("/products/{id}")
    public Product getProductByID(@PathVariable int id){
        return service.getProductByID(id);
    }

    @PostMapping("/products")
    public void addProducts(@RequestBody Product prod){
        service.addProducts(prod);
    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Product prod){
        service.updateProduct(prod);
    }

    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable int id){
        System.out.println("Method is called");
        service.deleteProduct(id);
    }
}
