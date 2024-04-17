package co.edu.UEF.asignaturasOptc.servicios;



import co.edu.UEF.asignaturasOptc.modelo.Clase;



/**
 * 
 */
public class impleCRUD implements CRUD {

    public impleCRUD() {
    	horario = new Clase[6][10];
    }

    /**
     * 
     */
    private Clase[][] horario;

    /**
     * @param clase 
     * @return
     */

    public String Create(Clase clase) {
    	for (int i = 0; i < clase.getHorario().length; i++){
    		if(horario[clase.getHorario()[0][i]][clase.getHorario()[1][i]] == null)
    			horario[clase.getHorario()[0][i]][clase.getHorario()[1][i]] = clase;
    		else return "Clase elegida genera conflicto";
    	}
        return "Clase "+ clase.getCodigo()+" ha sido asignada con exito";
    }



    /**
     * @return
     */
    public Clase[][] ReadAll() {

        return horario;
    }

    /**
     * @param clase 
     * @param cod 
     * @return
     */
    public String Update(Clase clase, String cod) {
        // TODO implement here
        return "";
    }

    /**
     * @param cod 
     * @return
     */
    public Clase Delete(String cod) {
        // TODO implement here
        return null;
    }

}