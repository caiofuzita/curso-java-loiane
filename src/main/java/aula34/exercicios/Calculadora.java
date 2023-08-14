package aula34.exercicios;

public class Calculadora {
	
	public static int somar(int a, int b) {
		return a + b;
	}
	
	public static int subtrair(int a, int b) {
		return a - b;
	}
	
	public static int dividir(int a, int b) {
		return a / b;
	}
	
	public static int potencia(int a, int b) {
		return (int) Math.pow(a, b);
	}
	
	public static int multiplicar(int a, int b) {
		return a * b;
	}
	
	public static int fatorial(int a) {
		
		int resultado = 0; 
		
		for (int i = a; i > 0; i--) {
			resultado += (i * i-1);
		}
		
		return resultado;
	}
	
}
