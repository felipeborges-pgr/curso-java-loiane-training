package com.curso.java.aula17.labs;

import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um número");
		int num = scan.nextInt();
		
		boolean primo;
		
		for (int i= 1; i < num; i++) {
			
			primo = true;
			
			for(int j = 2; j < i; j++) {
				if (i % j == 0) {
					primo = false;
				}
			}
			
			if (primo) {
				System.out.println(i);
			}
			
		}
		
	}

}
