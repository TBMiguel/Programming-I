package tbmiguel.com.github.carro.classes;

public class Carro {
	private String modelo;
	private String cor;
	private int ano;
	private String marca;
	private String chassi;
	private Proprietario proprietario;
	private float velocMax;
	private float velocAtual;
	private int nPortas;
	private String temTeto; //Armazena se tem teto solar ou não [S/N]
	private int nMarchas; //Número limite de marchas do carro
	private int marcha; //Controla a marcha atual
	private String cambioAuto; //Armazena se tem câmbio automático ou não [S/N]
	private int volCombustivel; //Volume de combustível
	
	public Carro(String modelo, String cor, String marca, Proprietario proprietario, 
			float velocMax, int nPortas, int nMarchas) {
		this.modelo = modelo;
		this.cor = cor;
		this.marca = marca;
		this.proprietario = proprietario;
		this.velocMax = velocMax;
		this.nPortas = nPortas;
		this.nMarchas = nMarchas;
	}
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
//inicio Propietario
	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}
//Fim Propietario

	public float getVelocMax() {
		return velocMax;
	}

	public void setVelocMax(float velocMax) {
		this.velocMax = velocMax;
	}

	public float getVelocAtual() {
		return velocAtual;
	}

	public void setVelocAtual(float velocAtual) {
		this.velocAtual = velocAtual;
	}

	public int getnPortas() {
		return nPortas;
	}

	public void setnPortas(int nPortas) {
		this.nPortas = nPortas;
	}

	public String getTemTeto() {
		return temTeto;
	}

	public void setTemTeto(String temTeto) {
		this.temTeto = temTeto;
	}

	public int getnMarchas() {
		return nMarchas;
	}

	public void setnMarchas(int nMarchas) {
		this.nMarchas = nMarchas;
	}

	public String getCambioAuto() {
		return cambioAuto;
	}

	public void setCambioAuto(String cambioAuto) {
		this.cambioAuto = cambioAuto;
	}

	public int getVolCombustivel() {
		return volCombustivel;
	}

	public void setVolCombustivel(int volCombustivel) {
		this.volCombustivel = volCombustivel;
	}
	
	public void acelera() {
		this.velocAtual = velocAtual + 1;
		System.out.println("Velocidade aumentada para: " + velocAtual);
	}
	
	public void reduzVelocidade() {
		if(velocAtual==0) {
			System.out.println("Carro Parado, acelere ou engate a marcha ré!");
		}else {
			this.velocAtual = velocAtual - 1;
			System.out.println("Velocidade reduzida para: " + velocAtual);
		}
	}
	
	public void freia() {
		this.velocAtual = 0;
		System.out.println("Freiando..");
		System.out.println("Velocidade: " + velocAtual);
	}
	
	public void trocaMarcha() {
		if (this.marcha < this.nMarchas) {
				this.marcha = this.marcha + 1;
				System.out.println("Marcha trocada para: " + marcha);
		} else {
			if(this.marcha == this.nMarchas) {
				System.out.println("A marcha chegou no limite de marchas. Limite: " + nMarchas);
			}
		}
	}
	
	public void reduzMarcha() {
		if(this.marcha > 0 && this.marcha <= this.nMarchas) {
			this.marcha = this.marcha - 1;
			System.out.println("Marcha reduzida para: " + marcha);
		} else {
			if(this.marcha == 0) {
				System.out.println("Atenção!!");
				System.out.println("Foi selecionado o ponto morto.");
			} else {
				System.out.println("Impossível reduzir marcha!");
				System.out.println("Marcha em ponto morto");
			}
		}
	}
	
	public void marchaRe() {
		if(velocAtual > 0) {
			System.out.println("Marcha ré não pode ser engatada, velocidade superior a 0 KM/h.");
		} else {
			this.marcha = -1;
			System.out.println("Marcha ré engatada.");
		}
	}
}
