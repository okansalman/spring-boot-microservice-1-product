package com.sha.springbootmicroservice1product.repository.service;

import com.sha.springbootmicroservice1product.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAllProducts();

    Product saveProduct(Product product);

    void deleteProduct(Long productId);
}
