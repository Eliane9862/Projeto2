package PrimeiroProjeto2025;

import java.util.Scanner;

public class EFJ22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" Pojeto EFJ01\n ");
		System.out.println(" Aluno: Eliane Ferreira - RA:0024648\n ");
		System.out.println(" Classe EFJ22\n ");
		System.out.println(" Atividade 22: Soma de números até digitar zero \n  ");
	//----- Fim do cabeçalho ----
		
		Scanner receber = new Scanner (System.in);
	
		int soma = 0;
		int numero = 1; 
		
		System.out.println("Digite números para somar. Digite '0' para sair.\n");
		while ( numero != 0 ) {
			
			System.out.print("Digite um número:\n ");
			numero = receber.nextInt();
	
			soma = soma + numero;
		}
		
		System.out.println("\nA soma total dos números digitados é:\n " + soma);
		
		receber.close();
	}
		
		
	}


