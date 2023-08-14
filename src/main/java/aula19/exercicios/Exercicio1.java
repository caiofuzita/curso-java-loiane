package aula19.exercicios;

public class Exercicio1 {

	public static void main(String[] args) {
		
		int[] a = new int[5];
		
		for(int i = 0; i < a.length; i++) {
			a[i] = i;
		}
		
		int[] b = a;
		
		for(int values : b) {
			System.out.println(values);
		}

	}

}
