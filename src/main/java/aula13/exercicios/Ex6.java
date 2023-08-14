package aula13.exercicios;

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira a medida do lado do quadrado: ");

        int lado = scan.nextInt();

        int area = lado * lado;

        System.out.println("O dobro da área desse quadrado é: " + area * 2);
    }

}