package com.ejercicios.java8.TablesNArrays;

public class MagiCube {
    public static void main(String[] args) {

        int[][][] cube = new int[3][3][3];
        int count = 1;
        for (int floor = 0; floor < 3; floor++) {
            System.out.println("Piso " + floor);
            for (int row = 0; row < 3; row++) {
                for (int column = 0; column < 3; column++) {
                    cube[floor][row][column] = count;
                    System.out.print(cube[floor][row][column] + "\t");
                    count++;
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
