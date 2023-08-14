package aula19.exercicios;

public class Exercicio9 {

	public static void main(String[] args) {
		double[] a = new double[10];
		double[] b = new double[a.length];
		double[] c = new double[a.length];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = i + 1;
			b[i] = i * 2;
			c[i] = a[i] / b[i];
		}
		
		for (double number : a) {
			System.out.println(number);
		}
		
		for (double number : b) {
			System.out.println(number);
		}

		for (double number : c) {
			System.out.println(number);
		}

	}

}
