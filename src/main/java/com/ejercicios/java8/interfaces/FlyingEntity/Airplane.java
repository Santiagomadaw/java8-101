package com.ejercicios.java8.interfaces.FlyingEntity;

public class Airplane implements Flying {
    private String name;

    public Airplane(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying.");
    }

}
