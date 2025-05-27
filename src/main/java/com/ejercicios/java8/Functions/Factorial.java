package com.ejercicios.java8.Functions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Factorial {

    public static int factorial(int n) {

        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 0;
        if (args.length != 1) {
            System.out.println("Usage: java Factorial n");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number: ");
            try {
                n = scanner.nextInt();
                scanner.close();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, only numbers are allowed");
                return;
            }
        } else {
            try {
                n = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid input. Only numbers are allowed");
                return;
            }
        }
        if (n < 0) {
            System.out.println("Error: Invalid input. Only positive numbers are allowed");
            return;
        }
        System.out.println("The factorial of " + n + " is " + factorial(n));
    }
}
