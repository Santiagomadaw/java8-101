package com.ejercicios.java8;

import com.ejercicios.java8.Classes.Person;

import com.ejercicios.java8.Classes.MyMoney;
import com.ejercicios.java8.Inheritance.AnimalClass.Animal;
import com.ejercicios.java8.Inheritance.AnimalClass.Cat;
import com.ejercicios.java8.Inheritance.AnimalClass.Dog;
import com.ejercicios.java8.Inheritance.AnimalClass.Spider;
import com.ejercicios.java8.Inheritance.ShapeClass.Shape;
import com.ejercicios.java8.Inheritance.ShapeClass.Circle;
import com.ejercicios.java8.Inheritance.ShapeClass.Square;

public class App {
    public static void main(String[] args) {
        Person p = new Person("Paco", 3);
        p.saludar();

        MyMoney money = new MyMoney();
        money.setAmount(10000);
        System.out.println("Saldo en cuenta: " + money.getAmount());
        System.out.println(money.add(5000));
        System.out.println("Saldo en cuenta: " + money.getAmount());
        System.out.println(money.subtract(300));
        System.out.println("Saldo en cuenta: " + money.getAmount());

        Animal[] bichitos = {
                new Dog(),
                new Cat(),
                new Spider()
        };

        for (Animal bicho : bichitos) {
            bicho.hacerSonido();
        }
        Shape circle = new Circle(5);
        Shape square = new Square(4);
        circle.displayArea();
        square.displayArea();
    }
}
