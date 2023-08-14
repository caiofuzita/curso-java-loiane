package aula27.exercicios;

public class TesteLampada {

	public static void main(String[] args) {
		
		Lampada lampada = new Lampada();
		
		lampada.potencia = 15;
		lampada.tipo = "Led";
		lampada.ligar();
		
		System.out.println("Potência: " + lampada.potencia + " watts");
		System.out.println("Tipo: " + lampada.tipo);
		System.out.println("Status: " + lampada.status);
		
		System.out.println("\n*** Desligando ***");
		
		lampada.desligar();
		
		System.out.println("Status: " + lampada.status);
	}

}
