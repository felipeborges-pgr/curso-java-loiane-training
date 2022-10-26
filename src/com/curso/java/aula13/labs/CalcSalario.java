package com.curso.java.aula13.labs;

import java.util.Scanner;

public class CalcSalario {
	
	public static void main(String[] args) {
		
		Scanner scan =  new Scanner(System.in); 
		
		System.out.println("Quanto você ganhar por hora?");
		double valorSalarioHora = scan.nextDouble();
		
		System.out.println("Quantas horas você trabalha no mês?");
		double totalHorasTrabalhadas = scan.nextDouble();
		
		double totalSalario = valorSalarioHora * totalHorasTrabalhadas;
		
		System.out.println("O total é igual a: " + totalSalario);
		
	}

}
