package com.xploretown.SimpleWebApp.service;

import com.xploretown.SimpleWebApp.model.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class ProductService {
    private static final Logger logger = LoggerFactory.getLogger(ProductService.class);

    List<Product> products = new ArrayList<>(
            Arrays.asList(
                    new Product(101, "Iphone", 5000),
                    new Product(102, "Android", 30000),
                    new Product(103, "Camera", 40000)
            )
    );

    /**
     * Return the List of Products
     *
     * @return List of Products
     */
    public List<Product> getProducts() {
        return products;
    }

    /**
     * Returns the product with the matching id
     *
     * @param productId
     * @return Product with the productId
     */
    public Product getProductById(int productId) {
        // 1. Convert Array into stream
        // 2. Filter
        Product product = products.stream()
                .filter(p -> p.getProdId() == productId)
                .findFirst().get();

        return product;
    }
    
    public void addProduct(Product product) {
        logger.debug("Adding to array {}", product.toString());
        products.add(product);
    }

}
