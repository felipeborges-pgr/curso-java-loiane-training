package com.curso.java.aula13.labs;

import java.util.Scanner;

public class CalcRaioParaArea {

	public static void main(String[] args) {
		
		Scanner scan =  new Scanner(System.in); 
		
		final double PI = 3.14; 
		
		System.out.printf("Digite o valor do raio: ");
		double valorDoRaio = scan.nextDouble();
		
		System.out.println("O valor da área equivale a: " + PI * Math.pow(valorDoRaio, 2));

	}

}
