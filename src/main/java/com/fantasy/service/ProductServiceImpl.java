package com.fantasy.service;

import com.fantasy.dao.ProductDao;
import com.fantasy.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    public ProductDao productDao;

    public void save(Product product) {
        productDao.save(product);
    }

    public Product getById(int id) {
        return productDao.getById(id);
    }

    public List<Product> findAll() {
        return productDao.findAll();
    }

    public void update(Product product) {
        productDao.update(product);
    }

    public void delete(int id) {
        productDao.delete(id);
    }
}
