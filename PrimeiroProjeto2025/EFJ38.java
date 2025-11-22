package PrimeiroProjeto2025;

import java.util.Scanner;

public class EFJ38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Projeto EFJ01\n");
		System.out.println(" Aluno: Eliane Ferreira - RA:0024648\n ");
		System.out.println(" Classe EFJ38\n ");
		System.out.println(" Atividade 38: Confirmar saída com 's' \n  ");
	//----- Fim do cabeçalho ----
		
		Scanner receber = new Scanner (System.in);
	
		char escolha;
		do {
			System.out.println("\nSISTEMA");
			System.out.println("Processando dados...");
			
			System.out.println("\nDeseja realmente sair? (Digite 's' para sim ou 'n' para não):");
			
			escolha = receber.next().charAt(0);
		
		} while ( escolha != 's' && escolha != 'S' );
		
		System.out.println("\nEncerrando programa...");
		receber.close();
	}

}
