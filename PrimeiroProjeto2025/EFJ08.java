package PrimeiroProjeto2025;

import java.util.Scanner;

public class EFJ08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Projeto EFJ01 \n ");
		System.out.println(" Aluno: Eliane Ferreira - RA:0024648 \n  ");
		System.out.println(" Classe EFJ08 Longin simples! \n ");
		System.out.println(" Usei atividades anteriores como base");
		// Fim do cabeçalho //
		
		String usuariocorreto = "EFJ08";
		String senhacorreta = "1234";

		Scanner receber = new Scanner(System.in);

		System.out.println(" Longin ");
		System.out.println(" Digite o seu usuário: ");
		String usuariodigitado = receber.nextLine();

		System.out.println(" Digite a sua senha: ");
		String senhadigitada = receber.nextLine();

		if (usuariodigitado.equals(usuariocorreto)) {

			if (senhadigitada.equals(senhacorreta)) {

				System.out.println("\nLogin efetuado com sucesso! Bem-vinda, " + usuariocorreto + "!");
			} else {

				System.out.println("\nSenha incorreta. Acesso negado.");
			}
		} else {

			System.out.println("\nUsuário não encontrado. Acesso negado.");
		}

		receber.close();

	}

}
