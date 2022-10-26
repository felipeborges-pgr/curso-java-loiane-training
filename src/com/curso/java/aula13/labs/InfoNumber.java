package com.curso.java.aula13.labs;

import java.util.Scanner;

public class InfoNumber {

	public static void main(String[] args) {
		
		Scanner scan =  new Scanner(System.in); 
		
		System.out.printf("Digite um número: ");
		
		int num = scan.nextInt(); 
		
		System.out.println("O número informado foi: " + num);
	}

}
