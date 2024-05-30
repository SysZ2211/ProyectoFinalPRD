package co.edu.UEF.asignaturasOptc.controlador;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.UEF.asignaturasOptc.modelo.Clase;
import co.edu.UEF.asignaturasOptc.servicios.ImpleCRUD;
import co.edu.UEF.asignaturasOptc.servicios.ImpleOpeArchivo;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollBar;
import javafx.stage.Stage;

public class FormaCreate implements Initializable { 

    // CLASES QUEMADAS O DISPONIBLES
    int[][] arr = new int[][] { { 5, 1 }, { 2, 3 }, { 2, 4 } };
    Clase Paradigmas = new Clase("Paradigmas de programacion", "UEF3718", 5, arr);

    // ,
    int[][] arr1 = new int[][] { { 0, 0 }, { 1, 0 }, { 2, 0 } };
    Clase Estructuras = new Clase("Estructuras de datos", "HJD6711", 7, arr1);

    int[][] arr3 = new int[][] { { 5, 1 }, { 4, 3 }, { 5, 2 } };
    Clase Create = new Clase("CreateCamps 1", "FGT2614", 10, arr3);

    int[][] arr2 = new int[][] { { 5, 1 }, { 2, 3 } };
    Clase Elementos = new Clase("Elementos de logica computacional", "KLM3181", 6, arr2);

    int[][] arr4 = new int[][] { { 2, 3 } };
    Clase Calculo = new Clase("Calculo", "UEF3718", 5, arr4);

    int[][] arr5 = new int[][] { { 10, 5 }, { 5, 1 }, { 8, 2 } };
    Clase Paradigmas2 = new Clase("Paradigmas de programacion", "JSA2841", 5, arr5);

    int[][] arr6 = new int[][] { { 9, 5 }, { 10, 5 } };
    Clase Fisica = new Clase("Fisica 1", "HDA8490", 10, arr6);

    int[][] arr7 = new int[][] { { 6, 1 }, { 4, 0 }, { 5, 0 } };
    Clase Frances = new Clase("Frances 1", "JKS83161", 5, arr7);
    Clase[] clases_disponibles = { Fisica, Frances, Calculo, Elementos, Paradigmas2, Paradigmas, Create,
            Estructuras };
    ImpleCRUD clases = new ImpleCRUD();
    private Parent root;
    private Stage stage;

    private String loc = " ";
    private String generic = "Generic";
    ImpleOpeArchivo scr = new ImpleOpeArchivo();
    @FXML
    private ScrollBar barrLista;

    @FXML
    private Button bttBackCreate;

    @FXML
    private Button bttReservar;

    @FXML
    private ChoiceBox<String> ChoiceCreate;

    @FXML
    private ListView<String> listOpciones;

    ObservableList<String> list = FXCollections.observableArrayList();
    ObservableList<String> listViewItems = FXCollections.observableArrayList();

    private Clase selectedClase;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
      
        for (Clase clase : clases_disponibles) {
            list.add(clase.getNombre());
            listViewItems.add(clase.getNombre() + " - " + clase.getCodigo() + " - " + clase.getCosto() + " creditos");
        }
        ChoiceCreate.setItems(list);
        listOpciones.setItems(listViewItems);

      
        ChoiceCreate.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            for (Clase clase : clases_disponibles) {
                if (clase.getNombre().equals(newValue)) {
                    selectedClase = clase;
                    break;
                }
            }
        });
    }

    @FXML
    void choiceClasses(ActionEvent event) {
  
    }

    @FXML
    void pressBackCreate(ActionEvent event) {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/UEF/asignaturasOptc/vista/pantallaInicio.fxml"));
        try {
            root = loader.load();
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene (root);
            stage.setScene(scene);
            stage.show();
            }catch(Exception e) {
                e.printStackTrace();
            }
        ControlaGeneral cr = loader.getController();

        cr.start(clases);
    }

    @FXML
    void pressReservar(ActionEvent event) {
    	   if (selectedClase != null) {
    	        for (int i = 0; i < clases_disponibles.length; i++) {
    	            if (selectedClase.equals(clases_disponibles[i])) {
    	            	clases.setHorario(scr.deserializar(loc, generic));
    	                String result = clases.Create(clases_disponibles[i]);
    	                scr.serializar(clases.getHorario(), loc, generic);
    	                Alert alert = new Alert(AlertType.INFORMATION);
    	                alert.setTitle("Estado de la reserva");
    	                alert.setHeaderText(null);
    	                alert.setContentText(result);
    	                alert.showAndWait();
    	                return; 
    	            }
    	        }
    	       
    	    } else {
    	     
    	        Alert alert = new Alert(AlertType.WARNING);
    	        alert.setTitle("Alerta");
    	        alert.setHeaderText(null);
    	        alert.setContentText("Selecciona la clase");
    	        alert.showAndWait();
    	    }
    	   
    	}
   /* void start (ImpleCRUD crud) {
    	this.clases = crud;
    }*/
}
