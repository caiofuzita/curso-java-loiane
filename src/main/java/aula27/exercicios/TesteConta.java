package aula27.exercicios;

public class TesteConta {

	public static void main(String[] args) {
		
		Conta conta = new Conta();

		conta.numero = 1234;
		conta.saldo = 1000;
		conta.especial = conta.verificarEspecial();
		
		System.out.println("Saldo: " + conta.saldo);
		System.out.println("Cheque especial: " + conta.especial);
		
		conta.depositarDinheiro(500);
		
		System.out.println("Saldo: " + conta.saldo);
		
		conta.sacarDinheiro(750);
		
		System.out.println("Saldo: " + conta.saldo);
		
		conta.sacarDinheiro(1000);
		conta.especial = conta.verificarEspecial();
		
		System.out.println("Saldo: " + conta.saldo);
		System.out.println("Cheque especial: " + conta.especial);
	}

}
