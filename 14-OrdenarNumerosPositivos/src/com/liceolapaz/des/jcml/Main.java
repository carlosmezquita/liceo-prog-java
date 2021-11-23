package com.liceolapaz.des.jcml;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Introduzca 10 números enteros positivos:");
        int n = 0;
        ArrayList<Integer> nums = new ArrayList<>();
        while (n<10){
            int input = readInput();
            if(input>0){
                nums.add(input);
                n++;
            }
            else{
                System.out.println("Introduzca un número positivo");
            }
        }
        System.out.print("Los números introducidos fueron: ");
        Collections.sort(nums);
        Collections.reverse(nums);
        System.out.println(nums);
    }
    private static int readInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }}
