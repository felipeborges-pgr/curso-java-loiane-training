package com.curso.java.aula23.labs;

public class Ex03 {

	public static void main(String[] args) {
		
		LivroLivraria livro  = new LivroLivraria();
		
		livro.nome = "Use a Cabeça! Java";
		livro.autor = "Kathy Sierra";
		livro.anoLancamento = 2007;
		livro.preco = 117;
		 
		System.out.println("Nome do livro = " + livro.nome);
		System.out.println("Autor do livro = " + livro.autor);
		System.out.println("Ano de lançamento do livro = " + livro.anoLancamento);
		System.out.println("Preço do livro = " + livro.preco);

	}

}
