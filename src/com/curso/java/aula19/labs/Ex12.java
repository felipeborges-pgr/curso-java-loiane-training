package com.curso.java.aula19.labs;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int soma = 0;
		
		for(int i = 0; i<vetorA.length; i++) {
			System.out.println("Insira um valor para a posição " + i);
			vetorA[i] = scan.nextInt();
			
			soma += vetorA[i];
		}
		
		System.out.print("A soma dos valores é igual a = " + soma);
		scan.close();
	}

}
