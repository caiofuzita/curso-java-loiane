package aula17.exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean verificador = false;
		
		do {
			System.out.println("Insira seu login: ");
			String login = scan.next();
			
			System.out.println("Insira sua senha: ");
			String senha = scan.next();
			
			if (login.equals(senha)) {
				verificador = true;
				System.out.println("A senha não pode ser igual ao login, tente novamente");
			} else {
				verificador = false;
			}
		} while (verificador == true);
		
		

	}

}
