package tbmiguel.com.github.agendas.classes;

public class Endereco {
	
		private String rua;
		private String cidade;
		private String estado;
		private int cep;
		private String complemento;
		
		
		public Endereco(String rua, String cidade, String estado, int cep) {
			this.rua = rua;
			this.cidade = cidade;
			this.estado = estado;
			this.cep = cep;
		}
		
		public String getRua() {
			return rua;
		}
		public void setRua(String rua) {
			this.rua = rua;
		}
		public String getCidade() {
			return cidade;
		}
		public void setCidade(String cidade) {
			this.cidade = cidade;
		}
		public String getEstado() {
			return estado;
		}
		public void setEstado(String estado) {
			this.estado = estado;
		}
		public int getCep() {
			return cep;
		}
		public void setCep(int cep) {
			this.cep = cep;
		}
		public String getComplemento() {
			return complemento;
		}
		public void setComplemento(String complemento) {
			this.complemento = complemento;
		}

}
