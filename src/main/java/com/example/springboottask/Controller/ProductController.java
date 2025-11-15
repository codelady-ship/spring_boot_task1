package com.example.springboottask.Controller;

import com.example.springboottask.Service.ProductService;
import com.example.springboottask.Entity.Product;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;


@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService productService;

    public ProductController(ProductService productService) {

        this.productService = productService;
    }

   // /products/{name} → GET
   @GetMapping("/{name}")
   public Product getProduct(@PathVariable String name) {
       return productService.getProduct(name);
   }

    // /products → POST
    @PostMapping
    public String saveProduct(@RequestBody Product product) {

        if (product.getName() == null || product.getName().isBlank()) {
            throw new IllegalArgumentException("Product name cannot be empty!");
        }

        productService.save(product);
        return "product added or updated: " + product.getName();
    }




}
