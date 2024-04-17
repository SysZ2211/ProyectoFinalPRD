package co.edu.UEF.asignaturasOptc.modelo;

import java.util.*;

/**
 * 
 */
public class Profesor extends Usuario {

    /**
     * Default constructor
     */
    public Profesor() {
    }

    /**
     * 
     */
    private String facultad;

    /**
     * 
     */
    private int fechaContrato;

    /**
     * @param facultad 
     * @param fechaContrato
     */
    public void Profesor(String facultad, String fechaContrato) {
        // TODO implement here
    }

    /**
     * @param fechaActual 
     * @return
     */
    public abstract int calcularAntiguedad(int fechaActual);

}