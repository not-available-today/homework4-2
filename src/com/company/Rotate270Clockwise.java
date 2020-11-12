package com.company;

import java.util.Random;

public class Rotate270Clockwise {
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

        System.out.println("\nRotate 270°\n");
        for (int columns = matrixArray[0].length - 1; columns >= 0; columns--) {
            for (int rows = 0; rows < matrixArray.length; rows++) {
                System.out.print(matrixArray[rows][columns] + " ");
            }
            System.out.println();
        }
    }
}