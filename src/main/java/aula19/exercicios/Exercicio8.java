package aula19.exercicios;

public class Exercicio8 {

	public static void main(String[] args) {
		int[] a = new int[10];
		int[] b = new int[a.length];
		int[] c = new int[a.length];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = i + 1;
			b[i] = i * 2;
			c[i] = a[i] * b[i];
		}
		
		for (int number : a) {
			System.out.println(number);
		}
		
		for (int number : b) {
			System.out.println(number);
		}

		for (int number : c) {
			System.out.println(number);
		}

	}

}
