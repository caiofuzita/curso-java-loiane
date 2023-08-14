package aula33.exercicios;

public class TesteConta {

	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente();
		
		conta.setNumero(123);
		conta.setSaldo(1000);
		conta.verificarChequeEspecial();

		System.out.println(conta.getNumero());
		System.out.println(conta.getSaldo());
		System.out.println(conta.noChequeEspecial());
		
		conta.sacar(1500);
		
		conta.verificarChequeEspecial();
		System.out.println(conta.getSaldo());
		System.out.println(conta.noChequeEspecial());
		
		conta.depositar(1000);
		
		conta.verificarChequeEspecial();
		System.out.println(conta.getSaldo());
		System.out.println(conta.noChequeEspecial());
	}

}
