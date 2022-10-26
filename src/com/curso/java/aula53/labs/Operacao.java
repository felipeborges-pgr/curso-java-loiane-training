package com.curso.java.aula53.labs;

public enum Operacao {
	
	SOMAR("+") {
		@Override
		double executarOperacao(double x, double y) {
			// TODO Auto-generated method stub
			return x + y;
		}
	}, SUBTRAIR("-") {
		@Override
		double executarOperacao(double x, double y) {
			// TODO Auto-generated method stub
			return x - y;
		}
	}, MULTIPLICAR("*") {
		@Override
		double executarOperacao(double x, double y) {
			// TODO Auto-generated method stub
			return x * y;
		}
	}, DIVIDIR("/") {
		@Override
		double executarOperacao(double x, double y) {
			// TODO Auto-generated method stub
			return x / y;
		}
	};
	
	
	 Operacao(String simbolo) {
		this.simbolo = simbolo;
	}	

	private String simbolo;
	
	abstract double executarOperacao(double x, double y);
	
	public String toString() {
		return this.simbolo;
	}
	
	

}
