package aula13.exercicios;

import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira a temperatura em graus Farenheit: ");

        double farenheit = scan.nextDouble();

        double celsius = (5 * (farenheit - 32) / 9);

        System.out.println("Temperatura em graus Celsius: " + celsius);

    }

}