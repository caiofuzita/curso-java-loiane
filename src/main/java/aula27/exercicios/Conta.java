package aula27.exercicios;

public class Conta {

	int numero;
	double saldo;
	boolean especial;
	double limite;
	
	boolean verificarEspecial() {	
		
		if (saldo >= 0) {
			return false;
		}
		
		return true;
		
	}
	
	double sacarDinheiro(double valor) {
		if (saldo < 0) {
			return 0;
		}
		
		return saldo -= valor;
	}
	
	double depositarDinheiro(double valor) {
		return saldo += valor;
	}
}
