//Clase abstracta Figura con método area() y subclases Círculo, Cuadrado

package com.ejercicios.java8.Inheritance.ShapeClass;

public abstract class Shape {
    // Método abstracto
    public abstract double area();

    public void displayArea() {
        System.out.println("El área es: " + area());
    }
}