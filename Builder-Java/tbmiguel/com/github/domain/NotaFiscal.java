package tbmiguel.com.github.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import tbmiguel.com.github.types.Chave;
import tbmiguel.com.github.types.Numero;

public class NotaFiscal {

	private Numero numero;
	private Date dataEmissao;
	private Chave chave;

	private Emissor emissor;
	private Cliente cliente;

	private List<Produto> produtos = new ArrayList<>();

	public NotaFiscal(Date dataEmissao, Numero numero, Chave chave, Emissor emissor, Cliente cliente,
			List<Produto> produtos) {
		this.numero = numero;
		this.dataEmissao = dataEmissao;
		this.chave = chave;
		this.emissor = emissor;
		this.cliente = cliente;
		this.produtos = produtos;
	}

	public Numero getNumero() {
		return numero;
	}

	public void setNumero(Numero numero) {
		this.numero = numero;
	}

	public Date getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public Chave getChave() {
		return chave;
	}

	public void setChave(Chave chave) {
		this.chave = chave;
	}

	public Emissor getEmissor() {
		return emissor;
	}

	public void setEmissor(Emissor emissor) {
		this.emissor = emissor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Número: " + getNumero() + "\n");
		sb.append("Data de Emissão: " + getDataEmissao() + "\n");
		sb.append("Chave: " + getChave() + "\n");
		sb.append("Emissor Nome: " + getEmissor().getNome() + "\n");
		return sb.toString();
	}

}
