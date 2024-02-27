package Proyectonuevo;

import java.util.Scanner;

public class OcurrenciasString {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingresa una cadena de texto: ");
		String texto = scanner.nextLine().toLowerCase();
		texto = scanner.nextLine().toLowerCase();

		System.out.print("Ingresa la letra que deseas contar: ");
		char letra = scanner.next().toLowerCase().charAt(0);

		int contador = 0;

		for (int i = 0; i < texto.length(); i++) {
			if (texto.charAt(i) == letra) {
				contador++;
			}
		}

		System.out.println("El número de veces de aparicion de '" + letra + "'es: " + contador);
	}
}