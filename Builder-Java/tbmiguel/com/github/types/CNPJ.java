package tbmiguel.com.github.types;

public class CNPJ {
	private String CNPJ;
	
	public CNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getCNPJ() {
		return CNPJ;
	}
	
	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	
	
	@Override
	public String toString() {
		return getCNPJ();
	}
	
}
