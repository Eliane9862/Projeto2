package PrimeiroProjeto2025;

import java.util.Scanner;

public class EFJ25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(" Projeto EFJ01\n ");
		System.out.println(" Aluno: Eliane Ferreira - RA:0024648\n ");
		System.out.println(" Classe EFJ25\n ");
		System.out.println(" Atividade 25: Tabuada com while \n  ");
	//----- Fim do cabeçalho ----
		
		Scanner captura = new Scanner (System.in);
		
		System.out.println(" \nDigite um número para ver a tabuada: ");
		int numero = captura.nextInt();
		System.out.println(" ");
		System.out.println("\n Tabuada do " + numero + " (com while)");
		System.out.println(" ");
		int i = 1;
		
		while ( i <= 10 ) {
			
			int resultado = numero * i;
			System.out.println(numero + " x " + i + " = " + resultado);
		
			i++;
		}
		
		captura.close();
	}

}
