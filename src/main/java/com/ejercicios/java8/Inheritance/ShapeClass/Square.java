package com.ejercicios.java8.Inheritance.ShapeClass;

public class Square extends Shape {
    private double side;

    // Constructor
    public Square(double side) {
        this.side = side;
    }

    // Implementación del método abstracto area()
    @Override
    public double area() {
        return side * side;
    }

}
