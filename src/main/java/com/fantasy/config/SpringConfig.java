package com.fantasy.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.servlet.ServletContext;
import javax.sql.DataSource;
import java.io.File;
import java.util.Properties;

@Configuration
@ComponentScan(basePackages = {"com.fantasy.service", "com.fantasy.dao"})
public class SpringConfig {

    @Bean
    public JdbcTemplate getJdbcTemplate(){
        return new JdbcTemplate(getDataSource());
    }

    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:hsqldb:res:/database/db");
        dataSource.setUsername("SA");
        dataSource.setPassword("");
        dataSource.setDriverClassName("org.hsqldb.jdbc.JDBCDriver");
        return dataSource;
    }
}
