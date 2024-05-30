<<<<<<< HEAD
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
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class FormaReadAll implements Initializable{

	ObservableList<String> list = FXCollections.observableArrayList();
    @FXML
    private Button bttBackRead;
    
    @FXML
    private TextArea outHorario;

    @FXML
    private TableView<String> tabHorario = new TableView<String>();
    
    private Parent root;
  	private Stage stage;
  	
  	private ImpleCRUD clases = new ImpleCRUD();
  	private String loc = " ";
    private String generic = "Generic";
    ImpleOpeArchivo scr = new ImpleOpeArchivo();
    

    @FXML
    private TableColumn<String, String> C1;

    @FXML
    private TableColumn<String, String> C2;

    @FXML
    private TableColumn<String, String> C3;

    @FXML
    private TableColumn<String, String> C4;

    @FXML
    private TableColumn<String, String> C5;

    @FXML
    private TableColumn<String, String> C6;
    
    @FXML
    private TableColumn<String, String> C7;

  	
  	public String[][] ReadAll() {
  		Clase[][] horario = scr.deserializar(loc, generic);
    	String[][] jaja = new String[12][7];
    	
    	jaja[0][0]= " Horario ";
    	jaja[0][1]="   Lunes";
    	jaja[0][2]=" Martes";
    	jaja[0][3]=" Miercoles";
    	jaja[0][4]=" Jueves";
    	jaja[0][5]=" Viernes";
    	jaja[0][6]=" Sabado";
    	
    	jaja[1][0]="7AM - 8AM  ";
    	jaja[2][0]="8AM - 9AM  ";
    	jaja[3][0]="9AM - 10AM ";
    	jaja[4][0]="10AM - 11AM";
    	jaja[5][0]="11AM - 12PM";
    	jaja[6][0]="12PM - 1PM ";
    	jaja[7][0]="1PM - 2PM  ";
    	jaja[8][0]="2PM - 3PM  ";
    	jaja[9][0]="3PM - 4PM  ";
    	jaja[10][0]="4PM - 5PM  ";
    	jaja[11][0]="5PM - 6PM  ";
    
    	for (int i = 0; i < jaja.length; i++) {
			for (int j = 0; j < jaja[0].length; j++) {
				if ( i!= 0 && j != 0 ) {
					if (horario[i-1][j-1]==null) {
						 jaja[i][j]= "|libre|";
					}
					if(horario[i-1][j-1]!=null)
					jaja[i][j]="|"+ horario[i-1][j-1].getNombre()+"|";
				}
			}
		}
    	return jaja;
    }

    @FXML
    void pressBackRead(ActionEvent event) {
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
    /*void start (ImpleCRUD crud) {
    	this.clases = crud;
    }*/

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		String messege = "";
		for (int i = 0; i < ReadAll().length; i++) {
			for (int j = 0; j < ReadAll()[0].length; j++) {
				messege += ReadAll()[i][j];
			}
			messege += "\n";
		}
		outHorario.setText(messege);
		System.out.println(list);
	}
}
=======
package co.edu.UEF.asignaturasOptc.controlador;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class FormaReadAll {

    @FXML
    private Button bttBackRead;

    @FXML
    private TableView<?> tabHorario;
    
    private Parent root;
  	private Stage stage;
  	

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
>>>>>>> branch 'master' of https://github.com/SysZ2211/ProyectoFinalPRD
