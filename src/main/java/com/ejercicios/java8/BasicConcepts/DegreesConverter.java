//Escribe un programa que convierta grados Celsius a Fahrenheit.

package com.ejercicios.java8.BasicConcepts;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
public class DegreesConverter {
    public static void main(String[] args) {
        List<Character> validUnits = Arrays.asList('C', 'F');
        char unit='C';
        double amount = 0;
        double convertedAmount = 0;
        
        if (args.length != 2 ) {
            System.out.println("Usage: java DegreesConverter amount (C or F)");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter degrees (number): ");
            amount = scanner.nextDouble();
            System.out.println("Enter unit (C or F): ");
            unit = scanner.next().toUpperCase().charAt(0);
        }else {
            amount = Double.parseDouble(args[0]);
            unit = args[1].toUpperCase().charAt(0);
            
        }
        if (!validUnits.contains(unit)) {
            System.out.println("Invalid unit");
            return;
        }
            if (unit =='C') {
                convertedAmount = (amount * 9 / 5) + 32;
                System.out.println("The fahrenheit is " + convertedAmount);
            }else if(unit == 'F') {
                convertedAmount = (amount - 32) * 5 / 9;
                System.out.println("The celsius is " + convertedAmount);
            }
      
    }
}

