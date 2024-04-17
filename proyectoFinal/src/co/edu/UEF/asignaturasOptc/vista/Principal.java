package co.edu.UEF.asignaturasOptc.vista;
import co.edu.UEF.asignaturasOptc.modelo.Carrera;
import co.edu.UEF.asignaturasOptc.modelo.Clase;


/**
 * 
 */
public class Principal {
    
    public static void main(String args) {
    	int[][] arr = new int[][]{{1,3,4},{5,2,2}};
    	
    	Clase Paradigmas = new Clase("Paradigmas de programacion", "UEF3718",5, arr);
    
    	
    	
    	
    	Clase[] clases1 = {Paradigmas};
    	
    	
    	Carrera Ing_Sistemas = new Carrera("Ingenieria de Sistemas", 8, 150, clases1);
    	
       
    }

}