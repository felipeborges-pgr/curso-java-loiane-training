package com.curso.java.aula74.labs;

public enum CorSemafaro {
	
	VERDE(1000), AMARELO(600), VERMELHO(2000);
	
	private int tempoEspera;
	
	CorSemafaro(int tempoEspera) {
		this.tempoEspera = tempoEspera;
	}
	
	public int getTempoEspera() {
		return tempoEspera;
	}
	
}
