package com.curso.java.aula17.labs;

import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Preço do pão: R$ 0.18");
		System.out.println("Panificadora Pão de Ontem - Tabela de preços ");
		
		for (int i = 1; i <= 50; i++) {
			System.out.println(i + " - " + " R$" + (i * 0.18));
		}
	}

}
