package co.edu.UEF.asignaturasOptc.modelo;

import java.io.Serializable;
import java.util.Arrays;

/**
 * Esta clase abstracta representa a un usuario en el sistema. Proporciona métodos 
 * para acceder y modificar información básica del usuario, como nombre, nombre de usuario, 
 * contraseña, fecha de nacimiento, sexo y carrera(s) asociada(s).
 * 
 * @author Juan Torres
 * @author Samuel
 */
public abstract class Usuario implements Serializable {

    /**
     * Nombre del usuario.
     */
    private String nombre;

    /**
     * Nombre de usuario.
     */
    private String nUsuario;

    /**
     * Contraseña del usuario.
     */
    protected String contrasegna;

    /**
     * Fecha de nacimiento del usuario.
     */
    private int fechaNacimiento;

    /**
     * Sexo del usuario.
     */
    private char sexo;

    /**
     * Carrera(s) asociada(s) al usuario.
     */
    private Carrera[] carrera;

    /**
     * Método para calcular la edad del usuario.
     * 
     * @param fechaActual La fecha actual para calcular la edad.
     * @return La edad del usuario.
     */
    public int calcularEdad(int fechaActual) {
        // Implementación pendiente
        return 0;
    }

    /**
     * Método abstracto para calcular la antigüedad del usuario. Debe ser implementado por
     * las subclases concretas.
     * 
     * @param fechaActual La fecha actual para calcular la antigüedad.
     * @return La antigüedad del usuario.
     */
    public abstract int calcularAntiguedad(int fechaActual);

    /**
     * Método para obtener el nombre del usuario.
     * 
     * @return El nombre del usuario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para establecer el nombre del usuario.
     * 
     * @param nombre El nuevo nombre del usuario.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener el nombre de usuario.
     * 
     * @return El nombre de usuario.
     */
    public String getnUsuario() {
        return nUsuario;
    }

    /**
     * Método para establecer el nombre de usuario.
     * 
     * @param nUsuario El nuevo nombre de usuario.
     */
    public void setnUsuario(String nUsuario) {
        this.nUsuario = nUsuario;
    }

    /**
     * Método para obtener la contraseña del usuario.
     * 
     * @return La contraseña del usuario.
     */
    public String getContrasegna() {
        return contrasegna;
    }

    /**
     * Método para establecer la contraseña del usuario.
     * 
     * @param contrasegna La nueva contraseña del usuario.
     */
    public void setContrasegna(String contrasegna) {
        this.contrasegna = contrasegna;
    }

    /**
     * Método para obtener la fecha de nacimiento del usuario.
     * 
     * @return La fecha de nacimiento del usuario.
     */
    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Método para establecer la fecha de nacimiento del usuario.
     * 
     * @param fechaNacimiento La nueva fecha de nacimiento del usuario.
     */
    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Método para obtener el sexo del usuario.
     * 
     * @return El sexo del usuario.
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * Método para establecer el sexo del usuario.
     * 
     * @param sexo El nuevo sexo del usuario.
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    /**
     * Método para obtener la(s) carrera(s) asociada(s) al usuario.
     * 
     * @return La(s) carrera(s) asociada(s) al usuario.
     */
    public Carrera[] getCarrera() {
        return carrera;
    }

    /**
     * Método para establecer la(s) carrera(s) asociada(s) al usuario.
     * 
     * @param carrera La(s) nueva(s) carrera(s) asociada(s) al usuario.
     */
    public void setCarrera(Carrera[] carrera) {
        this.carrera = carrera;
    }

    /**
     * Método para representar la información del usuario en forma de cadena.
     * 
     * @return Representación en cadena del usuario.
     */
    @Override
    public String toString() {
        return "Usuario [nombre=" + nombre + ", nUsuario=" + nUsuario + ", contrasegna=" + contrasegna
                + ", fechaNacimiento=" + fechaNacimiento + ", sexo=" + sexo + ", carrera=" + Arrays.toString(carrera)
                + "]";
    }

    /**
     * Constructor de la clase Usuario.
     * 
     * @param nombre Nombre del usuario.
     * @param nUsuario Nombre de usuario.
     * @param contrasegna Contraseña del usuario.
     * @param fechaNacimiento Fecha de nacimiento del usuario.
     * @param sexo Sexo del usuario.
     * @param carrera Carrera(s) asociada(s) al usuario.
     */
    public Usuario(String nombre, String nUsuario, String contrasegna, int fechaNacimiento, char sexo,
            Carrera[] carrera) {
        this.nombre = nombre;
        this.nUsuario = nUsuario;
        this.contrasegna = contrasegna;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.carrera = carrera;
    }
}
