package tbmiguel.com.github.domain;

import tbmiguel.com.github.types.CNPJ;
import tbmiguel.com.github.types.Name;

public class Cliente {

	private Name nome;
	private CNPJ CNPJ;

	public Cliente(Name nome, CNPJ CNPJ) {
		this.nome = nome;
		this.CNPJ = CNPJ;
	}

	public Name getNome() {
		return nome;
	}

	public void setNome(Name nome) {
		this.nome = nome;
	}

	public CNPJ getDocumento() {
		return CNPJ;
	}

	public void setDocumento(CNPJ CNPJ) {
		this.CNPJ = CNPJ;
	}
	
}
