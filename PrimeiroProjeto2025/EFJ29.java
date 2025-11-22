package PrimeiroProjeto2025;

import java.util.Scanner;

public class EFJ29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Projeto EFJ01\n");
		System.out.println(" Aluno: Eliane Ferreira - RA:0024648\n ");
		System.out.println(" Classe EFJ29\n ");
		System.out.println(" Atividade 29: Contar dígitos de um número \n  ");
	//----- Fim do cabeçalho ----
		
		Scanner receber = new Scanner (System.in);
		System.out.println(" Digite um número inteiro positivo:\n ");
		int numero = receber.nextInt();
		
		int contDigitos = 0;
		
		if (numero == 0) {
			contDigitos = 1;
		} 

		else {
			
			while ( numero > 0 ) {
				
				numero = numero / 10;
		
				contDigitos++;
			}
		}

		System.out.println("Esse número tem " + contDigitos + " dígito(s).\n ");
		
		receber.close();
	}

}
