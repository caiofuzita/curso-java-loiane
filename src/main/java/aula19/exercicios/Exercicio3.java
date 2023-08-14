package aula19.exercicios;

public class Exercicio3 {

	public static void main(String[] args) {
		int[] a = new int[15];
		int[] b = new int[a.length];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = i + 1;
			b[i] = a[i] * a[i];
		}

		for (int numbers : a) {
			System.out.println(numbers);
		}
		
		for (int numbers : b) {
			System.out.println(numbers);
		}
	}

}
