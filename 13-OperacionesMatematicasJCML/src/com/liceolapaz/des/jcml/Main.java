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

    private static void runOption(int option) {
        switch (option) {
            case 0 -> System.exit(0);
            case 1 -> power();
            case 2 -> sqrt();
            default -> System.out.println("Error. Unexpected value.");
        }
        menu();
    }

    private static void sqrt() {
        System.out.println("Square Root");
        System.out.print("Please introduce the operator: ");
        float operator = readFloat();
        System.out.println("The square root of "+operator+" is "+ (Math.sqrt(operator)));
    }

    private static void power() {
        System.out.println("Power");
        System.out.print("Please introduce the value of its base: ");
        float baseValue = readFloat();
        System.out.print("Please introduce the value of its exponent: ");
        float exponentValue = readFloat();
        System.out.println(baseValue+" to the power "+exponentValue+" is "+Math.pow(baseValue, exponentValue));
    }

    private static void printMenu() {
        System.out.println("\nCalculus:\n" +
                "1. Power\n" +
                "2. Square root\n" +
                "0. Exit");
        System.out.print("Choose an option: ");
    }
    private static int readInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    private static float readFloat() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextFloat();
    }
}
