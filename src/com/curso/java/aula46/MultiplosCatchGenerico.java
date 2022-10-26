package com.curso.java.aula46;

public class MultiplosCatchGenerico {

	public static void main(String[] args) {
		
		int[] numeros = {5 ,6, 7 ,8 ,9, 800};
		int[] demon = {2, 0, 5, 8, 9}; 
		
		for(int i = 0; i<numeros.length; i++) {
			
			try {
				System.out.println(numeros[i] + "/" + demon[i] + " = " + (numeros[i]/demon[i]));
			} 
			catch(ArithmeticException e1) {
				System.out.println("Erro ao dividir por zero");
			} 
			catch(Throwable exc) {
				System.out.println("Ocorreu um erro");
			}
		
		}

	}

}
