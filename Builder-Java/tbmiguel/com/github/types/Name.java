package tbmiguel.com.github.types;

public class Name {
	private String Nome;

	public Name(String nome) {
		Nome = nome;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}
	
	@Override
	public String toString() {
		return getNome();
	}
}
