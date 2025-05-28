//Clase MyMoney: métodos para ingresar, retirar y mostrar saldo.
package com.ejercicios.java8.Classes;

public class MyMoney {
    private int amount;

    public MyMoney() {
        this.amount = 0;
    }

    public int getAmount() {
        return amount;
    }

    public String setAmount(int amount) {
        this.amount = amount;
        return "Cuenta inicializada en : " + amount;

    }

    public String add(int amount) {
        this.amount += amount;
        return "Añadido a cuenta: " + amount;

    }

    public String subtract(int amount) {
        this.amount -= amount;
        return "Sacado de cuenta: " + amount;

    }
}
