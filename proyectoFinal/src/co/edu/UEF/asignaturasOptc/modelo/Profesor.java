package co.edu.UEF.asignaturasOptc.modelo;

import java.io.Serializable;

/**
 * Esta clase representa a un profesor en el sistema. Extiende la clase Usuario y 
 * proporciona métodos para acceder y modificar información específica del profesor, 
 * como la facultad a la que pertenece y la fecha de contratación.
 * 
 * @author Juan Torres
 * @author Sam Arce
 */
public class Profesor extends Usuario implements Serializable{

    /**
     * Facultad a la que pertenece el profesor.
     */
    private String facultad;

    /**
     * Fecha de contratación del profesor.
     */
    private int fechaContrato;

    /**
     * Constructor de la clase Profesor.
     * 
     * @param nombre Nombre del profesor.
     * @param nUsuario Nombre de usuario del profesor.
     * @param contrasegna Contraseña del profesor.
     * @param fechaNacimiento Fecha de nacimiento del profesor.
     * @param sexo Sexo del profesor.
     * @param carrera Carrera(s) que el profesor imparte.
     * @param facultad Facultad a la que pertenece el profesor.
     * @param fechaContrato Fecha de contratación del profesor.
     */
    public Profesor(String nombre, String nUsuario, String contrasegna, int fechaNacimiento, char sexo,
            Carrera[] carrera, String facultad, int fechaContrato) {
        super(nombre, nUsuario, contrasegna, fechaNacimiento, sexo, carrera);
        this.facultad = facultad;
        this.fechaContrato = fechaContrato;
    }

    /**
     * Método para obtener la facultad a la que pertenece el profesor.
     * 
     * @return La facultad del profesor.
     */
    public String getFacultad() {
        return facultad;
    }

    /**
     * Método para establecer la facultad a la que pertenece el profesor.
     * 
     * @param facultad La nueva facultad del profesor.
     */
    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    /**
     * Método para obtener la fecha de contratación del profesor.
     * 
     * @return La fecha de contratación del profesor.
     */
    public int getFechaContrato() {
        return fechaContrato;
    }

    /**
     * Método para establecer la fecha de contratación del profesor.
     * 
     * @param fechaContrato La nueva fecha de contratación del profesor.
     */
    public void setFechaContrato(int fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

    /**
     * Método para calcular la antigüedad del profesor.
     * 
     * @param fechaActual La fecha actual para calcular la antigüedad.
     * @return La antigüedad del profesor en años.
     */
    @Override
    public int calcularAntiguedad(int fechaActual) {
        // Implementación pendiente
        return 0;
    }

    /**
     * Método para representar la información del profesor en forma de cadena.
     * 
     * @return Representación en cadena del profesor.
     */
    @Override
    public String toString() {
        return "Profesor [facultad=" + facultad + ", fechaContrato=" + fechaContrato + ", contrasegna=" + contrasegna + "]";
    }
}
