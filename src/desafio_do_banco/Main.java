package desafio_do_banco;

public class Main {

	public static void main(String[] args) {
		
		Cliente filipe = new Cliente();
		filipe.setNome("Filipe Moreira dos Santos");
		
		Conta cc = new ContaCorrente(filipe);
		cc.depositar(100);
		
		Conta poupanca = new ContaPoupanca(filipe);
		
		cc.transferir(22.5, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
