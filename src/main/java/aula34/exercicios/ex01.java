package aula34.exercicios;

public class ex01 {
	
	static void imprimirValor() {
		System.out.println(Contador.obterValor());
	}
	
	public static void main(String[] args) {
		
		imprimirValor();

		Contador.incrementar();
		
		imprimirValor();
		
		Contador.zerar();
		
		imprimirValor();
		
		Contador.incrementar();
		Contador.incrementar();
		Contador.incrementar();
		
		imprimirValor();
	}

}
