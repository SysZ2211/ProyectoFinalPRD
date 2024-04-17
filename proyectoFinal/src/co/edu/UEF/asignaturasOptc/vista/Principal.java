package co.edu.UEF.asignaturasOptc.vista;
import java.util.Arrays;
import java.util.Scanner;

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
    //PARA EDITAR EL MENU (ESTO ESTA PENDIENTE), HAY QUE EDITAR LAS OPCIONES EN EL STRING + IMPLEMENTAER LOS METODOS DENTRO DEL MENU
    	
System.out.println("Elija una opción:"+"\n"+ "1. Pedir Objeto"+"\n"+"2. Read"+"\n"+"3. Update"+"\n"+"4. Delete"+"\n"+"5. Guardar Archivo"+"\n"+"6. Cargar Archivo"+"\n"+"7. Salir");
    	
    	Scanner in = new Scanner(System.in);
    	int opcion;
    	opcion = Integer.parseInt(in.nextLine());
    	
    	do{
    		
    		if (opcion == 1) {//CREATE
    			
    			
    			System.out.println(Hunal.Create(Paradigmas));
    			
    		}
    		if (opcion == 2) {//READ ALL
    			
    			for (int i = 0; i < Hunal.ReadAll().length; i++) {
    				for (int j = 0; j < Hunal.ReadAll()[0].length; j++) {
    					System.out.print(Hunal.ReadAll()[i][j]+ " ");
    				}
    				System.out.println();
    			}
    			
    		}
    		if (opcion == 3) {
    			
    			
    			
    		}
    		if (opcion == 4) {
    			
    			
    		}
    		if (opcion == 5) {
    			
    			
    		}
    		if (opcion == 6) {
    			
    		}
   
    		System.out.println("Elija una opción:"+"\n"+ "1. Pedir Objeto"+"\n"+"2. Read"+"\n"+"3. Update"+"\n"+"4. Delete"+"\n"+"5. Guardar Archivo"+"\n"+"6. Cargar Archivo"+"\n"+"7. Salir");
        	
        	
        	opcion = Integer.parseInt(in.nextLine()); 
    	}while(opcion != 7);
    	System.out.println("Gracias");
    	
    	
    	in.close();
    	
    	
    	
    	
    	

	}

    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }

