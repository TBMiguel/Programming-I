package tbmiguel.com.github.types;

import java.io.IOException;

public class Chave {
	private String chave;
	private final Integer TAMANHO_MAX_CHAVE = 9;
	
	public Chave(String chave) throws Exception {
		setChave(chave);
	}

	public String getChave() {
		return this.chave;
	}

	public void setChave(String chave) throws Exception {
		try {
			validaChave(chave);
			this.chave = chave;
		} catch (IOException e){
			e.printStackTrace();
		}
	}	
	
	public Boolean validaChave(String chave) throws Exception {
		if(chave.length() != TAMANHO_MAX_CHAVE) {
			throw new Exception("Erro: Chave deve ter 9 caracteres!");
		}
		return true;	
	}
	
	@Override
	public String toString() {
		return getChave();
	}
}
