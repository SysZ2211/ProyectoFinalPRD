package co.edu.UEF.asignaturasOptc.modelo;

import java.io.Serializable;
import java.util.*;

/**
 * Esta clase representa una carrera universitaria.
 * Contiene información sobre el nombre de la carrera, su duración estimada,
 * el número de créditos y las clases que la componen.
 * 
 * @author Juan Torres
 * @author Samuel Arce
 */
public class Carrera implements Serializable{

    /**
     * Default constructor
     */
    public Carrera() {
    }

    /**
     * Nombre de la carrera.
     */
    private String nombre;

    /**
     * Nombre de la carrera.
     */
    private int duracionEst;

    /**
     * Número total de créditos necesarios para completar la carrera.
     */
    private int creditos;
    /**
     * Arreglo de objetos Clase que representan las clases que componen la carrera.
     */
    private Clase[] clases;
    /**
     * Obtiene el nombre de la carrera.
     * 
     * @return El nombre de la carrera.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la carrera.
     * 
     * @param nombre El nombre de la carrera.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la duración estimada de la carrera.
     * 
     * @return La duración estimada de la carrera en años.
     */
    public int getDuracionEst() {
        return duracionEst;
    }

    /**
     * Establece la duración estimada de la carrera.
     * 
     * @param duracionEst La duración estimada de la carrera en años.
     */
    public void setDuracionEst(int duracionEst) {
        this.duracionEst = duracionEst;
    }

    /**
     * Obtiene el número total de créditos necesarios para completar la carrera.
     * 
     * @return El número total de créditos.
     */
    public int getCreditos() {
        return creditos;
    }

    /**
     * Establece el número total de créditos necesarios para completar la carrera.
     * 
     * @param creditos El número total de créditos.
     */
    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    /**
     * Obtiene las clases que componen la carrera.
     * 
     * @return Un arreglo de objetos Clase que representan las clases de la carrera.
     */
    public Clase[] getClases() {
        return clases;
    }

    /**
     * Establece las clases que componen la carrera.
     * 
     * @param clases Un arreglo de objetos Clase que representan las clases de la carrera.
     */
    public void setClases(Clase[] clases) {
        this.clases = clases;
    }
	@Override
	public String toString() {
		return "Carrera [nombre=" + nombre + ", duracionEst=" + duracionEst + ", creditos=" + creditos + ", clases="
				+ Arrays.toString(clases) + "]";
	}
	/**
     * Constructor de la clase Carrera que inicializa todos los atributos.
     * 
     * @param nombre El nombre de la carrera.
     * @param duracionEst La duración estimada de la carrera en años.
     * @param creditos El número total de créditos necesarios para completar la carrera.
     * @param clases Un arreglo de objetos Clase que representan las clases de la carrera.
     */
	public Carrera(String nombre, int duracionEst, int creditos, Clase[] clases) {
		super();
		this.nombre = nombre;
		this.duracionEst = duracionEst;
		this.creditos = creditos;
		this.clases = clases;
	}

    /**
     * @param nombre 
     * @param duracionEst 
     * @param creditos 
     * @param clases
     */
}