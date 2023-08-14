package aula15.exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira um valor: ");
		
		double entrada = scan.nextDouble();
		
		if (entrada >= 0) {
			System.out.println("O número é positivo");
		} else {
			System.out.println("O número é negativo");
		}
	}

}
