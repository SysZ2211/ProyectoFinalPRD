package co.edu.UEF.asignaturasOptc.modelo;



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

	@Override
	public int calcularAntiguedad(int fechaActual) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Profesor(String facultad, int fechaContrato) {
		super();
		this.facultad = facultad;
		this.fechaContrato = fechaContrato;
	}

	@Override
	public String toString() {
		return "Profesor [facultad=" + facultad + ", fechaContrato=" + fechaContrato + ", contrasegna=" + contrasegna
				+ "]";
	}

	public String getFacultad() {
		return facultad;
	}

	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}

	public int getFechaContrato() {
		return fechaContrato;
	}

	public void setFechaContrato(int fechaContrato) {
		this.fechaContrato = fechaContrato;
	}

    /**
     * @param fechaActual 
     * @return
     */
   

}