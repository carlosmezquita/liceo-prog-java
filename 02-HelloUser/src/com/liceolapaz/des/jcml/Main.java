package com.liceolapaz.des.jcml;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Request user's name
        requestUserName();
        //Read user's name and store it
        String userName = readUserName();
        //Display greeting on screen
        typeGreeting(userName);
    }
    private static void typeGreeting(String userName) {
        System.out.println("Hello " + userName + "!");
    }

    private static String readUserName() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static void requestUserName() {
        System.out.print("Type your name: ");
    }


}
