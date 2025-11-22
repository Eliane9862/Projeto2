package PrimeiroProjeto2025;

import java.util.Scanner;

public class EFJ10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Projeto EFJ01\n ");
		System.out.println(" Aluno: Eliane Ferreira - RA:0024648\n ");
		System.out.println(" Classe EFJ10\n ");
		System.out.println(" Atividade 10: Ano bisexto\n   ");
		System.out.println(" Usei IA como ferramenta para  uma base\n ");
		// -- Fim do cabeçalho --//
		
		// Criamos o Scanner para ler o teclado
		
		Scanner receber = new Scanner(System.in);
		
		System.out.print(" Digite um ano :\n ");
		
		int ano = receber.nextInt();

		// --- AQUI ESTÁ A LÓGICA ---

		// (Regra 1: Divisível por 4 E NÃO por 100) OU (Regra 2: Divisível por 400)

		// Usamos % (módulo) para ver o resto da divisão
		// != significa "diferente de"

		if (((ano % 4 == 0) && (ano % 100 != 0)) || (ano % 400 == 0)) {

			// Se a regra 1 OU a regra 2 for verdadeira
			
			System.out.print ("O ano " + ano + " É BISSEXTO: ");
		} else {
			// Se nenhuma das regras for verdadeira
			
			System.out.print ("O ano " + ano + " NÃO é bissexto: ");
		}

		receber.close();

	}

}
