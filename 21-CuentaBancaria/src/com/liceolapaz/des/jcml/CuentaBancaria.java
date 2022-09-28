package com.liceolapaz.des.jcml;

import java.util.Scanner;

public class CuentaBancaria {
    public static void main(String[] args) {
        mainMenu();

    }
    public static String type = "none";
    public static float balance = 0;

    private static void mainMenu() {
        //Print menu
        printMenu();
        //Read option
        int option = readInput();
        //Run option
        runOption(option);
    }
    private static void printMenu() {
        System.out.println("\nBank:\n" +
                "Account selected: " + type+
                "\n1. Create Account\n" +
                "2. Deposit money\n" +
                "3. Withdraw money\n" +
                "4. Check money balance\n" +
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
            case 0:
                break;
            case 1:
                //Print account menu
                accountMenu();
                break;
            case 2:
                //Deposit money
                depositMoney();
                break;
            case 3:
                //Withdraw money
                withdrawMoney();
                break;
            case 4:
                //Check balance
                System.out.println("Current balance: "+ balance);
                mainMenu();
                break;
            default:
                System.out.println("Error. Unexpected value.");
                mainMenu();
                break;
        }
    }
    private static void accountMenu() {
        System.out.println("\nBank:\n" +
                "1. Regular account\n" +
                "2. Premium account\n" +
                "3. Check money balance\n" +
                "0. Exit");
        System.out.print("Choose an option: ");
        int opt = readInput();
        switch (opt) {
            case 0 -> mainMenu();
            case 1 -> {
                //Regular Account
                type = "regular";
                balance = 0;
                depositMoney();
            }
            case 2 -> {
                //Premium account
                type = "premium";
                balance = 0;
                depositMoney();
            }
            default -> {
                System.out.println("Error. Unexpected value.");
                mainMenu();
            }
        }
    }
    private static void withdrawMoney() {
        if (type != "none"){
            System.out.print("Please enter the amount of money to be withdrawn: ");
            float amountWithdrawn = positiveInput();
            if (type == "regular" && (balance - amountWithdrawn < 0))
            {
                System.out.println("Error. With a regular account you can not have a negative balance.");
            }else{
                balance -= amountWithdrawn;
                System.out.println("Current balance: "+ balance);}
        } else{
            System.out.println("Error. You need to create an account");
        }
        mainMenu();
    }
    private static void depositMoney() {
        if (type != "none"){
            System.out.print("Please enter the amount of money to be deposited: ");
            float amountDeposited = positiveInput();
            balance += amountDeposited;
            System.out.println("Current balance: "+ balance);
        } else{
            System.out.println("Error. You need to create an account");
        }
        mainMenu();
    }

    private static float positiveInput() {
        float amount = readFloat();
        while (amount < 0){
            System.out.print("Please enter a positive number: ");
            amount = readFloat();
        }
        return amount;
    }

}
