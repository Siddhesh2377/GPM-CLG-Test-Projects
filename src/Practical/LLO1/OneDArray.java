package Practical.LLO1;

import services.U;

import java.util.Scanner;

public class OneDArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Taking Input From User
        U.println("Enter the Number of elements ");
        int n = scanner.nextInt();

        //Creating new Data Sets to Calculate Average
        int[] num = new int[n];
        int sum = 0;

        //Storing the new Inputs in the Data set
        U.println("Enter " + n + "nums : ");
        for (int i = 0; i < n; i++) {
            num[i] = scanner.nextInt();
            sum += num[i];
        }

        //Calculating The Average
        U.println("The Average is : " + (sum / n));

    }
}
