package co.edu.UEF.asignaturasOptc.vista;
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
  //CLASES QUEMADAS O DISPONIBLES
    	int[][] arr = new int[][]{{5,1},{2,3},{2,4}};
    	Clase Paradigmas = new Clase("Paradigmas de programacion", "UEF3718",5, arr);
    	
    	
    	int[][] arr1 = new int[][]{{0,0},{1,0},{2,0}};
    	Clase Estructuras = new Clase("Estructuras de datos", "HJD6711",7, arr1);
    	
    	int[][] arr3 = new int[][]{{5,1},{4,3},{5,2}};
    	Clase Create = new Clase("CreateCamps 1", "FGT2614",10, arr3);
    	
    	int[][] arr2 = new int[][]{{5,1},{2,3}};
    	Clase Elementos = new Clase("Elementos de lógica computacional", "KLM3181",6, arr2);
    	
    	int[][] arr4 = new int[][]{{2,3}};
    	Clase Calculo = new Clase("Calculo", "UEF3718",5, arr4);
    	
    	
    	
    
    	String rojo = "\033[31m";
    	
    	
    	
    	Clase[] clases1 = {Paradigmas,Estructuras};
    	
    	
    	Carrera Ing_Sistemas = new Carrera("Ingenieria de Sistemas", 8, 150, clases1);
    	Carrera[] carreras = new Carrera[] {Ing_Sistemas};
    	
    	Usuario unal = new Estudiante("J Mario Valencia", "JMValencia", "pepitoescalvo", 5111942, 'M', carreras, 2072022);
    	impleCRUD Hunal = new impleCRUD();
    //PARA EDITAR EL MENU (ESTO ESTA PENDIENTE), HAY QUE EDITAR LAS OPCIONES EN EL STRING + IMPLEMENTAER LOS METODOS DENTRO DEL MENU
    	
System.out.println("Elija una opción:"+"\n"+ "1. Asignar Clase"+"\n"+"2. Read"+"\n"+"3. Update"+"\n"+"4. Delete"+"\n"+"5. Guardar Archivo"+"\n"+"6. Cargar Archivo"+"\n"+"7. Salir");
    	
    	Scanner in = new Scanner(System.in);
    	int opcion;
    	opcion = Integer.parseInt(in.nextLine());
    	
    	do{
    		
    		if (opcion == 1) {//CREATE
    			
    			System.out.println("Estas son las clases disponibles con sus horarios:");
    			
    			
    			
    			
    			
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

