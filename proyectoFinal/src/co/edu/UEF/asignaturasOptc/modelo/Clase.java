package co.edu.UEF.asignaturasOptc.modelo;

import java.util.Arrays;

/**
 * 
 */
public class Clase {

    /**
     * Default constructor
     */
    public Clase() {
    }

    /**
     * 
     */
    private String nombre;

    /**
     * 
     */
    protected String codigo;

    /**
     * 
     */
    private Carrera[] carreras;

    /**
     * 
     */
    private int costo;

    /**
     * 
     */
    private int[][] horario;

	public Clase(String nombre, String codigo, Carrera[] carreras, int costo, int[][] horario) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.carreras = carreras;
		this.costo = costo;
		this.horario = horario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Carrera[] getCarreras() {
		return carreras;
	}

	public void setCarreras(Carrera[] carreras) {
		this.carreras = carreras;
	}

	public int getCosto() {
		return costo;
	}

	public void setCosto(int costo) {
		this.costo = costo;
	}

	public int[][] getHorario() {
		return horario;
	}

	public void setHorario(int[][] horario) {
		this.horario = horario;
	}

	@Override
	public String toString() {
		return "Clase [nombre=" + nombre + ", codigo=" + codigo + ", carreras=" + Arrays.toString(carreras) + ", costo="
				+ costo + ", horario=" + Arrays.toString(horario) + "]";
	}

    /**
     * @param nombre 
     * @param codigo 
     * @param carreras 
     * @param costo 
     * @param horario
     */
    
}