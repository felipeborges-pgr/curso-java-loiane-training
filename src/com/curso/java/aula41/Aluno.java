package com.curso.java.aula41;

import java.util.Arrays;

public class Aluno {
	
	private String curso;
	private double[] notas;

	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	private double calcularMedia() {
		return 0;
	}
	
	public boolean verificarAprovacao() {
		return true;
	}
	
	public String obterEtiquetaEndereco() {
		
		String s = "Endereço do Aluno: ";
//		s += super.getEndereco();
		
		return s;
	}
	@Override
	public String toString() {
		return "Aluno [curso=" + curso + ", notas=" + Arrays.toString(notas) + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true; 
		}
		
		if (obj == null) 
			return false;
		
		Aluno other = (Aluno) obj;
		
		if (curso.equalsIgnoreCase(other.getCurso())) {
			return true;
		}
		
		return true;
	}
	
	
//	public String toString() {
//		String s = curso + "\n";
//		for (double nota : notas) {
//			s += nota;
//		}
//		
//		return s;
//	}
	
//	@Override
//	public void imprimirEtiquetaEndereco() {
//		
//		System.out.println("Imprimindo Endereço do Aluno");
//		System.out.println(this.obterEtiquetaEndereco());
//		
//	}

}
