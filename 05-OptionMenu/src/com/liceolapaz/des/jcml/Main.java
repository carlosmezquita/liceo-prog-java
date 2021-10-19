package com.liceolapaz.des.jcml;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Print menu
        printMenu();
        //Request setting
        reqSetting();
        //Read setting
        int option = readOption();
        //Print message on screen
        printMessageOnScreen(option);
    }

    private static void printMessageOnScreen(int option) {
        // Create a variable to store the message
        String message = "";
		//Give the variable a value
        switch (option) {
            case 0:
                System.exit(0);
                break;

            case 1:
                message = "Option 1 selected";
                break;

            case 2:
                message = "Option 2 selected";
                break;

            case 3:
                message = "Option 3  selected";
                break;

            default:
                message = "Invalid Option";
                break;
        }
        // Print message on screen
        System.out.println(message);
    }

    private static int readOption() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void reqSetting() {
        System.out.println("Choose an option");
    }

    private static void printMenu() {
        System.out.println("MAIN MENU\n"
                + "1. Option 1\n"
                + "2. Option 2\n"
                + "3. Option 3\n"
                + "0. Option");
    }
}
