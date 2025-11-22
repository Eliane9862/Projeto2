package PrimeiroProjeto2025;

import java.util.Scanner;

public class EFJ27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Projeto EFJ01 \n");
		System.out.println(" Aluno: Eliane Ferreira - RA:0024648\n ");
		System.out.println(" Classe EFJ27\n ");
		System.out.println(" Atividade 27: Quantidade de números ímpares, usei a IA para me auxiliar nessa atividade \n  ");
	     //----- Fim do cabeçalho ----
		
		Scanner receber = new Scanner (System.in);
		
		int contImpares = 0; // Acumulador para contar os ímpares
		
		// 1. Inicialização: Contador de voltas
		int contVoltas = 1;
		
		System.out.println("Digite 10 números inteiros:");

		// 2. Condição: ENQUANTO o contador de voltas for menor ou igual a 10
		while ( contVoltas <= 10 ) {
			
			System.out.print("Digite o " + contVoltas + "º número: ");
			int numero = receber.nextInt();
			
			// Verificamos se é ímpar (resto da divisão por 2 é != 0)
			if ( numero % 2 != 0 ) {
				contImpares++; // Incrementa o contador de ímpares
			}
			
			// 3. Incremento: Passamos para a próxima volta
			contVoltas++;
		}
		
		System.out.println("\nVocê digitou " + contImpares + " números ímpares.");
		
		receber.close();
	}

}
