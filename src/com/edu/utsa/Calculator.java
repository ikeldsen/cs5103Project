package com.edu.utsa;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        long firstNumber, secondNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the first number:");


        firstNumber = scanner.nextLong();
        System.out.print("Please enter the second number:");
        secondNumber = scanner.nextLong();

        System.out.print("Please enter an operator (+, -): ");
        char operator = scanner.next().charAt(0);

        scanner.close();
        long result;

        switch(operator) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            default:
                System.out.println(operator + " is not a valid operator, please try again using + or -.");
                return;
        }

        System.out.println(firstNumber + " " + operator + " " + secondNumber + ": " + result);
    }

}
