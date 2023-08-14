package aula19.exercicios;

public class Exercicio4 {

	public static void main(String[] args) {
		double[] a = new double[15];
		double[] b = new double[a.length];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = i + 1;
			b[i] = Math.sqrt(a[i]);
		}
		
		for (double number : a) {
			System.out.println(number);
		}
		
		for (double number : b) {
			System.out.println(number);
		}

	}

}
