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
        //Storage the message in a variable
        String message = (number % 2 == 0) ?
                "The  number is even":
                    "The number is odd";
        //Print on screen the message
    }

    private static int readNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void reqNumber() {
        System.out.print("Type an integer:");
    }
}
