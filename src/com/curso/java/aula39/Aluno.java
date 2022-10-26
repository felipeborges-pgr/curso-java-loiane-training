package com.curso.java.aula39;

public class Aluno extends Pessoa {
	
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
		s += super.getEndereco();
		
		return s;
	}
	@Override
	public void imprimirEtiquetaEndereco() {
		
		System.out.println("Imprimindo Endereço do Aluno");
		System.out.println(this.obterEtiquetaEndereco());
		
	}

}
