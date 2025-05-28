package com.ejercicios.java8.Classes;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void saludar() {
        System.out.println(
                "Hola, soy " + name + " y" + ((age >= 18) ? " tengo " + age + "años" : " no debo hablar con extraños"));
    }
}
