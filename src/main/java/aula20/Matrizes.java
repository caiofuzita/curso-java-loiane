package aula20;

public class Matrizes {

	public static void main(String[] args) {
		
		double[][] notasAlunos = new double[30][4];
		
		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 7;
		notasAlunos[0][2] = 9;
		notasAlunos[0][3] = 9.5;
		
		notasAlunos[1][0] = 9;
		notasAlunos[1][1] = 8;
		notasAlunos[1][2] = 7;
		notasAlunos[1][3] = 9;
		
		notasAlunos[2][0] = 8;
		notasAlunos[2][1] = 9;
		notasAlunos[2][2] = 10;
		notasAlunos[2][3] = 7;
	
		System.out.println("Número de linhas: " + notasAlunos.length);
		System.out.println("Número de colunas: " + notasAlunos[0].length);
		System.out.println();
		
		for (int i = 0; i < 3; i++) { // i < notasAlunos.length
			for (int j = 0; j < 4; j++) { // i < notasAlunos[i].length
				System.out.println("Nota " + (j + 1) + " do aluno " + (i + 1) + ": " + notasAlunos[i][j]);
			}
			System.out.println();
		}
		
		notasAlunos[1][3] = 8;
		
		for (int i = 0; i < 3; i++) { // i < notasAlunos.length
			for (int j = 0; j < 4; j++) { // i < notasAlunos[i].length
				System.out.println("Nota " + (j + 1) + " do aluno " + (i + 1) + ": " + notasAlunos[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("Calculando a média de cada aluno");
		
		double soma;
		
		for (int i = 0; i < 3; i++) { // i < notasAlunos.length
			soma = 0;
			for (int j = 0; j < 4; j++) { // i < notasAlunos[i].length
				soma += notasAlunos[i][j];
			}
			System.out.println("Média do aluno " + (i + 1) + ": " + (soma / 4));
			
		}
		
		double[] notasAlunos1 = {7, 8, 9, 10};
		double[][] notasAlunos2 = {{7, 8, 9, 10}, {7, 6, 6.4 ,5}};
		
		for (double notas : notasAlunos1) {
			System.out.println(notas);
		}
		System.out.println();
		
		for (int i = 0; i < notasAlunos2.length; i++) {
			for (int j = 0; j < notasAlunos2[i].length; j++) {
				System.out.println(notasAlunos2[i][j]);
			}
			System.out.println();
		}

	}

}
