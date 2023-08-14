package aula17.exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean verificador = false;
		
		do {
			System.out.println("Insira uma nota: ");
			double nota = scan.nextDouble();
			
			if (nota < 0 || nota > 10) {
				System.out.println("Nota inválida");
			} else {
				System.out.println("Valor válido");
				verificador = true;
			}
		} while (!verificador);

	}

}
