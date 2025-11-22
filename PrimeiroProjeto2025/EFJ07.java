package PrimeiroProjeto2025;

import java.util.Scanner;

public class EFJ07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" Projeto EFJ01 \n ");
		System.out.println(" Aluno: Eliane Ferreira - RA:0024648 \n  ");
		System.out.println(" Classe EFJ07 Triangulo valido !!! \n ");
		System.out.println(" Usei atividades anteriores como base ");
		
		// ----- Fim do cabeçalho ----
		
		Scanner receber = new Scanner(System.in);
		System.out.print(" Digite a medida do Lado A: ");
        double ladoA = receber.nextDouble();
        
        System.out.print(" Digite a medida do Lado B: ");
        double ladoB = receber.nextDouble();
        
        System.out.print(" Digite a medida do Lado C: ");
        double ladoC = receber.nextDouble();
        
        if ( (ladoA + ladoB > ladoC) && (ladoA + ladoC > ladoB) && (ladoB + ladoC > ladoA) ) {
        	
        	System.out.print("Com essas medidas, é um TRIÂNGULO VÁLIDO :");
        }
        else {
        	System.out.println("  ");
        	System.out.print("Com essas medidas, é um TRIÂNGULO INVÁLIDO :");
        }
        
        receber.close();
	}

	
		
	}


