package com.curso.java.aula41.labs.ex03;

public class Animal {
	
	private String nome;
	private int comprimento;
	private int patas;
	private String cor;
	private String ambiente;
	private double velocidade;
	
	public Animal() {
		this.patas = 4;
	}
	
	public Animal(String nome, int comprimento, int patas, String cor, String ambiente, int velocidade) {
		super();
		this.nome = nome;
		this.comprimento = comprimento;
		this.patas = patas;
		this.cor = cor;
		this.ambiente = ambiente;
		this.velocidade = velocidade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getComprimento() {
		return comprimento;
	}
	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	} 
	
	@Override
	public String toString() {
		String s = "Animal: " + nome;
		s += "\nComprimento: " + comprimento + " cm";
		s += "\nPatas: " + patas;
		s += "\nCor: " + cor;
		s += "\nAmbiente: " + ambiente;
		s += "\nVelocidade: " + velocidade + " m/s";
		return s;
		
	}
}
