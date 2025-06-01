//Programa que verifique si un número es par o impar.

package com.ejercicios.java8.Conditionals;
import java.util.Scanner;
import java.util.InputMismatchException;
public class EvenOdd {
    public static void main(String[] args) {
        int number = 0;
        if(args.length != 1) {
            try {
                System.out.println("Usage: java evenOdd number");
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter the number: ");
                number = scanner.nextInt();
                scanner.close();
            } catch (InputMismatchException  e) {
                System.out.println("Invalid input, only numbers are allowed");
                return;
            }
        }else {
            try {
                number = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid input. Only numbers are allowed");
                return;
            }
        }

        if (number % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
    }
}