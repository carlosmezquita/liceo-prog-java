package com.liceolapaz.des.jcml;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Request number
        reqNumber();
        //Read the number and store it
        int number = readNumber();
        //Check if the number it is odd or even
        typeMessage(number);
    }

    private static void typeMessage(int number) {
        //Store the message in a variable
        String message = (number == 0) ?
        "The number is either odd or even":
         (number % 2 == 0) ?
                "The  number is even":
                    "The number is odd";
        //Print on screen the message
        System.out.println(message);
    }

    private static int readNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void reqNumber() {
        System.out.print("Type an integer:");
    }
}
