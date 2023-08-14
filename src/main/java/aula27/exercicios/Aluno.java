package aula27.exercicios;

public class Aluno {
	String nome;
	int matricula;
	String curso;
	String[] disciplinas = new String[3];
	double[] notas = new double[3];
	
	void verificaNota() {
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] >= 7) {
				System.out.println(disciplinas[i] + ": Aprovado");
			} else {
				System.out.println(disciplinas[i] + ": Reprovado");
			}
		}
	}
	
}
