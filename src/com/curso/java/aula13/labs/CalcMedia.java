package com.curso.java.aula13.labs;

import java.util.Scanner;

public class CalcMedia {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("Digite a primeira nota: ");
		double nota1 = scan.nextDouble();
		
		
		System.out.printf("Digite a segunda nota: ");
		double nota2 = scan.nextDouble();
		
		System.out.printf("Digite a terceira nota: ");
		double nota3 = scan.nextDouble();
		
		System.out.printf("Digite a quarta nota: ");
		double nota4 = scan.nextDouble();
		
		double media = (nota1+nota2+nota3+nota4) / 4;
		
		System.out.println("A média das notas equivale a: " + media);
		
	}

}
