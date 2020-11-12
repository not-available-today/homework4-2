package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[][] matrixArray = new int[10][15];
        Random random = new Random();

        for (int i = 0; i < matrixArray.length; i++) {
            for (int j = 0; j < matrixArray[i].length; j++) {
                matrixArray[i][j] = random.nextInt(89)+10;
            }
        }

        for (int i = 0; i < matrixArray.length; i++) {
            for (int j = 0; j < matrixArray[i].length; j++) {
                System.out.print(matrixArray[i][j] + " ");
            }
            System.out.println();
        }

        int minimum = random.nextInt(89)+10;
        for (int i = 0; i < matrixArray.length; i++) {
            for (int j = 0; j < matrixArray[i].length; j++) {
                if(matrixArray[i][j] < minimum){
                    minimum = matrixArray[i][j];
                }
            }
        }

        System.out.println(minimum + " is the minimum of this matrix");

    }
}
