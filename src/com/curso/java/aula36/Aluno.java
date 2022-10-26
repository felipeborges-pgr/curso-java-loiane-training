package com.curso.java.aula36;

public class Aluno extends Pessoa {
	
	private String curso;
	private double[] notas;

	public Aluno() {
		super();
	}
	
	public Aluno(String nome, String endereco, String telefone, String curso) {
		super(nome, endereco, telefone);
		this.curso = curso;
	}

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
	
	public void metodoQualquer() {
		super.setCpf("56342342");
		
		this.setCpf("65546565");
	}

}
