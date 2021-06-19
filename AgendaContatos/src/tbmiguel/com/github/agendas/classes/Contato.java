package tbmiguel.com.github.agendas.classes;

import java.util.ArrayList;

public class Contato extends Agenda{
	private String Nome;
	private String Sobrenome;
	private String Empresa;
	private String Descricao;
	private String TelefoneFixo;
	private String TelefoneCelular;
	private String Email;
	
	private ArrayList<Endereco> enderecos;
	
	public Contato(String nome, String sobrenome, String telefoneCelular, String email, ArrayList<Endereco> enderecos) {
		Nome = nome;
		Sobrenome = sobrenome;
		TelefoneCelular = telefoneCelular;
		Email = email;
		this.enderecos = enderecos;
	}
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getSobrenome() {
		return Sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		Sobrenome = sobrenome;
	}
	public String getEmpresa() {
		return Empresa;
	}
	public void setEmpresa(String empresa) {
		Empresa = empresa;
	}
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
	public String getTelefoneFixo() {
		return TelefoneFixo;
	}
	public void setTelefoneFixo(String telefoneFixo) {
		TelefoneFixo = telefoneFixo;
	}
	public String getTelefoneCelular() {
		return TelefoneCelular;
	}
	public void setTelefoneCelular(String telefoneCelular) {
		TelefoneCelular = telefoneCelular;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	//Get And Setters for ArrayList Enderecos
	public ArrayList<Endereco> getEnderecos() {
		return enderecos;
	}
	public void setEnderecos(ArrayList<Endereco> enderecos) {
		this.enderecos = enderecos;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Contato: " + getNome() + " " + getSobrenome() + "\n");
		sb.append("Telefone Celular: " + getTelefoneCelular() + "\n");
		sb.append("Email: " + getEmail() + "\n");
		return sb.toString();
	}
	
}
