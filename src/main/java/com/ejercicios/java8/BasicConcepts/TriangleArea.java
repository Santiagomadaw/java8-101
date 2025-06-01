//Crea un programa que calcule el área de un triángulo dado su base y altura.

package com.ejercicios.java8.BasicConcepts;
import java.util.InputMismatchException;
import java.util.Scanner;
public class TriangleArea {
    public static void main(String[] args) {
        double base = 0;
        double height = 0   ;
        if (args.length != 2) {
            try {
               System.out.println("Usage: java TriangleArea base height");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the base: ");
            base = scanner.nextDouble();
                            scanner.close();

            System.out.println("Enter the height: ");
            height = scanner.nextDouble(); 
            scanner.close();

            } catch (InputMismatchException  e) {
                System.out.println("Invalid input, only numbers are allowed");
                return;
            }
            



        }else{
            try {
              base = Double.parseDouble(args[0]);
             height = Double.parseDouble(args[1]);
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid input. Only numbers are allowed");
                return;
            }
             
        }

       

        double area = (base * height) / 2;
        System.out.println("The area of the triangle is " + area);
    }
}