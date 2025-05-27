//Mostrar una tabla de multiplicar del 1 al 10.
//todo añadir los espacios enecesarios para que las tablas queden alineadas por columnas
package com.ejercicios.java8.Bucles;

public class MultiplyTable {
    public static void main(String[] args) {
    for (int firstParam = 0; firstParam <= 10; firstParam++) {
        
        for (int secondParam = 1; secondParam <= 10; secondParam++) {
            
            if (firstParam == 0) {
                System.out.print(" Tabla del " + secondParam+ "\t");
                if (secondParam == 10) {
                    System.out.print("\n");
                }
            }else{
                System.out.print(" " + secondParam + " x " + firstParam + " = " + (firstParam * secondParam)+ "\t");
                if (secondParam == 10) {
                    System.out.print("\n");
                }
            }
        }
       
        }
            
    }
}
