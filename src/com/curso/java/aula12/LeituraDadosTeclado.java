package com.curso.java.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("Digite o seu nome completo:");
		String nomeCompleto = scan.nextLine();
		
		System.out.println("Seu nome completo é: " + nomeCompleto);
		
		System.out.println("Digite o seu primeiro nome: ");
		String primeiroNome = scan.next();
		
		System.out.println("Seu primeiro nome é: " + primeiroNome);
		
		System.out.println("Digite a sua idade: ");
		int idade = scan.nextInt();
		System.out.println("A sua idade é: " + idade);
		
		System.out.println("Digite a sua altura:");
		double altura = scan.nextDouble();
		System.out.println("A sua altura é: " + altura);*/
		
		System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem pet");
		String primeiroNome = scan.next();
		int idade = scan.nextInt();
		byte qtdFilhos = scan.nextByte();
		float altura = scan.nextFloat();
		boolean temPet = scan.nextBoolean();
		
		System.out.println("Você digitou os seguintes valores:");
		System.out.println("Primeiro nome: " + primeiroNome);
		System.out.println("idade: " + idade);
		System.out.println("Quantidade de filhos: " + qtdFilhos);
		System.out.println("altura: " + altura);
		System.out.println("Tem animal de estimação: " + temPet);
	}

}
