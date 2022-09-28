package com.liceolapaz.des.jcml;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		// Pedir los números
		pedirNumeros();
		// Variable para almacenar números
		int[] numeros = new int[10];
		// Variable para contar números almacenados
		int numerosAlmacenados = 0;
		while(true) {
			// Leer el número y almacenarlo
			int numero = leerNumero();
			// Si es positivo
			if (numero > 0) {
				// Almacenarlo
				numeros[numerosAlmacenados] = numero;
				numerosAlmacenados++;
			}
			// Si no es positivo
			else {
				// Mostrar un mensaje de error
				System.out.println("Por favor, introduzca solo números enteros positivos");
				continue;
			}
			if (numerosAlmacenados == 10) {
				break;
			}
		}
		// Escribir números
		escribirNumeros(numeros);
		// Escribir mensaje de despedida
		System.out.println("¡Hasta la próxima!");
	}

	private static void escribirNumeros(int[] numeros) {
		System.out.print("Los números introducidos fueron:");
		for (int i = numeros.length - 1; i >= 0; i--) {
			System.out.print(" " + numeros[i]);
		}
		System.out.println();
	}

	private static int leerNumero() {
		Scanner escaner = new Scanner(System.in);
		return escaner.nextInt();
	}

	private static void pedirNumeros() {
		System.out.println("Escriba 10 números enteros positivos enteros:");
	}
}
