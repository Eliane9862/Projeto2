package PrimeiroProjeto2025;

public class EFJ28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Projeto EFJ01\n ");
		System.out.println(" Aluno: Eliane Ferreira - RA:0024648\n ");
		System.out.println(" Classe EFJ28\n ");
		System.out.println(" Atividade 28: Soma dos pares entre 1 e 100 \n  ");
	//----- Fim do cabeçalho ----
		
		int somaPares = 0; 
		
		int i = 1;

		while ( i <= 100 ) {
			
		
			if ( i % 2 == 0 ) {
				somaPares = somaPares + i;
			}
			
			i++;
		}
		
		System.out.println("A soma de todos os números pares de 1 a 100 é:\n " + somaPares);
	}

}
