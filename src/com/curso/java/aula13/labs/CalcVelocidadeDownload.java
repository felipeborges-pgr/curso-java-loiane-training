package com.curso.java.aula13.labs;

import java.util.Scanner;

public class CalcVelocidadeDownload {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o tamanho total do arquivo em MB: ");
		double tamanhoDoArquivo = scan.nextDouble();
		
		System.out.println("Digite a velocidade do link (Mbps): ");
		double velocidadeLink = scan.nextDouble();
		
		double tempoTotalDownloadMin = (tamanhoDoArquivo / velocidadeLink);  
		System.out.println("O tempo total de download é igual a: " + 
		velocidadeLink);

	}

}
