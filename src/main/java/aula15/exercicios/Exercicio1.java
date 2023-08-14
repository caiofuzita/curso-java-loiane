package aula15.exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira o primeiro valor: ");	
		double valor1 = scan.nextDouble();
		
		System.out.println("Insira o segundo valor: ");
		double valor2 = scan.nextDouble();
		
		if (valor1 > valor2) {
			System.out.println(valor1 + " é maior que " + valor2);
		} else if (valor2 > valor1) {
			System.out.println(valor2 + " é maior que " + valor1);
		} else {
			System.out.println("Ambos são iguais");
		}
	}

}
