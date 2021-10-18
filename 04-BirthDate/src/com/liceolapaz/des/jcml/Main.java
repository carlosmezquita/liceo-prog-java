package com.liceolapaz.des.jcml;

import java.util.Scanner;

public class Main {

    private static final int CURRENT_YEAR = 2021;

    public static void main(String[] args) {
        //Request birth year
        reqYear();
        //Read year and store it
        int birthYear = readYear();
        //Print the message
        printMsg(birthYear);
    }

    private static void printMsg(int birthYear) {
        //Create a variable to store the message
        String msgResult = "";
        //Check the year and store the message in the variable
        if ((birthYear > CURRENT_YEAR)||(CURRENT_YEAR - birthYear >= 150)){
            msgResult = "Invalid year.";
        } else if (CURRENT_YEAR - birthYear >= 18){
            msgResult="Access granted ✅";
        } else {
            msgResult = "Access denied ❌";
        }
        //Print the message
        System.out.println(msgResult);
    }

    private static int readYear() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void reqYear() {
        System.out.print("Type your birth year: ");
    }
}
