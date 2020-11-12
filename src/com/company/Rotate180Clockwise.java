package com.company;

import java.util.Random;

public class Rotate180Clockwise {
    public static void main(String[] args) {
        int[][] matrixArray = new int[10][15];
        Random random = new Random();

        for (int i = 0; i < matrixArray.length; i++) {
            for (int j = 0; j < matrixArray[i].length; j++) {
                matrixArray[i][j] = random.nextInt(89) + 10;
            }
        }

        for (int i = 0; i < matrixArray.length; i++) {
            for (int j = 0; j < matrixArray[i].length; j++) {
                System.out.print(matrixArray[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nRotate 180°\n");
        for (int rows = 0; rows < matrixArray.length; rows++) {
            for (int columns = 0; columns < matrixArray[rows].length; columns++) {
                System.out.print(matrixArray[matrixArray.length - rows - 1][matrixArray[rows].length - columns - 1] + " ");
            }
            System.out.println();
        }
    }
}
