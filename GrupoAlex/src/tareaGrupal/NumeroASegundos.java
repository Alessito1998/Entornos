package Proyectonuevo;

import java.util.Scanner;

public class NumeroASegundos {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingresa el número de segundos: ");
		int segundosTotales = scanner.nextInt();

		int horas = segundosTotales / 3600;
		int minutos = (segundosTotales % 3600) / 60;
		int segundos = segundosTotales % 60;

		System.out.println(segundosTotales + " segundos son " + horas + " horas, " + minutos + " minutos, y " + segundos
				+ " segundos.");
	}

}
