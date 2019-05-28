package com.example.billard;

import java.util.ArrayList;

public class Sale {
    private Pool pool;
    private ArrayList<Product> products;
    private ArrayList<User> users;

    public Sale(Pool pool, ArrayList<Product> products, ArrayList<User> users) {
        this.pool = pool;
        this.products = products;
        this.users = users;
    }

    public Pool getPool() {
        return pool;
    }

    public void setPool(Pool pool) {
        this.pool = pool;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }


}
