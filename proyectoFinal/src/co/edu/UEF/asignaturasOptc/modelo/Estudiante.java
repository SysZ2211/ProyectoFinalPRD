package co.edu.UEF.asignaturasOptc.modelo;

import java.io.Serializable;
import java.util.*;

/**
 * Esta clase representa a un estudiante dentro del sistema.
 * Extiende la clase Usuario e incluye información adicional
 * como la fecha de inscripción y las carreras en las que está inscrito.
 * 
 * @author Juan Torres
 * @author Sam Arce
 */
public class Estudiante extends Usuario implements Serializable {


	/**
     * Fecha de inscripción del estudiante.
     */
    private int fechaInscripcion;

    /**
     * Carreras en las que está inscrito el estudiante.
     */
    private Carrera[] carreras;

    /**
     * @param fechaInscripcion 
     * @param carreas
     */
 

	@Override
	public int calcularAntiguedad(int fechaActual) {
		// TODO Auto-generated method stub
		return 0;
	}
	/**
     * Constructor de la clase Estudiante.
     * 
     * @param nombre Nombre del estudiante.
     * @param nUsuario Nombre de usuario del estudiante.
     * @param contrasegna Contraseña del estudiante.
     * @param fechaNacimiento Fecha de nacimiento del estudiante.
     * @param sexo Sexo del estudiante ('M' para masculino, 'F' para femenino).
     * @param carreras Arreglo de objetos Carrera que representan las carreras en las que está inscrito el estudiante.
     * @param fechaInscripcion Fecha de inscripción del estudiante.
     */
	public Estudiante(String nombre, String nUsuario, String contrasegna, int fechaNacimiento, char sexo,
			Carrera[] carreras, int fechaInscripcion ) {
		super(contrasegna, contrasegna, contrasegna, fechaInscripcion, sexo, carreras);
		this.fechaInscripcion = fechaInscripcion;

	}

	@Override
	public String toString() {
		return "Estudiante [fechaInscripcion=" + fechaInscripcion + ", carreras=" + Arrays.toString(carreras)
				+ ", getFechaInscripcion()=" + getFechaInscripcion() + ", getCarreras()="
				+ Arrays.toString(getCarreras()) + "]";
	}
	/**
     * Obtiene la fecha de inscripción del estudiante.
     * 
     * @return La fecha de inscripción del estudiante.
     */

	public int getFechaInscripcion() {
		return fechaInscripcion;
	}
	/**
     * Establece la fecha de inscripción del estudiante.
     * 
     * @param fechaInscripcion La fecha de inscripción del estudiante.
     */
	public void setFechaInscripcion(int fechaInscripcion) {
		this.fechaInscripcion = fechaInscripcion;
	}
	/**
     * Obtiene las carreras en las que está inscrito el estudiante.
     * 
     * @return Un arreglo de objetos Carrera que representan las carreras del estudiante.
     */
	public Carrera[] getCarreras() {
		return carreras;
	}
	/**
     * Establece las carreras en las que está inscrito el estudiante.
     * 
     * @param carreras Un arreglo de objetos Carrera que representan las carreras del estudiante.
     */
	public void setCarreras(Carrera[] carreras) {
		this.carreras = carreras;
	}

    /**
     * @param fechaActual 
     * @return
     */
   

}