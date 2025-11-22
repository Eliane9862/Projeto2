package PrimeiroProjeto2025;

import java.util.Scanner;

public class EFJ30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Projeto EFJ01\n");
		System.out.println("* Aluno: Eliane Ferreira - RA:0024648\n ");
		System.out.println("* Classe EFJ30\n ");
		System.out.println("* Atividade 30: Menu até escolher sair \n  ");
	//----- Fim do cabeçalho ----
		
		Scanner receber = new Scanner (System.in);
		
		// 1. Inicialização: Começamos com uma escolha que NÃO seja a de sair
		int escolha = 0;
		
		// 2. Condição: Continua ENQUANTO a escolha for DIFERENTE de 4 (Sair)
		while ( escolha != 4 ) {
			
			System.out.println(" MENU DE OPÇÕES\n");
			System.out.println("1. Ver Saldo\n");
			System.out.println("2. Fazer Depósito\n");
			System.out.println("3. Fazer Saque\n");
			System.out.println("4. Sair\n");
			System.out.print("Escolha uma opção:\n ");
		
			escolha = receber.nextInt();
			
			// Usamos switch-case para tratar a escolha (podia ser if/else)
			switch (escolha) {
				case 1:
					System.out.println("Opção 1 escolhida: Seu saldo é R$ 1000,00\n");
					break; 
				case 2:
					System.out.println("Opção 2 escolhida: Depósito realizado.\n");
					break; 
				case 3:
					System.out.println("Opção 3 escolhida: Saque realizado.\n");
					break; 
				case 4:
			
					break;
				default:
	
					System.out.println("Opção inválida! Tente novamente.\n");
					break; 
			}
		}
		
		System.out.println(" Programa encerrado.\n");
		receber.close();
	}

}
