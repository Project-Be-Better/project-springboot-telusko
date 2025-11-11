package com.xploretown.SimpleWebApp.controller;

import com.xploretown.SimpleWebApp.model.Product;
import com.xploretown.SimpleWebApp.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    //    ProductService productService = new ProductService();
    @Autowired
    ProductService productService;

    @GetMapping("/")
    public String greet() {
        return "Content of the Homepage";
    }

    @GetMapping("/products")
    public List<Product> getProducts() {
        return productService.getProducts();
    }

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable int id) {
        return productService.getProductById(id);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product product) {
//        System.out.println(product);
        logger.debug(product.toString());
        productService.addProduct(product);
    }

}
