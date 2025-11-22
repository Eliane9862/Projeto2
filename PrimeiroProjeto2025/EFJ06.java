package PrimeiroProjeto2025;

import java.util.Scanner;

public class EFJ06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" Projeto EFJ01 \n ");
		System.out.println(" Aluno: Eliane Ferreira - RA:0024648 \n  ");
		System.out.println(" Classe EFJ06 Múltiplo de 3 e/ou 5 !!! \n ");
		System.out.println(" Usei atividades anteriores como base ");
		
		// ----- Fim do cabeçalho ----

		Scanner receber = new Scanner(System.in);
		System.out.print(" ");

		System.out.println(" Digite um número inteiro: ");
        int numero = receber.nextInt();
        
        if  ((numero % 3 == 0) && (numero % 5 == 0) ) {
        	
        	System.out.println("O número " + numero + " é múltiplo de 3 e 5:");
        	
        	  if (numero % 3 == 0) {
        		 
        	 }
        		  
        		  System.out.println("O número " + numero + " é múltiplo APENAS de 3.");
        		 
        	}
        	  else if (numero % 5 == 0) {
        		  
        	  }
        	
        	  else {
        		  System.out.println("O número " + numero + " NÃO é múltiplo de 3 nem de 5.");
        	
        		  receber.close();
        }
		
		
	}

}
