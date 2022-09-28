package com.liceolapaz.des.jcml;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        //Print menu
        printMenu();
        //Read option
        int option = readInput();
        //Run option
        runOption(option);
    }
    private static void printMenu() {
        System.out.println("\nCalculator:\n" +
                "1. Sum\n" +
                "2. Rest\n" +
                "3. Multiplication\n" +
                "4. Division\n" +
                "0. Exit");
        System.out.print("Choose an option: ");
    }
    private static int readInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    private static void runOption(int option) {
        switch (option) {
            case 0 -> System.exit(0);
            case 1 -> sum();
            case 2 -> rest();
            case 3 -> multiplication();
            case 4 -> division();
            default -> {
                System.out.println("Error. Unexpected value.");
                menu();
            }
        }
    }

    private static void division() {
        System.out.println("-- DIVISION --");
        System.out.print("Enter the dividend: ");
        int dividend = readInput();
        System.out.print("Enter the divisor: ");
        int divisor = readInput();
        System.out.println(dividend+" ÷ "+divisor+" = "+dividend/divisor);
        menu();
    }

    private static void multiplication() {
        System.out.println("-- MULTIPLICATION --");
        System.out.print("Enter the multiplicand: ");
        int multiplying = readInput();
        System.out.print("Enter the multiplier: ");
        int multiplier = readInput();
        System.out.println(multiplying+" × "+multiplier+" = "+multiplying*multiplier);
        menu();
    }

    private static void rest() {
        System.out.println("-- REST --");
        System.out.print("Enter the minuend: ");
        int minuend = readInput();
        System.out.print("Enter the subtrahend: ");
        int subtrahend = readInput();
        System.out.println(minuend+" - "+subtrahend+" = "+(minuend-subtrahend));
        menu();
    }

    private static void sum() {
        System.out.println("-- SUM --");
        System.out.print("Enter the first value of the sum: ");
        int add1 = readInput();
        System.out.print("Enter the second value of the sum: ");
        int add2 = readInput();
        System.out.println(add1+" + "+add2+" = "+(add1+add2));
        menu();
    }
}
