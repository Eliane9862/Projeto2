package PrimeiroProjeto2025;

import java.util.Scanner;

public class EFJ03 {

	public static void main(String[] args) {

		System.out.println(" Projeto EFJ01 \n ");
		System.out.println(" Aluno: Eliane Ferreira - RA:0024648 \n  ");
		System.out.println(" Classe EFJ03 Maior de dois números !!! \n ");
	
		// ----- Fim do cabeçalho ----

		Scanner receber = new Scanner(System.in);

		System.out.println("\nDigite o primeiro número: ");
		int nr1 = receber.nextInt();

		System.out.println(" \nDigite o segundo número: ");
		int nr2 = receber.nextInt();

		if (nr1 > nr2) {
			System.out.println(" \nO nr1 \" + nr2 + \" é o MAIOR:");
		} else {

			System.out.println(" \nOs números são IGUAIS.  ");
		}

		receber.close();

	}

}

