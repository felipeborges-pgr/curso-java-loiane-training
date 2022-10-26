package com.curso.java.aula49.labs;

public class ContatoNaoExisteException extends Exception {
	
	private String nomeContato;

	public ContatoNaoExisteException(String nomeContato) {
		this.nomeContato = nomeContato;
	}
	
	public String getMessage() {
		return "Contato " + nomeContato + " não existe na agenda!"; 
	}

}
