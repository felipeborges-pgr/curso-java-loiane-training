package com.curso.java.aula13.labs;

import java.util.Scanner;

public class CalcSalarioDesc {

	public static void main(String[] args) {
		
	Scanner scan =  new Scanner(System.in); 
		
		System.out.println("Quanto você ganhar por hora?");
		double valorSalarioHora = scan.nextDouble();
		
		System.out.println("Quantas horas você trabalha no mês?");
		double totalHorasTrabalhadas = scan.nextDouble();
		
		double salarioBruto = valorSalarioHora * totalHorasTrabalhadas;
		double inss = (salarioBruto / 100) * 8;
		double sindicato = (salarioBruto / 100) * 5;
		double ir = (salarioBruto / 100) * 11;
		double totalDescontos = inss + sindicato + ir;
		double salarioLiquido = salarioBruto - totalDescontos;
		
		System.out.println("Salário bruto: " + salarioBruto);
		System.out.println("Valor INSS: " + inss);
		System.out.println("Valor sindicato: " + sindicato);
		System.out.println("Valor Imposto de Renda: " + ir);
		System.out.println("Total do desconto: " + totalDescontos);
		System.out.println("Salário Liquído: " + salarioLiquido);

	}

}
