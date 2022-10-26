package com.curso.java.aula13.labs;

import java.util.Scanner;

public class ConvertGrausCelsiusParaFahrenheit {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor em graus Celsius: ");
		double valorCelsius = scan.nextDouble();
		
		double valorEmFahrenheit = valorCelsius * 1.8 + 32;
		
		System.out.println("Valor em graus Fahrenheit: " + valorEmFahrenheit);
		
	}

}
