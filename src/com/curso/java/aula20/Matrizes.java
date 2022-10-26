package com.curso.java.aula20;

public class Matrizes {

	public static void main(String[] args) {
		
		double[][] notasAlunos = new double[3][4];
		
		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 7.5;
		notasAlunos[0][2] = 8;
		notasAlunos[0][3] = 9;
		
		notasAlunos[1][0] = 7.5;
		notasAlunos[1][1] = 7.5;
		notasAlunos[1][2] = 8;
		notasAlunos[1][3] = 9;
		
		notasAlunos[2][0] = 9;
		notasAlunos[2][1] = 7.5;
		notasAlunos[2][2] = 6.3;
		notasAlunos[2][3] = 9;
		
		for(int i = 0; i < notasAlunos.length; i++) {
			
			for(int j = 0; j<notasAlunos[i].length; j++) {
				
				System.out.print(notasAlunos[i][j] + " - ");
			}
			System.out.println();
		}
		
		notasAlunos[1][3] = 7;
		
		System.out.println();
		
		for(int i = 0; i < notasAlunos.length; i++) {
			
			for(int j = 0; j<notasAlunos[i].length; j++) {
				
				System.out.print(notasAlunos[i][j] + " - ");
			}
			System.out.println();
		}
		
		System.out.println("Calculando a média de cada aluno");
		
		
		double soma;
		for(int i = 0; i < notasAlunos.length; i++) {
			
			soma = 0;
			for(int j = 0; j<notasAlunos[i].length; j++) {
				soma += notasAlunos[i][j];
			}
			System.out.println("Média do aluno " + i + " é = " + (soma/4));
		}
		
		double[] notasAluno1 = {7, 9, 8, 6, 7};
		
		double[][] notasAlunos2 = {{7,8,8,7,5}, {8,4,3,4,5}};
		
		for (int i=0; i<notasAlunos2.length; i++){
			for (int j=0; j<notasAlunos2[i].length; j++){
				System.out.print(notasAlunos2[i][j] + " - ");
			}
			System.out.println();
		}
		
	}

}
