package co.edu.UEF.asignaturasOptc.vista;
import co.edu.UEF.asignaturasOptc.modelo.Carrera;
import co.edu.UEF.asignaturasOptc.modelo.Clase;
import co.edu.UEF.asignaturasOptc.modelo.Estudiante;
import co.edu.UEF.asignaturasOptc.modelo.Usuario;
import co.edu.UEF.asignaturasOptc.servicios.impleCRUD;


/**
 * 
 */
public class Principal {
    
    public static void main(String[] args) {
    	int[][] arr = new int[][]{{1,3,4},{5,2,2}};
    	
    	Clase Paradigmas = new Clase("Paradigmas de programacion", "UEF3718",5, arr);
    
    	
    	
    	
    	Clase[] clases1 = {Paradigmas};
    	
    	
    	Carrera Ing_Sistemas = new Carrera("Ingenieria de Sistemas", 8, 150, clases1);
    	Carrera[] carreras = new Carrera[] {Ing_Sistemas};
    	
    	Usuario unal = new Estudiante("J Mario Valencia", "JMValencia", "pepitoescalvo", 5111942, 'M', carreras, 2072022);
       
    	impleCRUD Hunal = new impleCRUD();
    	System.out.println(Hunal.Create(Paradigmas));
    	for (int i = 0; i < Hunal.ReadAll().length; i++) {
			for (int j = 0; j < Hunal.ReadAll()[0].length; j++) {
				System.out.print(Hunal.ReadAll()[i][j]);
			}
			System.out.println();
		}
    }

}