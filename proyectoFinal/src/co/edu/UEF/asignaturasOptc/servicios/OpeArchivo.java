package co.edu.UEF.asignaturasOptc.servicios;

import java.util.*;

/**
 * 
 */
public interface OpeArchivo {

    /**
     * @param horario 
     * @param path 
     * @param name String
     */
    public void serializar(Horario horario, String path, void name String);

    /**
     * @param path 
     * @param name 
     * @return
     */
    public Horario[][] deserializar(String path, String name);

}