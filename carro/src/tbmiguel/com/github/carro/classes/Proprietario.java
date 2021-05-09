package tbmiguel.com.github.carro.classes;

public class Proprietario {
	private String Nome;
	private String CPF;
	private String RG;
	private String DataNasc;
	private Endereco Endereco;
	
	public Proprietario(String nome, String CPF, String RG, Endereco Endereco) {
		this.Nome = nome;
		this.CPF = CPF;
		this.RG = RG;
		this.Endereco = Endereco;
	}
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getRG() {
		return RG;
	}
	public void setRG(String rG) {
		RG = rG;
	}
	public String getDataNasc() {
		return DataNasc;
	}
	public void setDataNasc(String dataNasc) {
		DataNasc = dataNasc;
	}
//Inicio Endereco
	public Endereco getEndereco() {
		return Endereco;
	}

	public void setEndereco(Endereco Endereco) {
		this.Endereco = Endereco;
	}	
//Fim Endereco
	public Proprietario getProprietario() {
		return null;
	}
}