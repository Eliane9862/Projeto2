package PrimeiroProjeto2025;

import java.util.Scanner;

public class EFJ26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(" Projeto EFJ01\n ");
		System.out.println(" Aluno: Eliane Ferreira - RA:0024648\n ");
		System.out.println(" Classe EFJ26\n ");
		System.out.println(" Atividade 26: Número primo com while \n  ");
	//----- Fim do cabeçalho ----
		
		Scanner receber = new Scanner (System.in);
		
		System.out.println(" Digite um número inteiro para verificar se é PRIMO:\n ");
		int numero = receber.nextInt();
		
		int contDivisores = 0;
		
		int i = 1;

		while ( i <= numero ) {
			
			if ( numero % i == 0 ) {
				contDivisores++; 
			}
			
			i++;
		}
		
		if ( contDivisores == 2 ) {
			System.out.println("O número " + numero + " É PRIMO.\n");
		} else {
			System.out.println("O número " + numero + " NÃO é primo (tem " + contDivisores + " divisores).");
		}
		
		receber.close();
	}

}
