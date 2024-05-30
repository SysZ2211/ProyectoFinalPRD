package co.edu.UEF.asignaturasOptc.controlador;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ControlaGeneral {

    @FXML
    private Text IdBig;

    @FXML
    private Text IdSmall;

    @FXML
    private Text Time;

    @FXML
    private Text TitleScreen;

    @FXML
    private ToggleGroup ViewMode;

    @FXML
    private Button bttCharge;

    @FXML
    private Button bttCreate;

    @FXML
    private Button bttDeleteMenu;

    @FXML
    private Button bttReadAll;

    @FXML
    private Button bttReboot;

    @FXML
    private Button bttSave;

    @FXML
    private RadioButton rdDay;

    @FXML
    private RadioButton rdNigth;
    private Parent root;
   	private Stage stage;

    @FXML
    void PressDeleteMenu(ActionEvent event) {
    	try {
        	root = FXMLLoader.load(getClass().getResource("/co/edu/poli/proyectoE/vista/pantallaDelete.fxml"));
        	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        	Scene scene = new Scene (root);
        	stage.setScene(scene);
        	stage.show();
        	}catch(Exception e) {
        		e.printStackTrace();
        	}
    }
    @FXML
    void pressCharge(ActionEvent event) {

    }

    @FXML
    void pressCreate(ActionEvent event) {

    }

    @FXML
    void pressRdDay(ActionEvent event) {
    	Scene scene = ((Node) event.getSource()).getScene();
        scene.getStylesheets().clear();
        scene.getStylesheets().add(getClass().getResource("/co/edu/UEF/asignaturasOptc/vista/day.css").toExternalForm());
    }

    @FXML
    void pressRdNigth(ActionEvent event) {
    	Scene scene = ((Node) event.getSource()).getScene();
        scene.getStylesheets().clear();
        scene.getStylesheets().add(getClass().getResource("/co/edu/UEF/asignaturasOptc/vista/night.css").toExternalForm());
    }
    @FXML
    void pressReadAll(ActionEvent event) {
    	try {
        	root = FXMLLoader.load(getClass().getResource("/co/edu/UEF/asignaturasOptc/vista/pantallaReadAll.fxml"));
        	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        	Scene scene = new Scene (root);
        	stage.setScene(scene);
        	stage.show();
        	}catch(Exception e) {
        		e.printStackTrace();
        	}
    }

    @FXML
    void pressReboot(ActionEvent event) {

    }

    @FXML
    void pressSave(ActionEvent event) {

    }

}
