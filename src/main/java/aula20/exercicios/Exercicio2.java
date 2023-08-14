package aula20.exercicios;

import java.util.Random;

public class Exercicio2 {

	public static void main(String[] args) {
		int[][] matriz = new int[10][10];
		
		Random numeroRandom = new Random();
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = numeroRandom.nextInt(100);
			}
		}
		
		int maiorLinha5 = 0;
		int menorLinha5 = 101;
		
		int maiorColuna7 = 0;
		int menorColuna7 = 101;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + " ");
				
				if (i == 4) {
					if (matriz[i][j] < menorLinha5) {
						menorLinha5 = matriz[i][j];
					} else if (matriz[i][j] > maiorLinha5) {
						maiorLinha5 = matriz[i][j];
					}
					
				}
				
				if (j == 6) {
					if (matriz[i][j] < menorColuna7) {
						menorColuna7 = matriz[i][j];
					} else if (matriz[i][j] > maiorColuna7) {
						maiorColuna7 = matriz[i][j];
					}
				}
			}
			System.out.println();
		}
		
		System.out.println("Maior da linha 5: " + maiorLinha5);
		System.out.println("Menor da linha 5: " + menorLinha5);
		System.out.println("Maior da coluna 7: " + maiorColuna7);
		System.out.println("Menor da coluna 7: " + menorColuna7);
	}

}
