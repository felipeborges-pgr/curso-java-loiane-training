package com.curso.java.aula14.labs;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int num = scan.nextInt(); 
		
		if(num >= 0) {
			System.out.println("O número " + num + " é positivo");
		} else if(num < 0) {
			System.out.println("O número " + num + " é negativo");
		} else {
			System.out.println("[Error] número não encontrado.");
		}
	}

}
