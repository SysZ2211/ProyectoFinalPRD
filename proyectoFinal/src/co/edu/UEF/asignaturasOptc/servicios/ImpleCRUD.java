package co.edu.UEF.asignaturasOptc.servicios;





import co.edu.UEF.asignaturasOptc.modelo.Clase;



/**
 * 
 */
public class ImpleCRUD implements CRUD {

    public ImpleCRUD() {
    	horario = new Clase[10][6];
    }

    /**
     * 
     */
    private Clase[][] horario;

    public Clase[][] getHorario() {
		return horario;
	}



	public void setHorario(Clase[][] horario) {
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
    public String traductorHorario (int[][] horario){
    	String traduccion = "";
    	for (int i = 0; i < horario.length; i++){
    		for (int j = 0; j < horario[0].length; j++){
    			if (horario[i][0] == 0) {
    				traduccion += "Lunes:";
    				traduccion += 700+(100*(horario[i][j])) + " - "+ 700+100+(100*(horario[i][j]));
    			}
    			if (horario[i][0] == 1) {
    				traduccion += "Martes:";
    				traduccion += 700+(100*(horario[i][j])) + " - "+ 700+100+(100*(horario[i][j]));
    			}
    			if (horario[i][0] == 2) {
    				traduccion += "Miercoles:";
    				traduccion += 700+(100*(horario[i][j])) + " - "+ 700+100+(100*(horario[i][j]));
    			}
    			if (horario[i][0] == 3) {
    				traduccion += "Jueves:";
    				traduccion += 700+(100*(horario[i][j])) + " - "+ 700+100+(100*(horario[i][j]));
    			}
    			if (horario[i][0] == 4) {
    				traduccion += "Viernes:";
    				traduccion += 700+(100*(horario[i][j])) + " - "+ 700+100+(100*(horario[i][j]));
    			}
    			if (horario[i][0] == 5) {
    				traduccion += "Sabado:";
    				traduccion += 700+(100*(horario[i][j])) + " - "+ 700+100+(100*(horario[i][j]));
    			}
    				
    		}
    	}
    	return traduccion;
    }
}