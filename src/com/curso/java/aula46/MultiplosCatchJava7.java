package com.curso.java.aula46;

public class MultiplosCatchJava7 {
	
public static void main(String[] args) {
		
		int[] numeros = {5 ,6, 7 ,8 ,9, 800};
		int[] demon = {2, 0, 5, 8, 9}; 
		
		for(int i = 0; i<numeros.length; i++) {
			try {
				System.out.println(numeros[i] + "/" + demon[i] + " = " + (numeros[i]/demon[i]));
			} 
			catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
				System.out.println("Aconteceu um erro");
			} 
			
		}

	}

}
