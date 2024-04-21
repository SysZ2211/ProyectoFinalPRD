package co.edu.UEF.asignaturasOptc.vista;
import java.util.Arrays;

import java.util.Scanner;

import co.edu.UEF.asignaturasOptc.modelo.Carrera;
import co.edu.UEF.asignaturasOptc.modelo.Clase;
import co.edu.UEF.asignaturasOptc.modelo.Estudiante;
import co.edu.UEF.asignaturasOptc.modelo.Usuario;
import co.edu.UEF.asignaturasOptc.servicios.ImpleCRUD;
import co.edu.UEF.asignaturasOptc.servicios.ImpleOpeArchivo;




public class Principal {
    
    public static void main(String[] args) {
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
    	

    	
    	
    	
    
    	String rojo = "\033[31m";
    	
    	
    	
    	Clase[] clases1 = {Paradigmas,Estructuras, Create,Calculo,Elementos,Paradigmas2,Fisica,Frances};
    	
    	
    	Carrera Ing_Sistemas = new Carrera("Ingenieria de Sistemas", 8, 150, clases1);
    	Carrera[] carreras = new Carrera[] {Ing_Sistemas};
    	
    	Usuario unal = new Estudiante("J Mario Valencia", "JMValencia", "pepitoescalvo", 5111942, 'M', carreras, 2072022);
    	ImpleCRUD Hunal = new ImpleCRUD();
    	ImpleOpeArchivo SaveFiles = new ImpleOpeArchivo();
    	
    //PARA EDITAR EL MENU (ESTO ESTA PENDIENTE), HAY QUE EDITAR LAS OPCIONES EN EL STRING + IMPLEMENTAER LOS METODOS DENTRO DEL MENU
    	
System.out.println("Elija una opción:"+"\n"+ "1. Asignar Clase"+"\n"+"2. Ver Horario Actual"+"\n"+"3. Realizar Cambios"+"\n"+"4. Eliminar Horario"+"\n"+"5. Guardar Horario en PC"+"\n"+"6. Cargar Horario"+"\n"+"7. Salir");
    	
    	Scanner in = new Scanner(System.in);
    	int opcion;
    	opcion = Integer.parseInt(in.nextLine());
    	
    	do{
    		
    		if (opcion == 1) {//CREATE
    			System.out.println("Para escoger una clase, escriba el Nombre");
    			System.out.println("Estas son las clases disponibles con sus horarios:"+"\n");
    			for (int i = 0; i < clases1.length; i++) {
					System.out.println("Nombre: "+clases1[i].getNombre() +" Código: "+ clases1[i].getCodigo()+ " Costo: "+clases1[i].getCosto()+ " Horario: "+ clases1[i].traductorHorario(clases1[i].getHorario()));
				}
    			String selection = in.nextLine();
    			selection = selection.toLowerCase();
    			int count =0;
    			for (int i = 0; i < clases1.length; i++) {
    				if(selection.equals(clases1[i].getNombre().toLowerCase())) {	
						System.out.println(Hunal.Create(clases1[i]));
						count++;
					}
				}
    			if(count==0)
    				System.out.println("Inserte una clase válida.");
    			
    		}
    		if (opcion == 2) {//READ ALL
    			
    			for (int i = 0; i < Hunal.ReadAll().length; i++) {
    				
    				for (int j = 0; j < Hunal.ReadAll()[0].length; j++) {
    					
    					System.out.print(Hunal.ReadAll()[i][j]+ " ");
    				}
    				System.out.println();
    			}
    			
    		}
    		if (opcion == 3) {//UPDATE
    	
    			System.out.println("Escoja la clase que quiere actualizar");
    			
    			for (int i = 0; i < Hunal.ReadAll().length; i++) {
    				for (int j = 0; j < Hunal.ReadAll()[0].length; j++) {
    					
    					System.out.print(Hunal.ReadAll()[i][j]+ " ");
    				}
    				System.out.println();
    			}
    			
    			
    			String selection= in.nextLine();
    			selection = selection.toLowerCase();
    			int count =0;
    			//CODIGO DE LA CLASE
    			Clase updated = null;
    			for (int i = 0; i < Hunal.ReadAll().length; i++) {
					for (int j = 0; j < Hunal.ReadAll()[0].length; j++) {
						if (Hunal.getHorario()[i][j] != null && selection.equals(Hunal.getHorario()[i][j].getNombre().toLowerCase()) == true) {
							updated = Hunal.getHorario()[i][j];
							break;
						}
					}
				}
    			
    			System.out.println("Escoja la clase que reemplazará la clase:");
    			for (int i = 0; i < clases1.length; i++) {
					System.out.println("Nombre: "+clases1[i].getNombre() +" Código: "+ clases1[i].getCodigo()+ " Costo: "+clases1[i].getCosto()+ " Horario: "+ clases1[i].traductorHorario(clases1[i].getHorario()));
				}
    			String selection2 = in.nextLine();
    			selection2 = selection2.toLowerCase();
    			//EL REEMPLAZO .CLASE
    			
    			for (int i = 0; i < clases1.length; i++) {
    				if(selection2.equals(clases1[i].getNombre().toLowerCase())) {	
						
    					System.out.println(Hunal.Update(updated, clases1[i].getCodigo()));
						
						count++;
					}
				}
    			if(count==0)
    				System.out.println("Inserte una clase válida.");
    			
    			
    		}
    		if (opcion == 4) {//Delete
    			System.out.println(rojo+"CUIDADO. ESTA ACCIÓN ES IRREVERSIBLE."+"\u001B[0m");
    			System.out.println("Escoja la clase que va a eliminar");
    			
    			String selection= in.nextLine();
    			selection = selection.toLowerCase();
    			int count =0;
    			
    			for (int i = 0; i < clases1.length; i++) {
    				if(selection.equals(clases1[i].getNombre().toLowerCase())) {
    					Clase deleted = clases1[i];
    					
						System.out.println(Hunal.Delete(deleted.getCodigo()));
						count++;
					}
				}
    			if(count==0)
    				System.out.println("Inserte una clase válida.");
    			
    			//,
    		}
    		if (opcion == 5) {//SERIALIZAR
    			System.out.println("Ingrese la ubicacion de guardado");
    			String ubi = in.nextLine();
    			
    			System.out.println("Ingrese el nombre del archivo");
    			String name = in.nextLine();
    			
    			SaveFiles.serializar(Hunal.getHorario(), ubi, name);
    			
    		}
    		if (opcion == 6) {//DESERIALIZAR
    				
    			System.out.println("Ingrese la ubicacion de guardado");
    			String ubi = in.nextLine();
    			
    			System.out.println("Ingrese el nombre del archivo");
    			String name = in.nextLine();
    			System.out.println(Arrays.toString(SaveFiles.deserializar(ubi, name)));
    			
    			
    			Hunal.setHorario(SaveFiles.deserializar(ubi, name));
    		}
   
    		System.out.println("Elija una opción:"+"\n"+ "1. Asignar Clase"+"\n"+"2. Ver Horario Actual"+"\n"+"3. Realizar Cambios"+"\n"+"4. Eliminar Horario"+"\n"+"5. Guardar Horario en PC"+"\n"+"6. Cargar Horario"+"\n"+"7. Salir");
        	
        	
        	opcion = Integer.parseInt(in.nextLine()); 
    	}while(opcion != 7);
    	System.out.println("Gracias");
    	
    	
    	in.close();
 

	}

    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }

