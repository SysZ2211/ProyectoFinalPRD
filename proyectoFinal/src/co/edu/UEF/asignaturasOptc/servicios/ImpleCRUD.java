package co.edu.UEF.asignaturasOptc.servicios;





import co.edu.UEF.asignaturasOptc.modelo.Clase;



/**
 * 
 */
public class ImpleCRUD implements CRUD {

    public ImpleCRUD() {
    	horario = new String[11][7];
    	horario[0][0]= " ";
    }
    
   	
    
    private String[][] horario;

    public String[][] getHorario() {
		return horario;
	}



	public void setHorario(String[][] horario) {
		this.horario = horario;
	}



	/**
     * @param clase 
     * @return
     */

    public String Create(Clase clase) {
    	
    	for (int i = 0; i < horario.length; i++) {
			for (int j = 0; j < horario[0].length; j++) {
				if (horario[i][j]!=null && horario[i][j].getNombre()==clase.getNombre()&&horario[i][j].getCodigo()!=clase.getCodigo())
					return "La clase "+ clase.getNombre()+ " Ya está reservada.";
				
			}
		}
    	
    	for (int i = 0; i < clase.getHorario().length; i++){
    		
    		if(horario[clase.getHorario()[i][0]][clase.getHorario()[i][1]] == null)
    			horario[clase.getHorario()[i][0]][clase.getHorario()[i][1]] = clase;
    		else return "Clase elegida genera conflicto";
    	}
        return "La clase "+ clase.getNombre()+" ha sido asignada con éxito"+"("+clase.getCodigo()+")";
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




