package PrimeiroProjeto2025;

import java.util.Scanner;

public class EJF5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" Projeto EFJ01 \n ");
		System.out.println(" Aluno: Eliane Ferreira - RA:0024648 \n  ");
		System.out.println(" Classe EFJ05 Notas Aprovação !!! \n ");
		System.out.println(" Usei atividades anteriores como base ");
		
		// ----- Fim do cabeçalho ----

		Scanner receber = new Scanner(System.in);
		System.out.print(" ");

		System.out.print(" Digite a primeira nota:\n ");
		double nota1 = receber.nextDouble();

		System.out.print(" Digite a segunda nota:\n ");
		
		double nota2 = receber.nextDouble();

		double media = (nota1 + nota2) / 2;

		System.out.print(" A média do aluno é: \n " + media);

		if (media >= 7.0) {

			System.out.print(" Resultado: APROVADO! \n ");

		} else {
			System.out.println("   ");
			System.out.print(" Resultado: REPROVADO. \n ");
		}
		
		receber.close(); 
	}

}
