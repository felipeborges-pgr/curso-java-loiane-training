package com.curso.java.aula13.labs;

import java.util.Scanner;

public class SomaNum {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("Informe um número: ");
		long valor1 = scan.nextLong();  
		System.out.printf("Informe um outro número: ");
		long valor2 = scan.nextLong();
		
		long soma = valor1 + valor2;
		
		System.out.println("A soma entre os número informados é igual a: " + soma);
	}

}
