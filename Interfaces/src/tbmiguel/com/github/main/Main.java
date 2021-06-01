package tbmiguel.com.github.main;

import tbmiguel.com.github.classes.Quadrado;

public class Main {

	public static void main(String[] args) {
		
		Quadrado quadrado = new Quadrado();

		quadrado.setLado(5);
		quadrado.getLado();
		quadrado.calculaArea();
		quadrado.calculaPerimetro();

	}

}
