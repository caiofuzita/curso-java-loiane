package aula19.exercicios;

public class Exercicio5 {

	public static void main(String[] args) {
		int[] a = new int[10];
		int[] b = new int[a.length];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = i + 1;
			b[i] = a[i] * i;
		}
		
		for (double number : a) {
			System.out.println(number);
		}
		
		for (double number : b) {
			System.out.println(number);
		}

	}

}
