package Practical.LLO1;

import services.U;

import java.util.Scanner;

public class TwoDArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Taking the Input for Number of rows
        U.println("Enter the number of Row");
        int r = scanner.nextInt();

        //Taking the Input for Number of column
        U.println("Enter the number of Column");
        int c = scanner.nextInt();

        //Creating 2d Matrix arrays and 2d result array
        int[][] matrix1 = new int[r][c];
        int[][] matrix2 = new int[r][c];
        int[][] result = new int[r][c];

        //Storing The Input in Matrix 1
        U.println("Enter the num for matrix 1");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        //Storing The Input in Matrix 2
        U.println("Enter the num for matrix 2");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        //Calculating The Matrix's Result
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        //Printing the Result
        U.println("Result is Here !!");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                U.print(result[i][j] + " ");
            }
            U.println();
        }

    }

}
