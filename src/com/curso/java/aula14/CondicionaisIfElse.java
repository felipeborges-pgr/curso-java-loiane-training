package com.curso.java.aula14;

import java.util.Scanner;

public class CondicionaisIfElse {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("Entre com a sua idade: ");
//		int idade  = scan.nextInt();
//		
//		if(idade>=18) {
//			System.out.println("É maior de idade!");
//		} else {
//			System.out.println("Não é maior de idade!");
//		}
		
		System.out.println("Entre com o valor do item: ");
		double valorDoItem = scan.nextDouble();
		
		if (valorDoItem <= 10) {
			System.out.println("Está barato, pode comprar!");
		} else if(valorDoItem > 10 && valorDoItem < 15) {
			System.out.println("Você pode perdir um desconto");
		} else if(valorDoItem>=15 && valorDoItem<=20) {
			System.out.println("Pode pesquisar mais...");
		} else {
			System.out.println("Muito caro");
		}
	}
	
}
