package com.liceolapaz.des.jcml;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        //Print menu
        printMenu();
        //Read option
        int option = readOption();
        //Run option
        runOption(option);
    }

    private static void runOption(int option) {
        switch (option) {
            case 0:
                break;
            case 1:
                easyGame();
                break;
            case 2:
                hardGame();
                break;
            default:
                System.out.println("Error. Unexpected value.");
                menu();
        }
    }

    private static void hardGame() {
        int randomNumber = generateRandomNumber(1, 50);
        System.out.println("Guess a number between 1 and 50");
        int maxAttempts = 5;
        int attempts = 0;
        Game(randomNumber, maxAttempts);

    }

    private static void Game(int randomNumber, int maxAttempts) {
        int attempts = 0;
        while (attempts < maxAttempts){
            Scanner scanner = new Scanner(System.in);
            int numberGuess = scanner.nextInt();
            attempts++;
            System.out.println("Attempts: "+attempts+"/"+maxAttempts);
            if (randomNumber == numberGuess){
                System.out.println("Number guessed within " + attempts + " attempt(s)");
                break;}
            else if (attempts == maxAttempts){
                System.out.println("Game over, the number was: " +randomNumber);
            }
            else if (randomNumber > numberGuess){
                System.out.println("The number it's bigger.");
            }else if(randomNumber < numberGuess) {
                System.out.println("The number it's smaller.");
            }
            }

        menu();
    }

    private static int generateRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max +1- min) + min;
    }


    private static void easyGame() {
        int randomNumber = generateRandomNumber(1, 10);
        System.out.println("Guess a number between 1 and 10");
        int maxAttempts = 3;
        int attempts = 0;
        Game(randomNumber, maxAttempts);
        printMenu();
    }

    private static int readOption() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void printMenu() {
        System.out.println("\nMAIN MENU:\n" +
                "1. From 1 to 10 (3 attempts)\n" +
                "2. From 1 to 50 (5 attempts)\n" +
                "0. Exit");
        System.out.print("Choose an option: ");
    }
}
