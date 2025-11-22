package PrimeiroProjeto2025;

import java.util.Scanner;

public class EFJ15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Projeto EFJ01\n ");
		System.out.println(" Aluno: Eliane Ferreira - RA:0024648\n ");
		System.out.println(" Classe EFJ15\n ");
		System.out.println(" Atividade 15: Fatorial de um número \n  ");
		System.out.println(" Nessa atividade usei a IA como referencia \n  ");
		// ----- Fim do cabeçalho ----

		Scanner receber = new Scanner(System.in);

		System.out.println(" Digite um número para calcular o fatorial:\n ");
		int numero = receber.nextInt();

		// Usamos 'long' porque o fatorial cresce muito rápido
		// O fatorial de 5 é 120 (5*4*3*2*1)
		long fatorial = 1; // O acumulador de multiplicação começa em 1

		// Se o usuário digitar 0, o loop não roda (1 <= 0 é falso)
		// e o resultado impresso é 1 (correto, 0! = 1)
		// Loop de 1 até o número
		for (int i = 1; i <= numero; i++) {

			// Acumulamos a multiplicação
			fatorial = fatorial * i;
		}

		System.out.println("O fatorial de " + numero + " é:\n " + fatorial);

		receber.close();

	}

}
