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
        System.out.println("\nGeometric Shapes:\n" +
                "1. Triangle\n" +
                "2. Rectangle\n" +
                "3. Square\n" +
                "4. Pentagon\n" +
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
    private static void runOption(int option) {
        switch (option) {
            case 0 -> System.exit(0);
            case 1 -> triangleDialog();
            case 2 -> rectangleDialog();
            case 3 -> squareDialog();
            case 4 -> pentagonDialog();
            default -> {
                System.out.println("Error. Unexpected value.");
            }
        }
        menu();
    }

    private static void pentagonDialog() {
        System.out.println("Pentagon");
        System.out.print("Please introduce the value of its side: ");
        float sideValue = readFloat();
        System.out.print("Please introduce the value of its apothem: ");
        float apothemValue = readFloat();
        float perimeter = sideValue*5;
        System.out.println("The area of the pentagon is "+(perimeter*apothemValue)/2+" and its perimeter "+perimeter);
    }

    private static void triangleDialog() {
        System.out.println("Equilateral Triangle");
        System.out.print("Please introduce the value of its base: ");
        float baseValue = readFloat();
        System.out.print("Please introduce the value of its height: ");
        float heightValue = readFloat();
        System.out.println("The area of the triangle is " + ((baseValue*heightValue)/2)+" and its perimeter " + baseValue * 3);
    }

    private static void rectangleDialog() {
        System.out.println("Rectangle");
        System.out.print("Please introduce the value of its base: ");
        float baseValue = readFloat();
        System.out.print("Please introduce the value of its height: ");
        float heightValue = readFloat();
        System.out.println("The area of the rectangle is " + (baseValue*heightValue)+" and its perimeter " + (baseValue*2+heightValue*2));
    }

    private static void squareDialog() {
        System.out.println("Square");
        System.out.print("Please introduce the value of its side: ");
        float sideValue = readFloat();
        System.out.println("The area of the square is " + Math.pow(sideValue, 2)+ " and its perimeter " + sideValue * 4);
    }
}
