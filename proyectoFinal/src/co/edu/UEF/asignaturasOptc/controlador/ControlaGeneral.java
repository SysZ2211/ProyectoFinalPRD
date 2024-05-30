
package co.edu.UEF.asignaturasOptc.controlador;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.UEF.asignaturasOptc.modelo.Clase;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ControlaGeneral {
	
	
	//CLASES QUEMADAS O DISPONIBLES
	int[][] arr = new int[][]{{5,1},{2,3},{2,4}};
	Clase Paradigmas = new Clase("Paradigmas de programacion", "UEF3718",5, arr);
	
	//,
	int[][] arr1 = new int[][]{{0,0},{1,0},{2,0}};
	Clase Estructuras = new Clase("Estructuras de datos", "HJD6711",7, arr1);
	
	int[][] arr3 = new int[][]{{5,1},{4,3},{5,2}};
	Clase Create = new Clase("CreateCamps 1", "FGT2614",10, arr3);
	
	int[][] arr2 = new int[][]{{5,1},{2,3}};
	Clase Elementos = new Clase("Elementos de logica computacional", "KLM3181",6, arr2);
	
	int[][] arr4 = new int[][]{{2,3}};
	Clase Calculo = new Clase("Calculo", "UEF3718",5, arr4);
	
	int[][] arr5 = new int[][]{{10,5},{5,1},{8,2}};
	Clase Paradigmas2 = new Clase("Paradigmas de programacion", "JSA2841",5, arr5);
	
	int[][] arr6 = new int[][]{{9,5},{10,5}};
	Clase Fisica = new Clase("Fisica 1", "HDA8490",10, arr6);
	
	int[][] arr7 = new int[][]{{6,1},{4,0},{5,0}};
	Clase Frances = new Clase("Frances 1", "JKS83161",5, arr7);
	Clase[] clases_disponibles= {Fisica,Frances, Calculo, Elementos, Paradigmas2,Paradigmas,
			Create, Estructuras};
	

	

	 	@FXML
	    private ScrollBar barrLista;

	    @FXML
	    private Button bttBackCreate;

	    @FXML
	    private Button bttReservar;

	   

	    @FXML
	    private ListView<?> listOpciones;
	    
	    @FXML
	    private Button bttBack;

	    @FXML
	    private Button bttDeleteD;

	    @FXML
	    private TextArea outDatos;
	    
	    @FXML
	    private Button bttBackRead;

	    @FXML
	    private TableView<?> tabHorario;
	    
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
    
    @FXML
    private ComboBox<String> comboClasses;
    
    
    
    private Parent root;
	private Stage stage;
	
	
	 ObservableList<String> list= FXCollections.observableArrayList();
	 
	public void inicializar (URL arg0, ResourceBundle arg1) {
	for (int i = 0; i < clases_disponibles.length; i++) {
	    		list.add(clases_disponibles[i].getNombre());			
			}

	    	System.out.println(list);
	    	comboClasses.setItems(list);
	    }
	
	
    @FXML
    void pressCharge(ActionEvent event) {//carga horario

    }

    @FXML
    void pressCreate(ActionEvent event) {
    	try {
        	root = FXMLLoader.load(getClass().getResource("/co/edu/UEF/asignaturasOptc/vista/pantallaCreate.fxml"));
        	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        	Scene scene = new Scene (root);
        	stage.setScene(scene);
        	stage.show();
        	comboClasses.setItems(list);
        	
        	System.out.println(list);
        	System.out.println(comboClasses);
        	list.add("a");
        	
        	comboClasses.setItems(list);
        	
        
        
        	}catch(Exception e) {
        		e.printStackTrace();
        	}

    }
    

    @FXML
    void PressDeleteMenu(ActionEvent event) {
    	try {
        	root = FXMLLoader.load(getClass().getResource("/co/edu/UEF/asignaturasOptc/vista/pantallaDelete.fxml"));
        	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        	Scene scene = new Scene (root);
        	stage.setScene(scene);
        	stage.show();
        	}catch(Exception e) {
        		e.printStackTrace();
        	}
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
    @FXML
    void pressBackRead(ActionEvent event) {
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


}
=======
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

