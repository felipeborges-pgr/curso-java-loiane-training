package com.curso.java.aula47;

public class TestandoFinally {

	public static void main(String[] args) {
		
		int[] numeros = {5 ,6, 7 ,8 ,9, 800};
		int[] demon = {2, 0, 5, 8, 9}; 
		
		for(int i = 0; i<numeros.length; i++) {
			try {
				System.out.println(numeros[i] + "/" + demon[i] + " = " + (numeros[i]/demon[i]));
			} 
			catch(ArithmeticException e1) {
				System.out.println("Erro ao dividir por zero");
				System.exit(0); 
			} 
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Posição do array inválida");
				System.exit(0); // Finaliza o programa e o finnaly não é executado
			}
			finally {
				System.out.println("Essa linha é impressa sempre após o try ou catch");
			}
			
		}

	}

}
