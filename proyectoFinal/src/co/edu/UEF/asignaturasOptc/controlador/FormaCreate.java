package co.edu.UEF.asignaturasOptc.controlador;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollBar;
import javafx.stage.Stage;

public class FormaCreate {

    @FXML
    private ScrollBar barrLista;

    @FXML
    private Button bttBackCreate;

    @FXML
    private Button bttReservar;

    @FXML
    private ComboBox<?> comboClasses;

    @FXML
    private ListView<?> listOpciones;
    
    private Parent root;
   	private Stage stage;

    @FXML
    void choiceClasses(ActionEvent event) {

    }

    @FXML
    void pressBackCreate(ActionEvent event) {
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
    void pressReservar(ActionEvent event) {

    }

}
