//Crear una matriz de 3x3 y llenar con la secuencia del 1 al 9.

package com.ejercicios.java8.TablesNArrays;

public class NineMatrix {
    // Sumar dos matrices de 3x3.

    public static void sumMatrix(int[][] matrixA, int[][] matrixB) {
        int[][] result = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = new int[3][3];// en un array de arrays tambien se se debe declarar el tamaño.
        int count = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = count;
                System.out.print(matrix[i][j] + "\t");
                count++;
            }
            System.out.println();
        }
        System.out.println();
        int[][] matrix2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };// se pueden declarar los valores de los arrays en
                                                                    // la misma linea
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix2[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        sumMatrix(matrix, matrix2);
    }
}
