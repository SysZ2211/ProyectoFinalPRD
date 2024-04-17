package co.edu.UEF.asignaturasOptc.modelo;

import java.util.*;

/**
 * 
 */
public class Estudiante extends Usuario {

    /**
     * Default constructor
     */
    public Estudiante() {
    }

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
    public void Estudiante(int fechaInscripcion, Carrera[] carreas) {
        // TODO implement here
    }

    /**
     * @param fechaActual 
     * @return
     */
    public abstract int calcularAntiguedad(int fechaActual);

}