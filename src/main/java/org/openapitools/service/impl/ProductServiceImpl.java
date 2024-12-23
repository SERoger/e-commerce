package org.openapitools.service.impl;

import org.openapitools.models.Product;
import org.openapitools.repository.ProductRepository;
import org.openapitools.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll().stream().map(productEntityItem->{
            return new Product(productEntityItem.getId().toString(), productEntityItem.getName(), productEntityItem.getPrice());
        }).collect(Collectors.toList());
    }

    @Override
    public Product getProductById(String id) {
        org.openapitools.entity.Product productEntity = productRepository.findById(UUID.fromString(id)).get();
        return new Product(productEntity.getId().toString(), productEntity.getName(), productEntity.getPrice());
    }

    @Override
    public void addProduct(Product product) {
        productRepository.save(org.openapitools.entity.Product.builder()
                .id(UUID.randomUUID())
                .name(product.getName())
                .price(product.getPrice())
                .build());
    }

    @Override
    public void updateProduct(Product product) {
        productRepository.save(org.openapitools.entity.Product.builder()
                .id(UUID.fromString(product.getId()))
                .name(product.getName())
                .price(product.getPrice())
                .build());
    }
}
