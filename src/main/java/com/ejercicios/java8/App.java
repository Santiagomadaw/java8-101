package com.ejercicios.java8;

import com.ejercicios.java8.Classes.Person;
import com.ejercicios.java8.Classes.MyMoney;

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
    }
}
