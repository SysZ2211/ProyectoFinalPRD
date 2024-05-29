package co.edu.UEF.asignaturasOptc.vista;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

	public class Main2 extends Application {
		/**
		 * Muestra la ventana de la aplicacion
		 */
		@Override
		
		public void start(Stage primaryStage) {
			try {
	            System.out.println(getClass().getName());
	            AnchorPane root  = (AnchorPane) FXMLLoader.load(getClass().getResource("/co/edu/UEF/asignaturasOptc/vista/pantallaInicio.fxml"));
	            Scene scene = new Scene(root);
	            /*String css = this.getClass().getResource("application.css").toExternalForm();
	            scene.getStylesheets().add(css);*/
	            primaryStage.setScene(scene);
	            primaryStage.show();
	        } catch(Exception e) {
	            e.printStackTrace();
	        }
		}

		public static void main(String[] args) {
			launch(args);
		}//xd
	}
