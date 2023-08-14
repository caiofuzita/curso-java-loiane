package aula15.exercicios;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String entrada = scan.next();
		
		switch (entrada) {
		case "F":
			System.out.println("Feminino");
			break;
		case "M":
			System.out.println("Masculino");
			break;
		default:
			System.out.println("Entrada inválida");
		}
	}
}
