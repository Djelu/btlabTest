package com.fantasy.entity;

import java.sql.Date;

public class Product {

    private int id;
    private String name;
    private String description;
    private Date create_date;
    private int place_storage;
    private boolean reserved;

    public Product() {
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreate_date() {
        return create_date;
    }
    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public int getPlace_storage() {
        return place_storage;
    }
    public void setPlace_storage(int place_storage) {
        this.place_storage = place_storage;
    }

    public boolean isReserved() {
        return reserved;
    }
    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }
}
