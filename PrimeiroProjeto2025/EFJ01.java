package PrimeiroProjeto2025;

import java.util.Scanner;

public class EFJ01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" Projeto EFJ01 \n ");
		System.out.println(" Aluno: Eliane Ferreira - RA:0024648 \n  ");
		System.out.println(" Classe EFJ01 Número positivo ou negativo!!! \n ");
		// ----- Fim do cabeçalho ----

		Scanner captura = new Scanner(System.in);
		System.out.print(" Digite um número inteiro : \n ");
		int numero = captura.nextInt();
		if (numero > 0) {

			System.out.print(" O número " + numero + " é POSITIVO: \n ");
		} else if (numero < 0)

			System.out.print(" O número " + numero + " é NEGATIVO: \n ");

		{
			
			} 
		

			captura.close();

		}

	}



