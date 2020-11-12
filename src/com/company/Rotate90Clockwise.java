package com.company;

import java.util.Random;

public class Rotate90Clockwise {
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

        System.out.println("\nRotate 90°\n");
        for (int rows = 0; rows < matrixArray[0].length; rows++) {
            for (int columns = matrixArray.length - 1; columns >= 0; columns--) {
                System.out.print(matrixArray[columns][rows] + " ");
            }
            System.out.println();
        }
    }
}
