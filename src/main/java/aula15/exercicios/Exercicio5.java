package aula15.exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double nota1 = scan.nextDouble();
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if (media == 10) {
			System.out.println("Aprovado com Distinção\nMédia: " + media);
		} else if (media >= 7) {
			System.out.println("Aprovado\nMédia: " + media);
		} else {
			System.out.println("Reprovado\nMédia: " + media);
		}
	}

}
