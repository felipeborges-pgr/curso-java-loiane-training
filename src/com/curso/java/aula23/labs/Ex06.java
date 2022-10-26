package com.curso.java.aula23.labs;

public class Ex06 {

	public static void main(String[] args) {
		
		Contato contato1 = new Contato();
		contato1.nome = "Hilary";
		contato1.endereco = "Av Central Pedras Altas";
		contato1.email = "hilary231@gmail.com";
		
		contato1.telefones = new String[5];
		contato1.telefones[0] = "9999-9999";
		contato1.telefones[1] = "9999-9998";
		contato1.telefones[2] = "9999-9997";

	}
}