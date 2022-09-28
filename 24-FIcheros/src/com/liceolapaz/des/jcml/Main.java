package com.liceolapaz.des.jcml;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            printMenu();
            reqOption();
            int option = leerOpcion();
            switch (option) {
                case 0:
                    System.exit(0);
                    break;

                case 1:
                    reqPath();
                    String ruta = readPath();
                    String contenido = readTextFile(ruta);
                    if (contenido != null) {
                        printContent(contenido);
                    }
                    break;

                case 2:
                    escribirSubmenu();
                    reqOption();
                    int opcion2 = leerOpcion();
                    switch (opcion2) {
                        case 1:
                            pedirRutaOrigen();
                            String rutaOrigenTexto = readPath();
                            pedirRutaDestino();
                            String rutaDestinoTexto = readPath();
                            copiarFicheroTexto(rutaOrigenTexto, rutaDestinoTexto);
                            break;

                        case 2:
                            pedirRutaOrigen();
                            String rutaOrigenBinario = readPath();
                            pedirRutaDestino();
                            String rutaDestinoBinario = readPath();
                            copiarFicheroBinario(rutaOrigenBinario, rutaDestinoBinario);
                            break;

                        case 0:
                            continue;

                        default:
                            System.out.println("Opción no válida");
                            break;
                    }
                    break;

                case 3:
                    pedirRutaDirectorio();
                    String rutaDirectorio = readPath();
                    listarFicheros(rutaDirectorio);
                    break;

                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }

    private static void escribirSubmenu() {
        System.out.println("\nTipo de fichero a copiar\n"
                + "1. Fichero de texto\n"
                + "2. Fichero binario\n"
                + "0. Cancelar");
    }

    private static void printContent(String content) {
        System.out.print(content);
    }

    private static String readPath() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static String readTextFile(String path) {
        String content = "";
        File file = new File(path);
        if (file.isFile()) {
            try {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                String linea = br.readLine();
                while (linea != null) {
                    content += linea + "\n";
                    linea = br.readLine();
                }
                br.close();
                fr.close();
                return content;
            } catch (FileNotFoundException e) {
                System.out.println("La ruta " + path + " no es un fichero");
                return null;
            } catch (IOException e) {
                System.out.println("Error el leer el archivo");
                return null;
            }
        } else {
            System.out.println("La ruta " + path + " no es un fichero");
            return null;
        }
    }

    private static int leerOpcion() {
        Scanner escaner = new Scanner(System.in);
        try {
            return escaner.nextInt();
        } catch (InputMismatchException e) {
            return -1;
        }
    }

    private static void reqOption() {
        System.out.print("Escoja una opción: ");
    }

    private static void printMenu() {
        System.out.println("\nFICHEROS\n"
                + "1. Leer fichero de texto\n"
                + "2. Copiar fichero\n"
                + "3. Listar archivos de directorio\n"
                + "0. Salir");
    }

    private static void reqPath() {
        System.out.print("Escriba la ruta del fichero: ");
    }
    
}
