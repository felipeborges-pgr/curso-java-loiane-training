package com.curso.java.aula17.labs;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		

        Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um número");
		int num = scan.nextInt();
		
		boolean primo = true;
		
		for(int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println("Não é primo é divisível por - " + i);
				primo = false;
			}
		}
		
		if (primo) {
			System.out.println("É um número primo");
		}

	}

}
