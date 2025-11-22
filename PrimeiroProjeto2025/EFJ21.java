package PrimeiroProjeto2025;

public class EFJ21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Projeto EFJ01\n");
		System.out.println(" Aluno: Eliane Ferreira - RA:0024648\n ");
		System.out.println(" Classe EFJ21\n ");
		System.out.println(" Atividade 21: Contar até 10 com while, "
				+ "usei a IA para me auxiliar nessa atividade \n  ");
	//----- Fim do cabeçalho ----
		
		System.out.println("Contando de 1 a 10 com WHILE:");

		// 1. Inicialização: Criamos o contador FORA do laço
		int i = 1;
		
		// 2. Condição: O laço continua ENQUANTO 'i' for menor ou igual a 10
		while ( i <= 10 ) {
			
			// Imprime o valor atual de 'i'
			System.out.println(i);
			
			// 3. Incremento: Somamos 1 ao 'i' DENTRO do laço
			// Se esquecer esta linha, o 'i' nunca muda e o laço fica infinito!
			i++;
		}
		
		System.out.println("\nContagem finalizada!");
	}	
		
	}


