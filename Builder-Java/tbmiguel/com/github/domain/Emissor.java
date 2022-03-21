package tbmiguel.com.github.domain;

import tbmiguel.com.github.types.CNPJ;
import tbmiguel.com.github.types.Name;

public class Emissor {

	private Name nome;
	private CNPJ cnpj;

	public Emissor(Name nome, CNPJ cnpj) {
		this.nome = nome;
		this.cnpj = cnpj;
	}

	public Name getNome() {
		return nome;
	}

	public void setNome(Name nome) {
		this.nome = nome;
	}

	public CNPJ getCnpj() {
		return cnpj;
	}

	public void setCnpj(CNPJ cnpj) {
		this.cnpj = cnpj;
	}

}
