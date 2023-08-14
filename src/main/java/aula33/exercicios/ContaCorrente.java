package aula33.exercicios;

public class ContaCorrente {
	private int numero;
	private double saldo;
	private boolean chequeEspecial;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public boolean noChequeEspecial() {
		return chequeEspecial;
	}
	
	public void verificarChequeEspecial() {
		if (saldo >= 0) {
			this.chequeEspecial = false;
		} else {
			this.chequeEspecial = true;
		}
	}
	
	public double sacar(double valor) {
		return this.saldo -= valor;
	}
	
	public double depositar(double valor) {
		return this.saldo += valor;
	}
}
