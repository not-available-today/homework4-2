package com.company;

import java.util.Random;
import java.util.Scanner;

public class SumOfRowElements {
    public static void main(String[] args) {
        int[][] matrixArray = new int[10][15];
        int rowNumber;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

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


        while (true) {
            boolean outOfRange = false;
            int sum = 0;
            System.out.println("Enter a row number");
            rowNumber = scanner.nextInt();
            for (int rows = 0; rows < matrixArray.length; rows++) {
                for (int columns = 0; columns < matrixArray[rows].length; columns++) {
                    if (rowNumber > matrixArray.length || rowNumber < 0) {
                        outOfRange = true;
                        break;
                    } else if (rows == rowNumber) {
                        sum += matrixArray[rows][columns];
                    } else {
                        continue;
                    }
                }

            }
            if (outOfRange) {
                System.out.println("That row doesn't exist");
            } else {
                System.out.println("The sum of row " + rowNumber + " is " + sum);
            }
        }
    }
}
