package aula15.exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String entrada = scan.next();
		
		
		switch (entrada) {
		case "A":
		case "E":
		case "I":
		case "O":
		case "U":
			System.out.println("Vogal");
			break;
		default:
			System.out.println("Consoante");
		}

	}

}
