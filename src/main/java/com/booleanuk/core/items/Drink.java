package com.booleanuk.core.items;

import com.booleanuk.core.Item;

public class Drink implements Item {
    String name;
    int price;

    public Drink(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }
}