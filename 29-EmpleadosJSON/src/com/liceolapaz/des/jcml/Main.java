package com.liceolapaz.des.jcml;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            printMenu();
            reqOpt();
            int option = readOption();
        }
    }

    private static int readOption() {
        Scanner scanner = new Scanner(System.in);
        int option = -1;
        try {
            option = scanner.nextInt();
        }catch(InputMismatchException e){

        }
        return option;
    }

    private static void reqOpt() {
        System.out.println("Escoja una opción: ");
    }

    private static void printMenu() {
        System.out.println("\nGestor de Empleados\n" +
                "1. Importar empleados\n" +
                "2. Añadir empleado\n" +
                "3. Modificar empleado\n" +
                "4. Eliminar empleado\n" +
                "5. Exportar empleados\n" +
                "0. Salir");
    }
}
