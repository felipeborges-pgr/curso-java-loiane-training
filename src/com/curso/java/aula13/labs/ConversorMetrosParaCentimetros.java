package com.curso.java.aula13.labs;

import java.util.Scanner;

public class ConversorMetrosParaCentimetros {

	public static void main(String[] args) {
		
		Scanner scan =  new Scanner(System.in); 
		
		System.out.printf("Digite o valor em metros: ");
		double valorEmMetros = scan.nextDouble();
		
		double valorEmCentimetros = valorEmMetros * 100;
		
		System.out.println("O valor em centímetros corresponde a: " + valorEmCentimetros);

	}

}
