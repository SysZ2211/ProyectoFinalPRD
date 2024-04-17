package co.edu.UEF.asignaturasOptc.servicios;



import co.edu.UEF.asignaturasOptc.modelo.Clase;

/**
 * 
 */
public interface OpeArchivo {

  
    public void serializar(Clase horario, String path, String name);

    /**
     * @param path 
     * @param name 
     * @return
     */
    public Clase[][] deserializar(String path, String name);

}