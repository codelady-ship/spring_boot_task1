package com.example.springboottask.Service;

import com.example.springboottask.Entity.Product;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ProductService {

    private final Map<String, Product> products = new HashMap<>();

    public void save(Product product) {
        products.put(product.getName(), product);
        System.out.println("Saved product : " + product.getName());
    }

    public Product getProduct(String productName) {
        Product product = products.get(productName);

        if (product == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "product not found: " + productName);
        }
        return product;
    }



}
