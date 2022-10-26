package com.curso.java.aula49;

public class UsandoMinhaException {

	public static void main(String[] args) {
		
		try {
			teste();
			
		} catch(DivisaoNaoExata e) {
			e.printStackTrace();
		}
		
	}
	
	public static void teste() throws DivisaoNaoExata  {
		
		int[] numeros = {5 ,6, 7 ,8 ,9, 800};
		int[] demon = {2, 0, 5, 8, 9, 0, 2, 3}; 
		
		for(int i = 0; i<numeros.length; i++) {
			try {
				if (numeros[i] % 2 != 0) {
					//lançar a exception aqui
					throw new DivisaoNaoExata(numeros[i], demon[i]);
				}
				System.out.println(numeros[i] + "/" + demon[i] + " = " + (numeros[i]/demon[i]));
			}  
			catch(ArithmeticException  | ArrayIndexOutOfBoundsException e) {
				System.out.println("Aconteceu um erro");
				e.printStackTrace();
			}
			
		}
		
	}

}
