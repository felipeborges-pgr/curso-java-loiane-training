package com.curso.java.aula23.labs;

public class Ex02 {

	public static void main(String[] args) {
		
		Livro livro  = new Livro();
		
		livro.nome = "Use a Cabeça! Java";
		livro.autor = "Kathy Sierra";
		livro.anoLancamento = 2007;
		 
		System.out.println("Nome do livro = " + livro.nome);
		System.out.println("Autor do livro = " + livro.autor);
		System.out.println("Ano de lançamento do livro = " + livro.anoLancamento);
	}

}
