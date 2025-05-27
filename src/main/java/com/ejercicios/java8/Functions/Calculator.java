//Implementar una calculadora que reciba dos números y una operación.

package com.ejercicios.java8.Functions;

import java.util.Scanner;

public class Calculator {

    public static double Calculate(double a, double b, String operator) {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double b = sc.nextDouble();
        System.out.print("Enter the operator (+, -, *, /): ");
        String operator = sc.next();
        // TODO: Validación de datos y control de errores
        sc.close();
        double result = Calculator.Calculate(a, b, operator);
        System.out.println("Result: " + result);
    }

}
