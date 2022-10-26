package com.curso.java.aula48;

public class ExceptionGenerica {

	public static void main(String[] args) {
		
		int[] numeros = {5 ,6, 7 ,8 ,9, 800};
		int[] demon = {2, 0, 5, 8, 9}; 
		
		for(int i = 0; i<numeros.length; i++) {
			try {
				System.out.println(numeros[i] + "/" + demon[i] + " = " + (numeros[i]/demon[i]));
			} 
			catch(Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			} 
			
			
		}

	}

}
