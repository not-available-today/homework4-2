package com.company;

import java.util.Random;
import java.util.Scanner;

public class MatrixMenu {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(89) + 10;
            }
        }

        boolean exit = false;
        while(!exit) {
            System.out.println();
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("———————- MENU —————-\n" +
                    "Press 1 to rotate 90°\n" +
                    "Press 2 to rotate 180°\n" +
                    "Press 3 to rotate 270°\n" +
                    "Press 4 to Exit.\n" +
                    "————————————————");

            int userChoice = scanner.nextInt();
            if(userChoice > 4 || userChoice < 1){
                System.out.println("That is not a valid choice.");
                continue;
            }
            switch(userChoice){
                case 1:
                    System.out.println("\nRotate 90°\n");
                    for (int rows = 0; rows < matrix[0].length; rows++) {
                        for (int columns = matrix.length - 1; columns >= 0; columns--) {
                            System.out.print(matrix[columns][rows] + " ");
                        }
                        System.out.println();
                    }
                    continue;
                case 2:
                    System.out.println("\nRotate 180°\n");
                    for (int rows = 0; rows < matrix.length; rows++) {
                        for (int columns = 0; columns < matrix[rows].length; columns++) {
                            System.out.print(matrix[matrix.length - rows - 1][matrix[rows].length - columns - 1] + " ");
                        }
                        System.out.println();
                    }
                    continue;
                case 3:
                    System.out.println("\nRotate 270°\n");
                    for (int columns = matrix[0].length - 1; columns >= 0; columns--) {
                        for (int rows = 0; rows < matrix.length; rows++) {
                            System.out.print(matrix[rows][columns] + " ");
                        }
                        System.out.println();
                    }
                    continue;
                case 4:
                    exit = true;
                    break;
            }
        }

        System.out.println("Good bye!");
    }
}
