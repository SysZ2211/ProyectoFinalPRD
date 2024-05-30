package co.edu.UEF.asignaturasOptc.controlador;

import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ResourceBundle;

import co.edu.UEF.asignaturasOptc.modelo.Clase;
import co.edu.UEF.asignaturasOptc.servicios.ImpleCRUD;
import co.edu.UEF.asignaturasOptc.servicios.ImpleOpeArchivo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class FormaDelete implements Initializable{
	
	ImpleCRUD delete = new ImpleCRUD();
    @FXML
    private Button bttBack;

    @FXML
    private Button bttDeleteD;
    
    @FXML
    private ComboBox<String> comboChoice;
    
    @FXML
    private TextArea outDatos;
    
    private Parent root;
  	private Stage stage;
  	
  	private String loc = " ";
    private String generic = "Generic";
    ImpleOpeArchivo scr = new ImpleOpeArchivo();

    @FXML
    void pressBackD(ActionEvent event) {
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

        cr.start(delete);
    }

    @FXML
    void pressDelete(ActionEvent event) {
    	delete.setHorario(scr.deserializar(loc, generic));
    	
    	try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
    	
    	scr.serializar(delete.getHorario(), loc, generic);
    }
    
    void pressChoice(ActionEvent event) {
    	
    }
    private String[] opc = creaOpciones(delete);
    
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		comboChoice.getItems().addAll(opc);
		comboChoice.setOnAction(this::pressChoice);
		
	}
	/*void start (ImpleCRUD crud) {
		this.delete = crud;
	}*/
	
	private String[] creaOpciones (ImpleCRUD crud) {
		ArrayList<String> opc = new ArrayList<String>();
		Clase[][] horario = crud.getHorario();
		for (int i = 0; i < horario.length; i++) {
			for (int j = 0; j < horario[0].length; j++) {
				if (horario[i][j] != null && opc.contains(horario[i][j].getNombre()) == false) {
					opc.add(horario[i][j].getNombre());
				}
			}
		}
		String[] opciones = opc.toArray(new String[opc.size()]);
		return opciones;
	}
}
