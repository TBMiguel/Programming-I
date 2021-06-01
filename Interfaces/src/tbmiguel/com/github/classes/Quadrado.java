package tbmiguel.com.github.classes;

import tbmiguel.com.github.interfaces.FiguraGeometrica;

public class Quadrado implements FiguraGeometrica{

	private int lado;
	
	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	@Override
	public void calculaArea() {
		int area = 0;
		area = lado * lado;
		System.out.println("A área do Quadrado é: " + area);
	}

	@Override
	public void calculaPerimetro() {
		int perimetro = 0;
		
		perimetro = lado * 4;
		
		System.out.println("O perímetro do Quadrado é: " + perimetro);
		
	}

}
