package tbmiguel.com.github.types;

public class Numero {
	private String Numero;

	public Numero(String numero) {
		Numero = numero;
	}
	
	public String getNumero() {
		return Numero;
	}

	public void setNumero(String numero) {
		Numero = numero;
	}
	
	@Override
	public String toString() {
		return getNumero();
	}
}
