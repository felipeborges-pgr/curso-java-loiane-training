package com.curso.java.aula19.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double[] vetorA = new double[20];
		double cotacao;
		
		DecimalFormat df =  new DecimalFormat("###,###.##");
		
		System.out.println("Entre com a cotação do dolar: ");
		cotacao = scan.nextDouble();
		
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = cotacao * (i + i);
		}
		
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println(df.format(vetorA[i]) + " ");
		}
		System.out.println();
	}

}
