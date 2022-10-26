package com.curso.java.aula32.labs;

import java.util.Scanner;

import com.curso.java.aula32.labs.Aluno;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Entre com o nome aluno");
		aluno.setNome(scan.next());
		
		System.out.println("Entre com nome do curso");
		aluno.setNomeCurso(scan.next());
		
		System.out.println("Entre com a matrícula");
		aluno.setMatricula(scan.next());
		
		for(int i = 0; i<aluno.getNomeDisciplinas().length; i++) {
			System.out.println("Entre com o nome da disciplina " + i);
			aluno.setNomeDisciplinaPos(i, scan.next());
		}
		
		for(int i = 0; i<aluno.getNotasDisciplinas().length; i++) {
			System.out.println("Obtendo notas da disciplina " + aluno.getNomeDisciplinas()[i]);
			for(int j=0; j<aluno.getNotasDisciplinas()[i].length; j++) {
				System.out.println("Entre com a nota " + (j+1));
				aluno.setNomePosIJ(i, j, scan.nextDouble());
			}
		}
		
		aluno.mostrarInfo();
		
		for(int i=0; i<aluno.getNomeDisciplinas().length; i++) {
			if (aluno.verificarAprovado(i)) {
				System.out.println("Disciplinas " + aluno.getNomeDisciplinas()[i] + " - foi aprovado");
			} else {
				System.out.println("Disciplinas " + aluno.getNomeDisciplinas()[i] + " - reprovado");
			}
		}

	}

}
