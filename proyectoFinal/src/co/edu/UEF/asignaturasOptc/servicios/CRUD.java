package co.edu.UEF.asignaturasOptc.servicios;

import java.util.*;

/**
 * 
 */
public interface CRUD {

    /**
     * @param clase 
     * @return
     */
    public String Create(Clase clase);

    /**
     * @return
     */
    public Clase[][] ReadAll();

    /**
     * @param clase 
     * @param cod 
     * @return
     */
    public String Update(Clase clase, String cod);

    /**
     * @param cod 
     * @return
     */
    public Clase Delete(String cod);

}