package com.curso.java.aula23.labs;

import java.util.Date;

public class Ex04 {

	public static void main(String[] args) {
		

		LivroDeBiblioteca livro  = new LivroDeBiblioteca();
		
		livro.nome = "Use a Cabeça! Java";
		livro.autor = "Kathy Sierra";
		livro.anoLancamento = 2007;
		
		livro.emprestado = true;
		livro.dataEntrega = new Date();
		livro.emprestadoA = "Felipe";
		
		 
		System.out.println("Nome do livro = " + livro.nome);
		System.out.println("Autor do livro = " + livro.autor);
		System.out.println("Ano de lançamento do livro = " + livro.anoLancamento);
	}

}
