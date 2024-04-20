package co.edu.UEF.asignaturasOptc.servicios;
import co.edu.UEF.asignaturasOptc.modelo.Clase;

/**
 * 
 */
public interface CRUD {

        public String Create(Clase clase);

    /**
     * @return
     */
    //pls funciona
    public Clase[][] ReadAll();

    /**
     * @param clase 
     * @param cod 
     * @return
a     */
    public String Update(Clase clase, String cod);

    /**
     * @param cod 
     * @return
     */
    public Clase Delete(String cod);

}