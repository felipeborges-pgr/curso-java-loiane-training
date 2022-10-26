package com.curso.java.aula13;

public class OperadoresAritmeticos {
	
	public static void main(String[] args) {
		
		int resultado = 1 + 2;
		System.out.println(resultado);
		
		
		resultado = resultado - 1;
		System.out.println(resultado);
		
		resultado = resultado * 2;
		System.out.println(resultado);
		
		resultado = resultado / 2;
		System.out.println(resultado);
		
		resultado = resultado + 8;
		System.out.println(resultado);
		
		resultado = resultado % 7;
		System.out.println(resultado);
		
		String frase1 = "Esta é ";
		String frase2 = "uma string concatenada.";
		String frase3 = frase1 + frase2;
		System.out.println(frase3);
		
		resultado = resultado + 1;
		System.out.println(resultado);
		
		resultado++;
		System.out.println(resultado);
		
		//5
		System.out.println(resultado++);
		//mesma coisa que 
//		System.out.println(resultado);
//		resultado = resultado + 1;
//		resultado += 1;
		
		System.out.println(++resultado);
//		mesma coisa que
		resultado += 1;
		System.out.println(resultado);
		
		resultado--;
		System.out.println(resultado);
		
		System.out.println(--resultado);
		System.out.println(resultado--);
	}
	
}
