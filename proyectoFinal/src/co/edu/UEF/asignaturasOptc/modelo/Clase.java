package co.edu.UEF.asignaturasOptc.modelo;

import java.io.Serializable;
import java.util.Arrays;

/**
 * @author Juan Torres
 * @author Samuel Arce
 * Esta clase representa una clase o asignatura dentro de una carrera universitaria.
 * Contiene información sobre el nombre de la clase, su código, costo y horario.
 */
public class Clase implements Serializable{

    /**
     * Default constructor
     */
    

	  /**
     * Código identificador de la clase.
     */
    private String nombre;

    /**
     * Código identificador de la clase.
     */
    protected String codigo;

    /**
     * 
     */


    /**
     * Costo de la clase.
     */
    private int costo;

    /**
     * Horario de la clase. Es una matriz donde cada fila representa un día de la semana
     * y cada columna representa un bloque horario.
     * Los valores de la matriz representan la disponibilidad de la clase en ese bloque horario.
     */
    private int[][] horario;
    /**
     * Constructor de la clase Clase.
     * 
     * @param nombre El nombre de la clase.
     * @param codigo El código identificador de la clase.
     * @param costo El costo de la clase.
     * @param horario El horario de la clase.
     */
	public Clase(String nombre, String codigo, int costo, int[][] horario) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.costo = costo;
		this.horario = horario;
	}
	 /**
     * Obtiene el nombre de la clase.
     * 
     * @return El nombre de la clase.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la clase.
     * 
     * @param nombre El nombre de la clase.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el código identificador de la clase.
     * 
     * @return El código identificador de la clase.
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Establece el código identificador de la clase.
     * 
     * @param codigo El código identificador de la clase.
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Obtiene el costo de la clase.
     * 
     * @return El costo de la clase.
     */
    public int getCosto() {
        return costo;
    }

    /**
     * Establece el costo de la clase.
     * 
     * @param costo El costo de la clase.
     */
    public void setCosto(int costo) {
        this.costo = costo;
    }

    /**
     * Obtiene el horario de la clase.
     * 
     * @return El horario de la clase.
     */
    public int[][] getHorario() {
        return horario;
    }

    /**
     * Establece el horario de la clase.
     * 
     * @param horario El horario de la clase.
     */
    public void setHorario(int[][] horario) {
        this.horario = horario;
    }

	@Override
	public String toString() {
		return "Clase [nombre=" + nombre + ", codigo=" + codigo + ", costo="
				+ costo + ", horario=" + Arrays.toString(horario) + "]";
		
		 /**
	     * Traduce el horario de la clase en un formato legible.
	     * 
	     * @param horario El horario de la clase a traducir.
	     * @return Una cadena que representa el horario de la clase en un formato legible.
	     */
	}
    public String traductorHorario (int[][] horario){
    	String traduccion = "";
    	for (int i = 0; i < horario.length; i++){
    		for (int j = 0; j < horario[0].length; j++){
    			if (horario[i][0] == 0) {
    				traduccion += "Lunes:";
    				int x = 700+(100*(horario[i][j]));
    				int y = 700+100+(100*(horario[i][j]));
    				traduccion += x + " - "+ y;
    			}
    			if (horario[i][0] == 1) {
    				traduccion += "Martes:";
    				int x = 700+(100*(horario[i][j]));
    				int y = 700+100+(100*(horario[i][j]));
    				traduccion += x + " - "+ y;
    			}
    			if (horario[i][0] == 2) {
    				traduccion += "Miercoles:";
    				int x = 700+(100*(horario[i][j]));
    				int y = 700+100+(100*(horario[i][j]));
    				traduccion += x + " - "+ y;
    			}
    			if (horario[i][0] == 3) {
    				traduccion += "Juevez:";
    				int x = 700+(100*(horario[i][j]));
    				int y = 700+100+(100*(horario[i][j]));
    				traduccion += x + " - "+ y;
    			}
    			if (horario[i][0] == 4) {
    				traduccion += "Viernes:";
    				int x = 700+(100*(horario[i][j]));
    				int y = 700+100+(100*(horario[i][j]));
    				traduccion += x + " - "+ y;
    			}
    			if (horario[i][0] == 5) {
    				traduccion += "Sabado:";
    				int x = 700+(100*(horario[i][j]));
    				int y = 700+100+(100*(horario[i][j]));
    				traduccion += x + " - "+ y;
    			}
    				
    		}
    	}
    	return traduccion;
    }

    /**
     * @param nombre 
     * @param codigo 
     * @param carreras 
     * @param costo 
     * @param horario
     */
    
}