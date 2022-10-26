package com.curso.java.aula17.labs;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
	
		double popA;
		double popB;
		double taxaA;
		double taxaB;
		
		boolean validaEnt = false;
		
		do {
			
			System.out.println("Entre com população do país A:");
			popA = scan.nextDouble();
			
			if(popA > 0) {
				validaEnt = true;
			} else {
				System.out.println("População A precisa ser maior que 0.");
			}
			
		} while(!validaEnt);
		
		do {
			
			System.out.println("Entre com população do país B:");
			popB = scan.nextDouble();
			
			if(popB > 0) {
				validaEnt = true;
			} else {
				System.out.println("População B precisa ser maior que 0.");
			}
			
		} while(!validaEnt);
		
		
		validaEnt = false;
		do {
			
		    System.out.println("Entre com a taxa de crescimento da população A:");
		    taxaA = scan.nextDouble();
		    
		    if(taxaA > 0) {
		    	validaEnt = true;
		    } else {
		    	System.out.println("Taxa de crescimento A precisa ser maior que 0.");
		    }
			
		} while(!validaEnt);
		
		
		validaEnt = false;
		do {
			
		    System.out.println("Entre com a taxa de crescimento da população B:");
		    taxaB = scan.nextDouble();
		    
		    if(taxaB > 0) {
		    	validaEnt = true;
		    } else {
		    	System.out.println("Taxa de crescimento B precisa ser maior que 0.");
		    }
			
		} while(!validaEnt);
		
		int cont = 0;
		
		while(popA < popB) {
			
			popA += (popA/100) * 3;
			popA += (popA/100) * 1.5;
			cont++;
			
		}
		
		 System.out.println("População A: " + popA);
	     System.out.println("População B: " + popB);
	     System.out.println("Qtd anos:     " + cont);

	}

}
