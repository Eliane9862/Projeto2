package PrimeiroProjeto2025;

import java.util.Scanner;

public class EFJ20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" Projeto EFJ20\n ");
		System.out.println(" Aluno: Eliane Ferreira - RA:0024648\n ");
		System.out.println(" Classe EFJ20\n ");
		System.out.println(" Atividade 20: Números de Fibonacci \n  ");
		System.out.println(" Para essa atividade foi usado a IA para auxilio \n  ");
	//----- Fim do cabeçalho ----
		
		Scanner receber = new Scanner (System.in);
		
		System.out.println(" Quantos termos de Fibonacci você quer mostrar?\n ");
		int n = receber.nextInt();
		// 'n' é o número de termos
		// 1. Definimos os DOIS primeiros termos (sempre fixos)
		int t1 = 0; // Termo anterior
		int t2 = 1; // Termo atual
		
		System.out.println("\nOs " + n + " primeiros termos de Fibonacci são:\n");
		
		// O 'for' vai rodar 'n' vezes
		for ( int i = 1; i <= n; i++ ) {
			
			// 2. Imprime o primeiro termo (começa com 0)
			// Usamos 'print' para ficar na mesma linha
			System.out.print(t1 + " "); 
			
			// 3. Calcula o PRÓXIMO termo (somando os dois anteriores)
			int proximo = t1 + t2;
			
			// 4. Faz a "troca" para a próxima volta
			t1 = t2;      // O termo atual (t2) vira o termo anterior (t1)
			t2 = proximo; // O próximo termo (proximo) vira o termo atual (t2)
		}
		
		System.out.println();
		
		receber.close();
	}
		
		
	}


