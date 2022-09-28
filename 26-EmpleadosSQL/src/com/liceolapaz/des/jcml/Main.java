package com.liceolapaz.des.jcml;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static HashMap<String, Employee> empleados = new HashMap<>();
    public static void main(String[] args) {
        while(true) {
            escribirMenu();
            pedirOpcion();
            int opcion = leerOpcion();
            switch (opcion) {
                case 0:
                    System.exit(0);
                    break;

                case 1:
                    // Leer empleados
                    pedirRuta();
                    String ruta = leerString();
                    leerEmpleados(ruta);
                    break;

                case 2:
                    // Insertar empleado
//                    Empleado nuevoEmpleado = crearEmpleado();
//                    if (nuevoEmpleado != null) {
//                        String dni = nuevoEmpleado.getDni();
//                        if (empleados.containsKey(dni)) {
//                            System.err.println("El empleado con DNI " + dni + " ya existe");
//                            continue;
//                        }
//                        empleados.put(dni, nuevoEmpleado);
//                        System.out.println(empleados);
                    }
                    break;

                case 3:
                    // Eliminar empleado
//                    pedirDato("dni");
//                    String dni = leerString();
//                    if (!empleados.containsKey(dni)) {
//                        System.err.println("El empleado con DNI " + dni + " no existe");
//                        continue;
//                    }
//                    empleados.remove(dni);
//                    // System.out.println(empleados);
                    break;

                case 4:
                    // Modificar empleado
//                    Empleado empleadoModificado = crearEmpleado();
//                    dni = empleadoModificado.getDni();
//                    if (!empleados.containsKey(dni)) {
//                        System.err.println("El empleado con DNI " + dni + " no existe");
//                        continue;
//                    }
//                    empleados.replace(dni, empleadoModificado);
//                    System.out.println(empleados);
                    break;

                case 5:
                    // Exportar empleados
//                    pedirRuta();
//                    ruta = leerString();
//                    exportarEmpleados(ruta);
                    break;

                default:
                    System.out.println("Opción no válida");
                    break;
            }
    }

    private static void leerEmpleados(String ruta) {
        File fichero = new File(ruta);
        if (fichero.isFile()) {
            try {
                Scanner escaner = new Scanner(fichero);
                if (escaner.hasNext()) {
                    escaner.nextLine();
                    while(escaner.hasNext()) {
                        String linea = escaner.nextLine();
                        String[] columnas = linea.split(",");
                        String dni = columnas[0].substring(2, 11);
//						System.out.println(dni);

                    }
                }
            } catch (FileNotFoundException e) {
                System.out.println("La ruta " + ruta + " no existe");
            }
        } else {
            System.out.println("La ruta " + ruta + " no es un fichero");
        }
    }

    private static String leerRuta() {
        Scanner escaner = new Scanner(System.in);
        return escaner.nextLine();
    }

    private static void pedirRuta() {
        System.out.print("Escriba la ruta del fichero: ");
    }

    private static void escribirMenu() {
        System.out.println("\nGESTOR DE EMPLEADOS"
                + "\n1. Leer empleados"
                + "\n2. Añadir empleado"
                + "\n3. Eliminar empleado"
                + "\n4. Modificar empleado"
                + "\n5. Exportar empleados"
                + "\n0. Salir");
    }

    private static int leerOpcion() {
        Scanner escaner = new Scanner(System.in);
        return escaner.nextInt();
    }


    private static void pedirOpcion() {
        System.out.println("Escoja una opción: ");
    }

}
