package com.curso.java.aula14.labs;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma letra (M ou F): ");
		String letra = scan.next();
		
		if(letra.equalsIgnoreCase("M")) {
			System.out.println("Masculino");
		} else if(letra.equalsIgnoreCase("F")) {
			System.out.println("Feminino");
		} else {
			System.out.println("[Error] Sexo inválido.");
		}
	}

}
