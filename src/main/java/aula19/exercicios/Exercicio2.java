package aula19.exercicios;

public class Exercicio2 {

	public static void main(String[] args) {
		
		int[] a = new int[8];
		int[] b = new int[a.length];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = i + 1;
			b[i] = a[i] * 2;
		}
		
		for (int numbers : a) {
			System.out.println(numbers);
		}
		
		for (int numbers : b) {
			System.out.println(numbers);
		}

	}

}
