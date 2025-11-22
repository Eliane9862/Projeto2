package PrimeiroProjeto2025;

import java.util.Scanner;

public class EFJ39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Projeto EFJ01\n ");
		System.out.println(" Aluno: Eliane Ferreira - RA:0024648\n ");
		System.out.println(" Classe EFJ39\n ");
		System.out.println(" Atividade 39: Validar número entre 1 e 5 \n  ");
	//----- Fim do cabeçalho ----
		
		Scanner receber = new Scanner (System.in);
	
		int numero;
		
		do {
			System.out.print("Digite um número entre 1 e 5:\n ");
			
			numero = receber.nextInt();
			
			if (numero < 1 || numero > 5) {
				System.out.println("Valor inválido! Tente novamente.\n");
			}
		} while ( numero < 1 || numero > 5 );
		
		System.out.println("\nVocê digitou o número válido:\n " + numero);
		receber.close();
	}

}
