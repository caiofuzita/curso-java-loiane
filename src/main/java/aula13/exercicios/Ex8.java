package aula13.exercicios;

import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira seu salário por hora: ");
        double salarioHora = scan.nextDouble();

        System.out.println("Insira o número de horas trabalhadas no mês: ");
        double horasTrabalho = scan.nextDouble();

        double salarioMensal = salarioHora * horasTrabalho;

        System.out.println("Salário mensalL: " + salarioMensal);
    }

}