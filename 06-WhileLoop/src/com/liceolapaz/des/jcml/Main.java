package com.liceolapaz.des.jcml;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Request the user the number be guessed
        reqMainNumber();
        //Reading the number that has to be guessed and storing it
        int toBeGuessedNum = readNumber();
        //Request the user the max. number of attempts.
        reqMaxAttempts();
        //Variable to store the number we are looking for
        int maxAttempts = readNumber();
        //Storing attempts number
        int attemptsNumber =0;
        while (attemptsNumber < maxAttempts) {
            //Creating a random number and storing it
            int randomNumber = generateRandomNumber(1, 10);
            //Print random number
            System.out.println("The random number is " + randomNumber);
            //Add 1 attempt
            attemptsNumber++;

            //Check if both numbers matches
            checkNumber(toBeGuessedNum, randomNumber, attemptsNumber, maxAttempts);
            if (toBeGuessedNum == randomNumber){
                break;
            }
        }
    }

    private static void checkNumber(int mainNumber, int randomNumber, int attemptsNumber, int maxAttempts) {
        //Print if they match
        if (mainNumber == randomNumber){
            System.out.println("Number guessed within "+attemptsNumber+" attempt(s).");

        }else if(attemptsNumber < maxAttempts){
            System.out.println("Attempts: " + attemptsNumber+"/"+maxAttempts);
        }else{
            System.out.println("Attempts: " + attemptsNumber+"/"+maxAttempts);
            System.out.println("Game over :(");
        }

    }

    private static int generateRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max + 1 - min) + min;
    }

    private static void reqMaxAttempts() {
        System.out.print("Type a maximum number of attempts: ");
    }

    private static int readNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void reqMainNumber() {
        System.out.print("Type a number to be guessed between 1 and 10: ");
    }
}
