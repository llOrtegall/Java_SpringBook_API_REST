package com.supermarket.domain.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supermarket.domain.Product;
import com.supermarket.domain.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAll() {
        return productRepository.getAll();
    }

    public Optional<Product> getProduct(int productId) {
        return productRepository.getProduct(productId);
    }

    public Optional<List<Product>> getByCategory(int categoryId) {
        return productRepository.getByCategory(categoryId);
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public boolean delete(int productId) {
        // return getProduct(productId).map(product -> {
        // productRepository.delete(productId);
        // return true;
        // }).orElse(false);

        if (getProduct(productId).isPresent()) {
            productRepository.delete(productId);
            return true;
        }
        return false;
    }
}