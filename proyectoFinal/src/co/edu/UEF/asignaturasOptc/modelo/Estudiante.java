package co.edu.UEF.asignaturasOptc.modelo;

import java.io.Serializable;
import java.util.*;

/**
 * 
 */
public class Estudiante extends Usuario implements Serializable {


    /**
     * 
     */
    private int fechaInscripcion;

    /**
     * 
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

	public int getFechaInscripcion() {
		return fechaInscripcion;
	}

	public void setFechaInscripcion(int fechaInscripcion) {
		this.fechaInscripcion = fechaInscripcion;
	}

	public Carrera[] getCarreras() {
		return carreras;
	}

	public void setCarreras(Carrera[] carreras) {
		this.carreras = carreras;
	}

    /**
     * @param fechaActual 
     * @return
     */
   

}