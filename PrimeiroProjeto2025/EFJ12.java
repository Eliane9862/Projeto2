package PrimeiroProjeto2025;

import java.util.Scanner;

public class EFJ12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		System.out.println(" Projeto EFJ01\n ");
		System.out.println(" Aluno: Eliane Ferreira - RA:0024648\n ");
		System.out.println(" Classe EFJ12\n ");
		System.out.println(" Atividade 12: Tabuada de um número\n  ");
		System.out.println(" Para essa atividade usei o conteudo de revisão das ultimmas aulas ");
		// Fim do cabeçalho ----

		Scanner receber = new Scanner(System.in);
		System.out.println("    ");
		System.out.println(" \nDigite um número para ver a tabuada: ");
		int numero = receber.nextInt();

		System.out.println("\nTabada do " + numero + "  ");

		for (int i = 1; i <= 10; i++) {

			int resultado = numero * i;

			System.out.println(numero + " x " + i + " = " + resultado);
		}

		receber.close();

	}
}
