package Practical.LLO1;

import services.U;

import java.util.Scanner;

public class ArithmeticOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        U.println("Enter the First Number : ");
        double n1 = scanner.nextDouble();

        U.println("Enter the Second Number : ");
        double n2 = scanner.nextDouble();

        //Addition
        U.println("Sum > " + (n1 + n2));

        //Subtraction
        U.println("Sum > " + (n1 - n2));

        //Multiplication
        U.println("Sum > " + (n1 * n2));

        //Division & Checking the n2 is not to be 0
        if (n2 != 0)
            U.println("Sum > " + (n1 / n2));
        else
            U.println("Division by 0 is Not Allowed");

        //Finding Reminder & Checking the n2 is not to be 0
        if (n2 != 0)
            U.println("Sum > " + (n1 % n2));
        else
            U.println("Cannot Find Remainder with 0");

    }

}
