package com.curso.java.aula14.labs;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int num1 = scan.nextInt();
		
		System.out.println("Digite outro valor: ");
		int num2 = scan.nextInt();
		
		if (num1 > num2) {
			System.out.println(num1);
		} else {
			System.out.println("Maior número: " + num2);
		}
	}

}
