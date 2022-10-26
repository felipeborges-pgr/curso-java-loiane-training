package com.curso.java.aula16;

public class LoopWhile {

	public static void main(String[] args) {
		
		int i = 1; // count ou cont
		int max = 10;
		
		System.out.println("Contando até " + max);
		
		while(i <= max) {
			System.out.println("Valor de i: " + i);
			i++;
		}
		
		System.out.println(i); // valor 11
		
	}

}
