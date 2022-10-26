package com.curso.java.aula17.labs;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		int num1 = scan.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		int num2 = scan.nextInt();
		
		for (int i =num1; i <= num2; i++ ) {
			System.out.println("Int: " + i);
		}
		
	}

}
