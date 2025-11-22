package PrimeiroProjeto2025;

import java.util.Scanner;

public class EFJ19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Projeto EFJ01\n ");
		System.out.println(" Aluno: Eliane Ferreira - RA:0024648\n ");
		System.out.println(" Classe EFJ19\n ");
		System.out.println(" Atividade 19: Verificar se um número é primo \n  ");
		// Fim do cabeçalho ----

		Scanner receber = new Scanner(System.in);

		System.out.println(" Digite um número inteiro para verificar se é PRIMO:\n ");
		int numero = receber.nextInt();

		int contdivisores = 0;

		for (int i = 1; i <= numero; i++) {

			if (numero % i == 0) {
				if (contdivisores == 2) {
					System.out.println("O número " + numero + " É PRIMO:\n");
				} else {
					System.out
							.println("O número " + numero + " NÃO é primo (ele tem " + contdivisores + " divisores)\n");
				}

				receber.close();
			}

		}
	}

}
