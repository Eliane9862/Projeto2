package PrimeiroProjeto2025;

import java.util.Scanner;

public class EFJ34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Pojeto EFJ01\n");
		System.out.println(" Aluno: Eliane Ferreira - RA:0024648\n ");
		System.out.println(" Classe EFJ34 ");
		System.out.println(" Atividade 34: Pedir senha até acertar \n  ");
	//----- Fim do cabeçalho ----
		
		Scanner receber = new Scanner (System.in);
		
		int senhaCorreta = 3210;
		
		int senhadigitada;

		do {
			System.out.println("Digite a senha :\n ");
			
			senhadigitada = receber.nextInt();
			
			if (senhadigitada != senhaCorreta) {
				System.out.println("Senha incorreta!\n");
			}

		} while ( senhadigitada != senhaCorreta );
		
		System.out.println("\nAcesso liberadoooooooo!\n");
		receber.close();
	}

}
