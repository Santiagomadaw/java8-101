//Simula un menú interactivo con do-while que permita repetir acciones hasta que el usuario diga "salir".

package com.ejercicios.java8.Bucles;
import java.util.Scanner;
enum Option {
    EXIT,
    FILE,
    EDIT,
    SELECTION,
    VIEW,
    TERMINAL,
    
}

public class FakeMenu {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        int option = -1;
        do {
            System.out.println("Menu");
            System.out.println("1."+ Option.FILE+"\n");
            System.out.println("2."+ Option.EDIT+"\n");
            System.out.println("3."+ Option.SELECTION+"\n");
            System.out.println("4."+ Option.VIEW+"\n");	
            System.out.println("5."+ Option.TERMINAL+"\n");
            System.out.println("0."+ Option.EXIT+"\n");
            System.out.println("Enter an option: ");
            option = scanner.nextInt();
            System.out.println("You selected option " + Option.values()[option]);
        } while (option != 0);

        if (option >= 0 && option <= 5) {
            Option selected = Option.values()[option];
            System.out.println("Elegiste: " + selected);
        } else {
            System.out.println("Por favor elige entre 0 y 5.");
        }
    }
}