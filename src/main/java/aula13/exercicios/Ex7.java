package aula13.exercicios;


import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira o raio do círculo: ");

        double raio = scan.nextDouble();
        double area = 3.1415 * (raio * raio);

        System.out.println("O valor da área do círculo é: " + area);
    }

}
