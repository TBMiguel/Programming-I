package tbmiguel.com.github.carro.classes;

public class Endereco {
	private String Rua;
	private String Bairro;
	private String Cidade;
	private String Estado;
	private int Cep;
	private String Complemento;
	
	public Endereco(String Rua, String Bairro, String Cidade, String Estado) {
		this.Rua = Rua;
		this.Bairro = Bairro;
		this.Cidade = Cidade;
		this.Estado = Estado;
	}

	public String getRua() {
		return Rua;
	}

	public void setRua(String rua) {
		Rua = rua;
	}

	public String getBairro() {
		return Bairro;
	}

	public void setBairro(String bairro) {
		Bairro = bairro;
	}

	public String getCidade() {
		return Cidade;
	}

	public void setCidade(String cidade) {
		Cidade = cidade;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

	public int getCep() {
		return Cep;
	}

	public void setCep(int cep) {
		Cep = cep;
	}

	public String getComplemento() {
		return Complemento;
	}

	public void setComplemento(String complemento) {
		Complemento = complemento;
	}

	public Endereco getEndereco() {
		return null;
	}
}
