package com.curso.java.aula23.labs;

public class Ex05 {

	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente();
		conta.numero = "345453";
		conta.agencia = "46545";
		conta.especial = true;
		conta.limiteEspecial = 600;
		conta.saldo = -10;
		
		System.out.println("Saldo da conta " + conta.numero + " = " + conta.saldo);

	}

}
