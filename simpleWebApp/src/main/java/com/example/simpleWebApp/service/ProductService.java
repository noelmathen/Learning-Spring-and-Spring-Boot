package com.example.simpleWebApp.service;

// import java.util.ArrayList;
// import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.simpleWebApp.model.Product;
import com.example.simpleWebApp.repository.ProductRepo;

@Service
public class ProductService {
    
    @Autowired
    ProductRepo repo;

    // List<Product> products = new ArrayList<>(Arrays.asList(
    //     new Product(101, "Laptop", 100000),
    //     new Product(102, "Monitor", 200000),
    //     new Product(103, "CPU", 300000)
    // ));


    public List<Product> getProducts(){
        // return products;
        return repo.findAll();
    }

    public Product getProductByID(int id){
        // return products.stream()
        //     .filter(p -> p.getProdID() == id)
        //     .findFirst().orElse(new Product(100, "Product Not Found!", 0));

        return repo.findById(id).orElse(new Product(100, "Product Not Found!", 0));
    }

    public void addProducts(Product prod){
        // products.add(prod);
        repo.save(prod);
    }

    public void updateProduct(Product prod) {
        // if (prod == null) {
        //     throw new IllegalArgumentException("Product must not be null");
        // }
        // // Find the index of the product with the same ID
        // for (int i = 0; i < products.size(); i++) {
        //     Product existing = products.get(i);
        //     if (existing.getProdID() == prod.getProdID()) {
        //         // Update the product at the found index
        //         products.set(i, prod);
        //         return;
        //     }
        // }
        // // If not found, you can choose to throw an exception or add the product
        // throw new IllegalArgumentException("Product with ID " + prod.getProdID() + " not found");


        repo.save(prod);
    }

    public void deleteProduct(int id){
        // for (int i = 0; i < products.size(); i++) {
        //     Product existing = products.get(i);
        //     if (existing.getProdID() == id) {
        //         // Update the product at the found index
        //         products.remove(i);
        //         return;
        //     }
        // }

        repo.deleteById(id);
    }
}
