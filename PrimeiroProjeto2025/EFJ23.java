package PrimeiroProjeto2025;

import java.util.Scanner;

public class EFJ23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" Projjeto EFJ01\n");
		System.out.println(" Aluno: Eliane Ferreira - RA:0024648\n ");
		System.out.println(" Classe EFJ23\n ");
		System.out.println(" Atividade 23: Senha correta \n  ");
	    // Fim do cabeçalho ----
		
		Scanner receber = new Scanner (System.in);
		
		String senhacorreta = "EFJ123";
	
		String senhaDigitada = "";

		while ( !senhaDigitada.equals(senhacorreta) ) {
			
			System.out.println("Digite a senha: ");
	
			senhaDigitada = receber.nextLine();
			
			if ( !senhaDigitada.equals(senhacorreta) ) {
				System.out.println("Senha incorreta! Tente novamente.");
			}
		}
		
		System.out.println("\nAcesso permitido! Bem-vinda!");
		
		receber.close();
	}
	}


