/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package cs5103Project;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public String runCalculator() {
        BigDecimal firstNumber;
        BigDecimal secondNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the first number:");

        firstNumber = scanner.nextBigDecimal();

        int numberOfDigitsInFirstNumber = getNumberOfDigits(firstNumber);

        if (isGreaterThanOneDigit(numberOfDigitsInFirstNumber)) {
            return firstNumber + " contains more than one digit, please try again.";
        }

        System.out.print("Please enter the second number:");
        secondNumber = scanner.nextBigDecimal();

        int numberOfDigitsInSecondNumber = getNumberOfDigits(secondNumber);

        if (isGreaterThanOneDigit(numberOfDigitsInSecondNumber)) {
            return secondNumber + " contains more than one digit, please try again.";
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
                return operator + " is not a valid operator, please try again using + or -.";
        }

        System.out.println(firstNumber + " " + operator + " " + secondNumber + "= " + result);

        System.out.print("Would you like to convert the number to a formatted string? (y,n):");
        String stringResult;
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
                return decisionToConvert + " is not a valid answer, please try again using y or n.";
        }

        return firstNumber + " " + operator + " " + secondNumber + " = " + stringResult;
    }

    private static boolean isGreaterThanOneDigit(int number) {
        return number <= 1;
    }

    private static int getNumberOfDigits(BigDecimal n) {
        n = n.stripTrailingZeros();
        return n.precision() - n.scale();
    }

    public static void main(String[] args) {
        System.out.println(new App().runCalculator());
    }
}