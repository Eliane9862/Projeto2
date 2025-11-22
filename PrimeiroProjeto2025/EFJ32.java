package PrimeiroProjeto2025;

import java.util.Scanner;

public class EFJ32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Projeto EFJ01\n");
		System.out.println(" Aluno: Eliane Ferreira - RA:0024648\n ");
		System.out.println(" Classe EFJ32\n ");
		System.out.println(" Atividade 32: Tabuada de um número \n  ");
	//----- Fim do cabeçalho ----
		
		Scanner receber = new Scanner (System.in);
		System.out.println(" ");
		System.out.println(" Digite um número para ver a tabuada: ");
		int numero = receber.nextInt();
		System.out.println(" ");
		System.out.println("\n Tabuada do " + numero + " ");
		
		int i = 1;
		
		do {
			System.out.println(" ");
			int resultado = numero * i;
			System.out.println(numero + " x " + i + " = "+ resultado);

			i++;
		
		} while ( i <= 10 );
		
		receber.close();
	}

}
