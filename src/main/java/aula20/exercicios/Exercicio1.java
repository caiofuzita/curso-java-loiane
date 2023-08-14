package aula20.exercicios;

import java.util.Random;

public class Exercicio1 {

	public static void main(String[] args) {
		int[][] matriz = new int[4][4];

		Random numeroRandom = new Random();
		
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = numeroRandom.nextInt(100);
			}
		}

		int maior = 0;
		int posLinha = 0;
		int posColuna = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
				if (matriz[i][j] > maior) {
					maior = matriz[i][j];
					posLinha = i + 1;
					posColuna = j + 1;
				}
			}
			System.out.println();
		}

		System.out.println("Linha: " + posLinha + " Coluna: " + posColuna + " Valor: " + maior);
	}

}
