package com.liceolapaz.des.jcml;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //request numbers
        reqNumbers();
        //create a variable to store the numbers
        int[] numbers = new int[10];
        //read the numbers
        int counter = 0;
        do{

            numbers[counter] = readNumber();
            counter++;
        }while(counter < 10);
        //add them and store them
        int sumNumber = calculateSum(numbers);
        //print result
        printResult(sumNumber);
    }

    private static void printResult(int sumNumber) {
        System.out.println("The sum of the numbers equals "+sumNumber);
    }

    private static int calculateSum(int[] numbers) {
        int total = 0;
        for(int i = 0; i < numbers.length; i++) total += numbers[i];
        return total;
    }

    private static int readNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void reqNumbers() {
        System.out.println("Type 10 integers:");
    }
}
