package com.fantasy.mapper;

import com.fantasy.entity.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductMapper implements RowMapper<Product> {

    public Product mapRow(ResultSet resultSet, int i) throws SQLException {
        Product product = new Product();
        product.setId(resultSet.getInt("id"));
        product.setName(resultSet.getString("name"));
        product.setDescription(resultSet.getString("description"));
        product.setCreate_date(resultSet.getDate("create_date"));
        product.setPlace_storage(resultSet.getInt("place_storage"));
        product.setReserved(resultSet.getBoolean("reserved"));
        return product;
    }
}
