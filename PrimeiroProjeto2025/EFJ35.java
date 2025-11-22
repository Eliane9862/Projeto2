package PrimeiroProjeto2025;

import java.util.Scanner;

public class EFJ35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Projeto EFJ01\n ");
		System.out.println(" Aluno: Eliane Ferreira - RA:0024648\n ");
		System.out.println(" Classe EFJ35\n ");
		System.out.println(" Atividade 35: Número positivo obrigatório \n  ");
	//----- Fim do cabeçalho ----
		
		Scanner receber = new Scanner (System.in);
		
		int numero;
		
		do {
			System.out.println("Digite um número POSITIVO:");
			
			numero = receber.nextInt();
			
		} while ( numero <= 0 );

		receber.close();
	}

}
