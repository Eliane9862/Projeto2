package PrimeiroProjeto2025;

import java.util.Scanner;

public class EFJ24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Projeto EFJ\n ");
		System.out.println(" Aluno: Eliane Ferreira - RA:0024648\n ");
		System.out.println(" Classe EFJ24\n ");
		System.out.println(" Atividade 24: Verificar se um número é positivo \n  ");
	    // Fim do cabeçalho ----
		
		Scanner receber = new Scanner (System.in);
		int numero = 0; 
		while ( numero <= 0 ) {
			
			System.out.println("Por favor, digite um número POSITIVO (maior que 0):");
	
			numero = receber.nextInt();
		}
		
		System.out.println("\n Parabéns!!! você digitou o número positivo: " + numero);
		
		receber.close();
	}

}
