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
        System.out.println("\nEuros Conversion:\n" +
                "1. US Dollar\n" +
                "2. Sterling Pound\n" +
                "3. Japanese Yen\n" +
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
            case 1 -> convertor("U.S. Dollar", 0.86);
            case 2 -> convertor("Sterling Pound", 1.19);
            case 3 -> convertor("Japanese Yen", 0.0075);
            default -> {
                System.out.println("Error. Unexpected value.");
                menu();
            }
        }
    }

    private static void convertor(String curr, double v) {
        System.out.println("Currency selected: " + curr);
        System.out.print("Please enter the value to be converted: ");
        float value = new Scanner(System.in).nextFloat();
        System.out.println(value + " " + curr + " in euros is " + value / v);
        menu();
    }
}
