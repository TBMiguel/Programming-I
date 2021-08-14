package classes;

public class calcular {
	private Float IMC;
	private Float peso;
	private Float altura;
	private String classific;
	
	public Float getIMC() {
		return IMC;
	}
	public void setIMC(Float iMC) {
		IMC = iMC;
	}
	public Float getPeso() {
		return peso;
	}
	public void setPeso(Float peso) {
		this.peso = peso;
	}
	public Float getAltura() {
		return altura;
	}
	public void setAltura(Float altura) {
		this.altura = altura;
	}
	public String getClassific() {
		return classific;
	}
	public void setClassific(String classific) {
		this.classific = classific;
	}
	
	public Float calc() {
		
		this.IMC = (getPeso() / (getAltura() * getAltura()));
		this.IMC = (this.IMC * 100.0f)/ 100.0f;
		return IMC;
	}
	
	public String stats() {
		if(IMC < 18.5f) {
			this.classific = "Magreza";
		} else if(IMC >= 18.5f && IMC <= 24.9f) {
			this.classific = "Normal";
		} else if(IMC > 24.9f && IMC <= 30) {
			this.classific = "Sobrepeso";
		} else if(IMC > 30) {
			this.classific = "Obesidade";
		}
		
		return classific;
	}
	
}
