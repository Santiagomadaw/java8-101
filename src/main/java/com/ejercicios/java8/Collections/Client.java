package com.ejercicios.java8.Collections;

import java.util.HashMap;
import java.util.Map;

public class Client {

    private String name;
    private Map<Products, Integer> purchases;

    Client(String name) {
        this.name = name;
        this.purchases = new HashMap<>();

    }

    public String getName() {
        return name;
    }

    public void addPurchase(Products product) {
        purchases.put(product, purchases.getOrDefault(product, 0) + 1);
    }

    public Map<Products, Integer> getPurchases() {
        return purchases;
    }

}
