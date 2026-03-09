/*************************************************
Name: Wallace Tyner
Course: SDC230
Assignment: Week 1 Calculator Project
Date: 03/08/2026

Description:
This program is a console-based calculator that
demonstrates user input, integer addition,
floating-point subtraction, and formatted output.
*************************************************/

import java.util.Scanner;

public class CalculatorApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Week 1 Calculator Project");
        System.out.println("Created by Wallace Tyner");
        System.out.println();
        System.out.println("Welcome to the Console Calculator.");
        System.out.println("This program performs basic math operations.");
        System.out.println();

        // Integer addition
        System.out.println("INTEGER ADDITION");

        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;

        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println();

        // Floating subtraction
        System.out.println("FLOATING POINT SUBTRACTION");

        System.out.print("Enter first decimal number: ");
        double num3 = input.nextDouble();

        System.out.print("Enter second decimal number: ");
        double num4 = input.nextDouble();

        double result = num4 - num3;

        System.out.println(num4 + " - " + num3 + " = " + result);
        System.out.println();

        System.out.println("Thank you for using the calculator.");

        input.close();
    }
}