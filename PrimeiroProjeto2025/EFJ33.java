package PrimeiroProjeto2025;

import java.util.Scanner;

public class EFJ33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Projeto EFJ01\n ");
		System.out.println(" Aluno: Eliane Ferreira - RA:0024648\n ");
		System.out.println(" Classe EFJ33 \n");
		System.out.println(" Atividade 33: Menu com opção de sair \n  ");
	//----- Fim do cabeçalho ----
		
		Scanner receber = new Scanner (System.in);
		
		int escolha;
		
		do {
			System.out.println("\nMENU ");
			System.out.println("\n1 - Mensagem");
			System.out.println("\n2 - Sair");
			System.out.print("\nEscolha uma opção: ");
		
			escolha = receber.nextInt();
			
			if (escolha == 1) {
				System.out.println("\nComo é bom Estudar!!");
			}
			
		} while ( escolha != 2 );
		
		System.out.println("\nFim do programa.");
		receber.close();
	}

}
