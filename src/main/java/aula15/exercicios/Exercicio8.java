package aula15.exercicios;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira o valor de 3 produtos: ");
		
		double n1 = scan.nextDouble();
		double n2 = scan.nextDouble();
		double n3 = scan.nextDouble();
		
		if (n1 < n2 && n1 < n3) {
			System.out.println("Leve o primeiro produto");
		} else if (n2 < n1 && n2 < n3) {
			System.out.println("Leve o segundo produto");
		} else if (n3 < n1 && n3 < n2) {
			System.out.println("Leve o terceiro produto");
		} else {
			System.out.println("São todos iguais");
		}
	}

}
