package co.edu.UEF.asignaturasOptc.servicios;



import co.edu.UEF.asignaturasOptc.modelo.Clase;



/**
 * 
 */
public class impleCRUD implements CRUD {

    public impleCRUD() {
    	horario = new Clase[10][6];
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
    		if(horario[clase.getHorario()[i][0]][clase.getHorario()[i][1]] == null)
    			horario[clase.getHorario()[i][0]][clase.getHorario()[i][1]] = clase;
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
    	
    	for (int i = 0; i < horario.length; i++) {
			for (int j = 0; j < horario[0].length; j++) {
				if ( horario[i][j] != null && horario[i][j].getCodigo().equals(cod) == true) {
					Delete(cod);
					Create(clase);
					return "La clase"+ cod + "ha sido actualizada correctamente.";
				}
			}
		}
        return "La clase que desea actualizar no existe.";
    }

    /**
     * @param cod 
     * @return
     */
    public Clase Delete(String cod) {
        int[][] arr = new int[1][1];
        Clase deleted = null;
    	for (int i = 0; i < horario.length; i++) {
			for (int j = 0; j < horario.length; j++) {
				if (horario[i][j] != null && horario[i][j].getCodigo().equals(cod)) {
					arr = horario[i][j].getHorario();
					deleted = horario[i][j];
				}	
			}
		}
    	for (int i = 0; i < arr.length; i++) {
    		horario[arr[0][i]][arr[1][i]] = null;
		}
        return deleted;
    }   
}