package aula33.exercicios;

public class TesteLampada {

	public static void main(String[] args) {
		
		Lampada lampada = new Lampada("ligada", 15, "led");
		
		System.out.println(lampada.getStatus());
		System.out.println(lampada.getTipo());
		System.out.println(lampada.getPotencia());
		
		lampada.desligar();
		
		System.out.println(lampada.getStatus());
		
		lampada.ligar();
		
		System.out.println(lampada.getStatus());
	}

}
