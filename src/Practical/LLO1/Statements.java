package Practical.LLO1;

import services.U;

import java.util.Scanner;

public class Statements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        U.println("Enter a Number :");
        int n = scanner.nextInt();

        //1st Statement : if
        if (n > 0) U.println("The Number is grater then 0");

        //2ed Statement
        if (n > 0) U.println("The Number is grater then 0");
        else U.println("The Number is Either 0 or Less then 0");

        /* 3d Statement : switch
           Creating a new input to guess days of weeks
         */

        U.println("\nEnter a Number from 1 - 7 :");
        int days = scanner.nextInt();

        switch (days) {
            case 1:
                U.println("Sunday");
                break;

            case 2:
                U.println("Monday");
                break;
            case 3:
                U.println("Tuesday");
                break;
            case 4:
                U.println("Wednesday");
                break;
            case 5:
                U.println("Thursday");
                break;
            case 6:
                U.println("Friday");
                break;
            case 7:
                U.println("Saturday");
                break;
            default:
                U.println("Invalid Input");
                break;

        }

    }

}
