package aula20.exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		char[][] tabuleiro = new char[3][3];							
		
		System.out.println("Jogador 1 = X");
		System.out.println("Jogador 2 = O");
		
		boolean ganhou = false;
		int jogada = 1;
		char sinal;
		int linha = 0, coluna = 0;
		
		while (!ganhou) {
			
			if (jogada % 2 == 1) { //jogador 1
				
				System.out.println("Vez do jogador 1. Escolhe linha e coluna (1-3)");
				sinal = 'X';
				
			} else {
				
				System.out.println("Vez do jogador 2. Escolhe linha e coluna (1-3)");
				sinal = 'O';
				
			}
			
			boolean linhaValida = false;
			while (!linhaValida) {
				System.out.println("Entre com a linha (1, 2 ou 3)");
				linha = scan.nextInt();
				if (linha >= 1 && linha <= 3) {
					linhaValida = true;
				} else {
					System.out.println("Entrada inválida, tente novamente");
				}
				
			}
			
			boolean colunaValida = false;
			while (!colunaValida) {
				System.out.println("Entre com a coluna (1, 2 ou 3");
				coluna = scan.nextInt();
				if (coluna >= 1 && coluna <= 3) {
					colunaValida = true;
				} else {
					System.out.println("Entrada inválida, tente novamente");
				}
			}
			
			linha--;
			coluna--;
			
			if (tabuleiro[linha][coluna] == 'X' || tabuleiro[linha][coluna] == 'O') {
				System.out.println("Posição já usada, tente novamente");
			} else {
				tabuleiro[linha][coluna] = sinal;
				jogada++;
			}
			
			for (int i = 0; i < tabuleiro.length; i++) {
				for (int j = 0; j < tabuleiro[i].length; j++) {
					System.out.print(tabuleiro[i][j] + " | ");
				}
				System.out.println();
			}
			
			// verifica se houve ganhador
			
			if ((tabuleiro[0][0] == 'X' && tabuleiro[0][1] == 'X' && tabuleiro[0][2] == 'X') || // linha 1
				(tabuleiro[1][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[1][2] == 'X') || // linha 2
				(tabuleiro[2][0] == 'X' && tabuleiro[2][1] == 'X' && tabuleiro[2][2] == 'X') || // linha 3
				(tabuleiro[0][0] == 'X' && tabuleiro[1][0] == 'X' && tabuleiro[2][0] == 'X') || // coluna 1
				(tabuleiro[0][1] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][1] == 'X') || // coluna 2
				(tabuleiro[0][2] == 'X' && tabuleiro[1][2] == 'X' && tabuleiro[2][2] == 'X') || // coluna 3
				(tabuleiro[0][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][2] == 'X') ||
				(tabuleiro[2][2] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[0][0] == 'X')) {
				ganhou = true;
				System.out.println("Jogador 1 ganhou!");
			} else if ((tabuleiro[0][0] == 'O' && tabuleiro[0][1] == 'O' && tabuleiro[0][2] == 'O') || // linha 1
					(tabuleiro[1][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[1][2] == 'O') || // linha 2
					(tabuleiro[2][0] == 'O' && tabuleiro[2][1] == 'O' && tabuleiro[2][2] == 'O') || // linha 3
					(tabuleiro[0][0] == 'O' && tabuleiro[1][0] == 'O' && tabuleiro[2][0] == 'O') || // coluna 1
					(tabuleiro[0][1] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][1] == 'O') || // coluna 2
					(tabuleiro[0][2] == 'O' && tabuleiro[1][2] == 'O' && tabuleiro[2][2] == 'O') || // coluna 3
					(tabuleiro[0][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][2] == 'O') ||
					(tabuleiro[2][2] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[0][0] == 'O')) {
				ganhou = true;
				System.out.println("Jogador 2 ganhou!");
			} else if (jogada > 9) {
				System.out.println("Empate");
			}
			
		}
	}

}
