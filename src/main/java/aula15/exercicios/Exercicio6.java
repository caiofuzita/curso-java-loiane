package aula15.exercicios;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double n1 = scan.nextDouble();
		double n2 = scan.nextDouble();
		double n3 = scan.nextDouble();
		
		if (n1 > n2 && n1 > n3) {
			System.out.println(n1 + " n1 é o maior");
		} else if (n2 > n1 && n2 > n3) {
			System.out.println(n2 + " n2 é o maior");
		} else if (n3 > n1 && n3 > n2) {
			System.out.println(n3 + " n3 é o maior");
		} else {
			System.out.println("São todos iguais");
		}
	}

}
