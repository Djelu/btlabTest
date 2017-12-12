package com.fantasy.service;

import com.fantasy.entity.Product;

import java.util.List;

public interface ProductService {

    void save(Product product);

    Product getById(int id);

    List<Product> findAll();

    void update(Product product);

    void delete(int id);
}
