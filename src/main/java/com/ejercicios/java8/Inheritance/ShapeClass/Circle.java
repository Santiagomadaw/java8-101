//Clase abstracta Figura con método area() y subclases Círculo, Cuadrado
// Clase Círculo que hereda de Figura y implementa el método area() 
package com.ejercicios.java8.Inheritance.ShapeClass;

public class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementación del método abstracto area()
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}