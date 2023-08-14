package aula33.exercicios;

public class Lampada {
	
	private String status;
	private int potencia;
	private String tipo;
	
	public Lampada(String status, int potencia, String tipo) {
		this.status = status;
		this.potencia = potencia;
		this.tipo = tipo;
	}

	public String getStatus() {
		return status;
	}
	
	public void ligar() {
		this.status = "ligada";
	}
	
	public void desligar() {
		this.status = "desligada";
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
}
