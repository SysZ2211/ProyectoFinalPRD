package co.edu.UEF.asignaturasOptc.modelo;

import java.util.Arrays;

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
    
    /**
     * @param fechaActual 
     * @return
     */
    public abstract int calcularAntiguedad(int fechaActual);

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getnUsuario() {
		return nUsuario;
	}

	public void setnUsuario(String nUsuario) {
		this.nUsuario = nUsuario;
	}

	public String getContrasegna() {
		return contrasegna;
	}

	public void setContrasegna(String contrasegna) {
		this.contrasegna = contrasegna;
	}

	public int getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(int fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public Carrera[] getCarrera() {
		return carrera;
	}

	public void setCarrera(Carrera[] carrera) {
		this.carrera = carrera;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", nUsuario=" + nUsuario + ", contrasegna=" + contrasegna
				+ ", fechaNacimiento=" + fechaNacimiento + ", sexo=" + sexo + ", carrera=" + Arrays.toString(carrera)
				+ "]";
	}

	public Usuario(String nombre, String nUsuario, String contrasegna, int fechaNacimiento, char sexo,
			Carrera[] carrera) {
		super();
		this.nombre = nombre;
		this.nUsuario = nUsuario;
		this.contrasegna = contrasegna;
		this.fechaNacimiento = fechaNacimiento;
		this.sexo = sexo;
		this.carrera = carrera;
	}

}