/**
 * 
 */
/**
 * 
 */
module proyectoFinal {
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	requires javafx.base;
	
	opens co.edu.UEF.asignaturasOptc.vista to javafx.graphics, javafx.fxml;
	
	
	opens co.edu.UEF.asignaturasOptc.controlador to javafx.graphics, javafx.fxml;
	
}