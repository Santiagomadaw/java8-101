package com.ejercicios.java8;

import com.ejercicios.java8.Classes.*;
import com.ejercicios.java8.Inheritance.AnimalClass.*;
import com.ejercicios.java8.Inheritance.ShapeClass.*;
import com.ejercicios.java8.interfaces.FlyingEntity.*;

public class App {
    public static void main(String[] args) {
        System.out.println("\n Clase Person:\n");
        Person p = new Person("Paco", 3);
        p.saludar();
        System.out.println("\n Clase MyMoney:\n");
        MyMoney money = new MyMoney();
        money.setAmount(10000);
        System.out.println("Saldo en cuenta: " + money.getAmount());
        System.out.println(money.add(5000));
        System.out.println("Saldo en cuenta: " + money.getAmount());
        System.out.println(money.subtract(300));
        System.out.println("Saldo en cuenta: " + money.getAmount());
        MyMoney money2 = new MyMoney(1000, "Cartera de piel");
        money2.showMeTheMoney();
        money.showMeTheMoney();


        System.out.println("\n Clase Animal y subclases:\n");
        Animal[] bichitos = {
                new Dog(),
                new Cat(),
                new Spider()
        };

        for (Animal bicho : bichitos) {
            bicho.hacerSonido();
        }
        System.out.println("\n Clase Shape y subclases:\n");
        Shape circle = new Circle(5);
        Shape square = new Square(4);
        circle.displayArea();
        square.displayArea();

        System.out.println("\n Interfaces:\n");

        // com.ejercicios.java8.interfaces.FlyingEntity.Bird("Pigeon");
        Flying pigeon = new Bird("Pigeon");
        pigeon.fly();
        Flying boing747 = new Airplane("Boeing 747");
        boing747.fly();

    }
}
