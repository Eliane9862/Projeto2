package PrimeiroProjeto2025;

import java.util.Scanner;

public class EFJ09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Projeto EFJ01 ");
		System.out.println(" Aluno: Eliane Ferreira - RA:0024648 ");
		System.out.println(" Classe EFJ09 "); 
		System.out.println(" Atividade 09: Ordem crescente (três números)   ");
		System.out.println(" Usei atividades anteriores como base ");
		// -- Fim do cabeçalho --//

		Scanner receber = new Scanner(System.in);

		System.out.println(" Digite o primeiro número: ");
		double n1 = receber.nextDouble();

		System.out.println(" Digite o segundo número: ");
		double n2 = receber.nextDouble();

		System.out.println(" Digite o terceiro número: ");
		double n3 = receber.nextDouble();

		double menor, meio, maior;

		if (n1 <= n2 && n1 <= n3) {
			menor = n1;

			if (n2 <= n3) {
				meio = n2;
				maior = n3;

			} else {
				meio = n3;
				maior = n2;
			}
		}

		else if (n2 <= n1 && n2 <= n3) {
			menor = n2;

			if (n1 <= n3) {
				meio = n1;
				maior = n3;

			} else {
				meio = n3;
				maior = n1;
			}
		}

		else {
			menor = n3;

			if (n1 <= n2) {
				meio = n1;
				maior = n2;
			} else {
				meio = n2;
				maior = n1;
			}
		}

		System.out.println("\nOs números em ordem crescente são: ");
		System.out.println(menor);
		System.out.println(meio);
		System.out.println(maior);

		receber.close();

	}

}
