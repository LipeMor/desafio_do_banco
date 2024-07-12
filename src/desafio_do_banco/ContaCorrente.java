package desafio_do_banco;

public class ContaCorrente extends Conta{

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Estrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}	
	
	
}
