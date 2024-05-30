package co.edu.UEF.asignaturasOptc.controlador;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class FormaDelete {

    @FXML
    private Button bttBack;

    @FXML
    private Button bttDeleteD;

    @FXML
    private TextArea outDatos;
    
    private Parent root;
  	private Stage stage;
  	

    @FXML
    void pressBackD(ActionEvent event) {
    	try {
        	root = FXMLLoader.load(getClass().getResource("/co/edu/UEF/asignaturasOptc/vista/pantallaInicio.fxml"));
        	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        	Scene scene = new Scene (root);
        	stage.setScene(scene);
        	stage.show();
        	}catch(Exception e) {
        		e.printStackTrace();
        	}
    }

    @FXML
    void pressDelete(ActionEvent event) {

    }

}
