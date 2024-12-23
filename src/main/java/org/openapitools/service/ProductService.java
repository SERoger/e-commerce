package org.openapitools.service;


import org.openapitools.models.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    Product getProductById(String id);
    void addProduct(Product product);
    void updateProduct(Product product);
}
