//Clase MyMoney: métodos para ingresar, retirar y mostrar saldo.
package com.ejercicios.java8.Classes;

public class MyMoney {
    private int amount=0;
    private String wallet;
// La sobrecarga de constructores permite crear múltiples versiones del constructor de una clase, 
// diferenciadas por la cantidad y el tipo de parámetros que reciben. Esto facilita la creación de objetos 
// con diferentes configuraciones iniciales, proporcionando flexibilidad al usuario de la clase.
    public MyMoney() {
        this(0, "Mi bolsillo");
    }
    public MyMoney(int amount) {
        this(amount, "Mi bolsillo");
    }
    public MyMoney(int amount, String wallet) {
        this.amount = amount;
        this.wallet = wallet; 
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
    public String getWallet(){return wallet;}
    public void setWallet(String wallet){
        this.wallet = wallet;
    }
    public void showMeTheMoney(){
    System.out.println("Tengo "+ amount + "€ en "+wallet);
    }
}
