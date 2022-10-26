package com.curso.java.aula41;

public class Teste {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		aluno.setCurso("Ciência da Computação");
		double[] notas = {12, 5, 10, 9};
		aluno.setNotas(notas);
		
		String s1 = "adsdfs";
		String s2 = "adsdfs";
		
		System.out.println(s1.equalsIgnoreCase(s2));
		
		Aluno aluno2 = new Aluno();
		
		aluno2.setCurso("Ciência da Computação");
		double[] notas2 = {12, 5, 10, 9};
		aluno2.setNotas(notas2);
		
		System.out.println(aluno.equals(aluno2));
	}

}
