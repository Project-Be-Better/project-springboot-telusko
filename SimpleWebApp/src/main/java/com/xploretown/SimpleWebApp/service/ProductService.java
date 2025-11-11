package com.xploretown.SimpleWebApp.service;

import com.xploretown.SimpleWebApp.model.Product;
import com.xploretown.SimpleWebApp.repository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ProductService {
    private static final Logger logger = LoggerFactory.getLogger(ProductService.class);

    @Autowired
    ProductRepository productRepository;

    /**
     * Return the List of Products
     *
     * @return List of Products
     */
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    /**
     * Returns the product with the matching id
     *
     * @param productId
     * @return
     */
    public Optional<Product> getProductById(int productId) {
        return productRepository.findById(productId);
    }

    public void addProduct(Product product) {
        logger.debug("Adding to Database {}", product.toString());
        productRepository.save(product);
    }

    public void updateProduct(Product product) {
        logger.debug("Updating to Database {}", product.toString());
        productRepository.save(product);
    }

}
