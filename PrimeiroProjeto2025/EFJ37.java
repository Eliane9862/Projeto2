package PrimeiroProjeto2025;

import java.util.Scanner;

public class EFJ37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Projeto EFJ01\n");
		System.out.println(" Aluno: Eliane Ferreira - RA:0024648\n ");
		System.out.println(" Classe EFJ37\n ");
		System.out.println(" Atividade 37: Soma até múltiplo de 10 \n  ");
	//----- Fim do cabeçalho ----
		
		Scanner receber = new Scanner (System.in);
		int soma = 0;
		int numero;
		
		System.out.println("Digite números. O programa para quando digitar um múltiplo de 10.\n");
		do {
			System.out.print("Digite um número:\n ");
			
			numero = receber.nextInt();
			
			soma = soma + numero;
			
		} while ( numero % 10 != 0 );
		
		System.out.println("\nVocê digitou um múltiplo de 10. A soma total é:\n " + soma);
		receber.close();
	}

}
