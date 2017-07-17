package com.TurkCodes;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please input the first number.");
        String input1 = scanner.nextLine();
        double operand1 = Double.parseDouble( input1 );

        System.out.println("Please input the second number.");
        String input2 = scanner.nextLine();
        double operand2 = Double.parseDouble( input2 );

        double sum = operand1 + operand2;
        double difference = operand1 - operand2;
        double division = operand1/operand2;
        double multiplication = operand1 * operand2;
        double remainder = operand1%operand2;

        System.out.println("You inputted: " + operand1 + " and " + operand2);

        showResult(sum, difference, division, multiplication, remainder);
    }

    private static void showResult(double sum, double diff, double div, double mult, double remainder){
        System.out.println("The sum is: " + sum);
        System.out.println("The difference is: " + diff);
        System.out.println("The quotient is: " + div);
        System.out.println("The product is: " + mult);
        System.out.println("The modulus is: " + remainder);

    }
}
