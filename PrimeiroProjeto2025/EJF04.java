package PrimeiroProjeto2025;

import java.util.Scanner;

public class EJF04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" Projeto EFJ01 \n ");
		System.out.println(" Aluno: Eliane Ferreira - RA:0024648 \n  ");
		System.out.println(" Classe EFJ04 Pode voltar !!! \n ");
		System.out.println(" Usei atividades anteriores como base ");
		// ----- Fim do cabeçalho ----

		Scanner entrar = new Scanner(System.in);

		System.out.println(" Digite a sua idade: ");
		int idade = entrar.nextInt();

		if (idade < 16) {
			
			System.out.println("Com " + idade + " anos, você NÃO PODE votar.");
			
		}
		else if ( (idade >= 16 && idade < 18) || (idade >= 70) ) {
			
		}
			
		System.out.println("Com " + idade + " anos, o voto é OBRIGATÓRIO.");	
			
			
		entrar.close(); 

	}

}
