package co.edu.UEF.asignaturasOptc.modelo;

import java.io.Serializable;
import java.util.*;

/**
 * 
 */
public class Carrera implements Serializable{

    /**
     * Default constructor
     */
    public Carrera() {
    }

    /**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private int duracionEst;

    
    private int creditos;

    /**
     * 
     */
    private Clase[] clases;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDuracionEst() {
		return duracionEst;
	}

	public void setDuracionEst(int duracionEst) {
		this.duracionEst = duracionEst;
	}

	public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	public Clase[] getClases() {
		return clases;
	}

	public void setClases(Clase[] clases) {
		this.clases = clases;
	}

	@Override
	public String toString() {
		return "Carrera [nombre=" + nombre + ", duracionEst=" + duracionEst + ", creditos=" + creditos + ", clases="
				+ Arrays.toString(clases) + "]";
	}

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