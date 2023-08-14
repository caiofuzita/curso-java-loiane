package aula27.exercicios;

import java.util.Scanner;

public class TesteAluno {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira o nome do aluno: ");
		aluno.nome = scan.next();

		System.out.println("Insira a matrícula do aluno: ");
		aluno.matricula = scan.nextInt();
		
		System.out.println("Insira respectivamente a matéria e a nota do aluno: ");
		aluno.disciplinas[0] = scan.next();
		aluno.notas[0] = scan.nextDouble();
		
		aluno.disciplinas[1] = scan.next();
		aluno.notas[1] = scan.nextDouble();
		
		aluno.disciplinas[2] = scan.next();
		aluno.notas[2] = scan.nextDouble();
		
		aluno.verificaNota();
	}

}
