package com.curso.java.aula13.labs;

import java.util.Scanner;

public class CalcInteiroReal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número inteiro: ");
		int num1 = scan.nextInt();
		
		System.out.println("Digite o segundo número inteiro: ");
		int num2 = scan.nextInt();
		
		System.out.println("Digite um número real: ");
		double num3 = scan.nextDouble();
		
		int resultado1 = (num1 * 2) + (num2 / 2);
		double resultado2 = (num1 * 3) + num3; 
		double resultado3 = Math.pow(num3, 3);
		
		System.out.println("Resultado1: " + resultado1);
		System.out.println("Resultado2: " + resultado2);
		System.out.println("Resultado3: " + resultado3);
	}

}
