package com.curso.java.aula17.labs;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean validaCadastro = false;
		
		do {
			
			System.out.println("Digite o seu nome de usuário: ");
			String user = scan.next();
			
			System.out.println("Digite a sua senha: ");
			String senha = scan.next();
			
			if(user.equalsIgnoreCase(senha)) {
				validaCadastro = false;
				System.out.println("[Error] usuário e senha são iguais.");
			} else {
				validaCadastro = true;
				System.out.println("Usuário: " + user + "\n" + "Senha: " + senha +
						"\n" + "Foram cadastrados!");
			}
			
		} while(!validaCadastro);
		
	}

}
