package com.curso.java.aula13.labs;

import java.util.Scanner;

public class ConvertFarenheithParaCelsius {

	public static void main(String[] args) {
		
		Scanner scan =  new Scanner(System.in); 
		
		System.out.println("Digite o valor de graus em F°: ");
		int valorEmFahrenheit = scan.nextInt();
		
		double valorEmCelsius = (valorEmFahrenheit - 32) / 1.8; 

		System.out.println("O valor em Celsius é: " + valorEmCelsius);
	}
	


}
