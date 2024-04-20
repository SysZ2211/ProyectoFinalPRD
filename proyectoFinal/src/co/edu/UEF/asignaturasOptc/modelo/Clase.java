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


    /**
     * 
     */
    private int costo;

    /**
     * 
     */
    private int[][] horario;

	public Clase(String nombre, String codigo, int costo, int[][] horario) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
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
		return "Clase [nombre=" + nombre + ", codigo=" + codigo + ", costo="
				+ costo + ", horario=" + Arrays.toString(horario) + "]";
	}
    public String traductorHorario (int[][] horario){
    	String traduccion = "";
    	for (int i = 0; i < horario.length; i++){
    		for (int j = 0; j < horario[0].length; j++){
    			if (horario[i][0] == 0) {
    				traduccion += "Lunes:";
    				int x = 700+(100*(horario[i][j]));
    				int y = 700+100+(100*(horario[i][j]));
    				traduccion += x + " - "+ y;
    			}
    			if (horario[i][0] == 1) {
    				traduccion += "Martes:";
    				int x = 700+(100*(horario[i][j]));
    				int y = 700+100+(100*(horario[i][j]));
    				traduccion += x + " - "+ y;
    			}
    			if (horario[i][0] == 2) {
    				traduccion += "Miercoles:";
    				int x = 700+(100*(horario[i][j]));
    				int y = 700+100+(100*(horario[i][j]));
    				traduccion += x + " - "+ y;
    			}
    			if (horario[i][0] == 3) {
    				traduccion += "Juevez:";
    				int x = 700+(100*(horario[i][j]));
    				int y = 700+100+(100*(horario[i][j]));
    				traduccion += x + " - "+ y;
    			}
    			if (horario[i][0] == 4) {
    				traduccion += "Viernes:";
    				int x = 700+(100*(horario[i][j]));
    				int y = 700+100+(100*(horario[i][j]));
    				traduccion += x + " - "+ y;
    			}
    			if (horario[i][0] == 5) {
    				traduccion += "Sabado:";
    				int x = 700+(100*(horario[i][j]));
    				int y = 700+100+(100*(horario[i][j]));
    				traduccion += x + " - "+ y;
    			}
    				
    		}
    	}
    	return traduccion;
    }

    /**
     * @param nombre 
     * @param codigo 
     * @param carreras 
     * @param costo 
     * @param horario
     */
    
}