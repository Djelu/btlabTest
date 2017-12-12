package com.fantasy.dao;

import com.fantasy.entity.Product;
import com.fantasy.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductDaoImpl implements ProductDao{

    @Autowired
    public JdbcTemplate jdbcTemplate;


    public void save(Product product) {
        String sql = "INSERT INTO products (name, description, create_date, place_storage, reserved) VALUES (?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, product.getName(), product.getDescription(), product.getCreate_date(), product.getPlace_storage(), product.isReserved());

    }

    public Product getById(int id) {
        String sql = "SELECT * FROM products WHERE id=?";
        return jdbcTemplate.queryForObject(sql, new ProductMapper(), id);
    }

    public List<Product> findAll() {
        String sql = "SELECT * FROM products";
        return jdbcTemplate.query(sql, new ProductMapper());
    }

    public void update(Product product) {
        String sql = "UPDATE products SET name=?, description=?, create_date=?, place_storage=?, reserved=? WHERE id=?";
        jdbcTemplate.update(sql, product.getName(), product.getDescription(), product.getCreate_date(), product.getPlace_storage(), product.isReserved(), product.getId());
    }

    public void delete(int id) {
        String sql = "DELETE FROM products WHERE id=?";
        jdbcTemplate.update(sql, id);

    }
}
