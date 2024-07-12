package desafio_do_banco;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cliente {

	private String nome;
	private String sobrenome;
	
	

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

}
