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
    	
    	
    	int[][] arr1 = new int[][]{{0,0},{1,0},{2,0}};
    	Clase Estructuras = new Clase("Estructuras de datos", "HJD6711",7, arr1);
    	
    	int[][] arr3 = new int[][]{{5,1},{4,3},{5,2}};
    	Clase Create = new Clase("CreateCamps 1", "FGT2614",10, arr3);
    	
    	int[][] arr2 = new int[][]{{5,1},{2,3}};
    	Clase Elementos = new Clase("Elementos de lógica computacional", "KLM3181",6, arr2);
    	
    	int[][] arr4 = new int[][]{{2,3}};
    	Clase Calculo = new Clase("Calculo", "UEF3718",5, arr4);
    	
    	
    
    	String rojo = "\033[31m";
    	
    	
    	
    	Clase[] clases1 = {Paradigmas,Estructuras, Create,Calculo,Elementos};
    	
    	
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
    			
    			System.out.println("Estas son las clases disponibles con sus horarios:"+"\n");
    			for (int i = 0; i < clases1.length; i++) {
					System.out.println("Nombre: "+clases1[i].getNombre() +" Código: "+ clases1[i].getCodigo()+ " Costo: "+clases1[i].getCosto()/*horario traducido*/);
				}
    			
    			
    			
    			
    			
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
    		if (opcion == 3) {//UPDATE
    			
    			
    			
    		}
    		if (opcion == 4) {//DELETE
    			System.out.println(rojo+"CUIDADO. ESTA ACCIÓN ES IRREVERSIBLE.");
    			System.out.println("Escoja el horario que va a eliminar. ");
    			
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
   
    		System.out.println("Elija una opción:"+"\n"+ "1. Pedir Objeto"+"\n"+"2. Read"+"\n"+"3. Update"+"\n"+"4. Delete"+"\n"+"5. Guardar Archivo"+"\n"+"6. Cargar Archivo"+"\n"+"7. Salir");
        	
        	
        	opcion = Integer.parseInt(in.nextLine()); 
    	}while(opcion != 7);
    	System.out.println("Gracias");
    	
    	
    	in.close();
    	
    	
    	
    	
    	

	}

    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }

