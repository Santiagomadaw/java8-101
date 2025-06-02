package com.ejercicios.java8.Collections;

enum Products {
    POPCORN(1, "Palomitas", 5.0),
    SODA(2, "Refresco", 3.0),
    CANDY(3, "Caramelos", 2.0),
    ICE_CREAM(4, "Helado", 4.0),
    EXIT(5, "Salir", 0.0);

    private final String name;
    private final double price;
    private int id;

    Products(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
