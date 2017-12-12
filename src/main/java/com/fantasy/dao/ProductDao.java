package com.fantasy.dao;

import com.fantasy.entity.Product;

import java.util.List;

public interface ProductDao {

    void save(Product product);

    Product getById(int id);

    List<Product> findAll();

    void update(Product product);

    void delete(int id);
}
