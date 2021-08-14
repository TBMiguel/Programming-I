package application;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import classes.calcular;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class MainController {
	
	public Label title;
	public TextField name;
	public TextField age;
	public TextField genero;
	public TextField weight;
	public TextField height;
	public Button btnClick;
	public Button btnClick2;
	
	public void clear() {
		name.setText("");
		height.setText("");
		weight.setText("");
		age.setText("");
		genero.setText("");	
	}
	
	public void cliclou() {
		
		if (weight.getText().isEmpty() || name.getText().isEmpty() || height.getText().isEmpty())  {
			
			Alert alerta = new Alert(AlertType.ERROR);
			alerta.setTitle("Erro!!");
			alerta.setContentText("Erro!!! Informações em branco!!");
			alerta.show();

		} else {
			
			calcular calc = new calcular();
			calc.setPeso(Float.parseFloat(weight.getText()));
			calc.setAltura(Float.parseFloat(height.getText()));
			
			NumberFormat formatter = new DecimalFormat("0.0");
			
			Alert alerta = new Alert(AlertType.INFORMATION);
			alerta.setTitle("IMC");
			alerta.setContentText("Nome: " + name.getText() +
					"\n" + "Idade: " + age.getText() + " Anos" + 
					"\n" + "Genero: " + genero.getText() + 
					"\n" + "Peso: " + weight.getText() + " KG" +
					"\n" + "Altura: " + height.getText() + " m" +
					"\n" + "Seu IMC é: " + formatter.format(calc.calc()) + " kg/m²" +
					"\n\n" + "Resultado: " + calc.stats());
			alerta.show();
		}

	}
	
}
