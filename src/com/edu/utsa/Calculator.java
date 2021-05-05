package com.edu.utsa;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        BigDecimal firstNumber;
        BigDecimal secondNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the first number:");


        firstNumber = scanner.nextBigDecimal();

        int numberOfDigitsInFirstNumber = getNumberOfDigits(firstNumber);

        if (numberOfDigitsInFirstNumber > 1) {
            System.out.println(firstNumber + " contains more than one digit, please try again.");
            return;
        }

        System.out.print("Please enter the second number:");
        secondNumber = scanner.nextBigDecimal();

        int numberOfDigitsInSecondNumber = getNumberOfDigits(secondNumber);

        if (numberOfDigitsInSecondNumber > 1) {
            System.out.println(secondNumber + " contains more than one digit, please try again.");
            return;
        }

        System.out.print("Please enter an operator (+, -): ");
        char operator = scanner.next().charAt(0);

        BigDecimal result;

        switch(operator) {
            case '+':
                result = firstNumber.add(secondNumber);
                break;
            case '-':
                result = firstNumber.subtract(secondNumber);
                break;
            default:
                System.out.println(operator + " is not a valid operator, please try again using + or -.");
                return;
        }

        System.out.println(firstNumber + " " + operator + " " + secondNumber + "= " + result);

        System.out.print("Would you like to convert the number to a formatted string? (y,n):");
        String stringResult = "";
        char decisionToConvert = scanner.next().charAt(0);
        scanner.close();
        switch(decisionToConvert) {
            case 'y':
                DecimalFormat formatter = new DecimalFormat("#,###.00");
                stringResult = formatter.format(result);
                break;
            case 'n':
                stringResult = result.toString();
                break;
            default:
                System.out.println(decisionToConvert + " is not a valid answer, please try again using y or n.");
                return;
        }

        System.out.println(firstNumber + " " + operator + " " + secondNumber + " = " + stringResult);
    }

    private static int getNumberOfDigits(BigDecimal n) {
        n = n.stripTrailingZeros();
        return n.precision() - n.scale();
    }

}
