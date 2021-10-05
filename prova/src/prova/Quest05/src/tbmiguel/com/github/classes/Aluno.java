package tbmiguel.com.github.classes;

public class Aluno {
	private Integer id;
	private String nome;
	private String email;
	private String ra;
	
	public Aluno(Integer id, String nome, String email, String ra) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.ra = ra;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}
	
}
