package com.curso.java.aula13.labs;

import java.util.Scanner;

public class CalcPesoIdeal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a sua altura: ");
		double altura = scan.nextDouble();
		
		double opPesoIdeal = (72.7*altura) - 58;
		
		System.out.println("O peso ideal equivale a: " + opPesoIdeal);

	}

}
