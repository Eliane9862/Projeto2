package PrimeiroProjeto2025;

import java.util.Scanner;

public class EFJ40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Projeto EFJ01\n");
		System.out.println(" Aluno: Eliane Ferreira - RA:0024648\n ");
		System.out.println(" Classe EFJ40\n ");
		System.out.println(" Atividade 40: Maior número (até digitar negativo) \n  ");
	//----- Fim do cabeçalho ----
		
		Scanner receber = new Scanner (System.in);
		int numero;
		
		int maior = 0; 
		
		System.out.println("Digite números positivos. Digite um negativo para parar.\n");

		do {
			System.out.print("Digite um número:\n ");
			
			numero = receber.nextInt();
			
			if (numero > maior) {
				maior = numero;
			}
			
		} while ( numero >= 0 );
		
		System.out.println("\nVocê digitou um número negativo.\n");
		System.out.println("O maior número Positivo digitado foi: \n" + maior);
		
		receber.close();
	}

}
