package PrimeiroProjeto2025;

import java.util.Scanner;

public class EFJ02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" Projeto EFJ01 \n ");
		System.out.println(" Aluno: Eliane Ferreira - RA:0024648 \n  ");
		System.out.println(" Classe EFJ02 Número Par OU Ímpar!!! \n ");
		System.out.println(" Usei atividades anteriores como base");
		// ----- Fim do cabeçalho ----
		
		Scanner receber = new Scanner (System.in);
		System.out.print(" \nDigite um número inteiro: ");
        int numero = receber.nextInt();
		
        if ( numero % 2 == 0) {
        	System.out.print(" \nO número " + numero + " é PAR: ");
        }
		
        else {
        	System.out.print(" \nO número " + numero + " é ÍMPAR: ");
        }
		
		
        receber.close();
		
		
		
		
	}

}
