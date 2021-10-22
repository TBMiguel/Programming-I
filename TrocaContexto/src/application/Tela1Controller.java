package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Tela1Controller implements Initializable{
	private Stage stage;
	private Scene scene;
	private Parent root; 
	public Button btnTrocaTela;
	public TextField inpText;
	
	public void vaiParaTela2(ActionEvent event) {
		try {
			root  = FXMLLoader.load(getClass().getResource("Tela2.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root, 400, 400);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		inpText.setText(Main.campoTexto);		
	}

	
}
