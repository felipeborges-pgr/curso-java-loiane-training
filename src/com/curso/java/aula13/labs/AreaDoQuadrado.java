package com.curso.java.aula13.labs;

import java.util.Scanner;

public class AreaDoQuadrado {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o tamanho do lado do quadrado: ");
		double lado = scan.nextDouble();
		
		// area = lado * lado
		double valorDaAreaDoQuadrado = Math.pow(lado, 2);
		
		System.out.println("A área do quadrado equivale a: " + valorDaAreaDoQuadrado);
		System.out.println("O dobro da área do quadrado equivale a: " + 
		(valorDaAreaDoQuadrado * 2));
	}
	
}
