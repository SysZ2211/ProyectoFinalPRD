package co.edu.UEF.asignaturasOptc.modelo;

import java.util.*;

/**
 * 
 */
public abstract class Usuario {

    /**
     * Default constructor
     */
    public Usuario() {
    }

    /**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private String nUsuario;

    /**
     * 
     */
    protected String contrasegna;

    /**
     * 
     */
    private int fechaNacimiento;

    /**
     * 
     */
    private char sexo;

    /**
     * 
     */
    private Carrera[] carrera;

    /**
     * @param fechaActual 
     * @return
     */
    public int calcularEdad(int fechaActual) {
        // TODO implement here
        return 0;
    }

    /**
     * @param nombre 
     * @param nUsuario 
     * @param contrasegna 
     * @param sexo
     */
    public void Usuario(String nombre, String nUsuario, String contrasegna, char sexo) {
        // TODO implement here
    }

    /**
     * @param fechaActual 
     * @return
     */
    public abstract int calcularAntiguedad(int fechaActual);

}