package com.curso.java.aula39;



public class Teste {

	public static void main(String[] args) {
		
		
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();
		
		aluno.setEndereco("Rua 2, num 2"); 
		professor.setEndereco("Rua 3, num 3"); 
		
//		System.out.println(aluno.obterEtiquetaEndereco());
//		System.out.println(professor.obterEtiquetaEndereco());
		
		
		aluno.imprimirEtiquetaEndereco();
		professor.imprimirEtiquetaEndereco();
	}

}
