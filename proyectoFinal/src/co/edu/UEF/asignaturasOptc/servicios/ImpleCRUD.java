package co.edu.UEF.asignaturasOptc.servicios;





import co.edu.UEF.asignaturasOptc.modelo.Clase;



/**
 * 
 */
public class ImpleCRUD implements CRUD {

    public ImpleCRUD() {
    	horario = new Clase[11][6];
    	
    }
    
   	
    
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
        return "La clase "+ clase.getNombre()+" ha sido asignada con éxito"+" CODIGO :("+clase.getCodigo()+")";
    }



    /**
     * @return
     */
    public String[][] ReadAll() {
    	String[][] jaja = new String[12][7];
    	
    	jaja[0][0]= " Horario ";
    	jaja[0][1]="   Lunes";
    	jaja[0][2]=" Martes";
    	jaja[0][3]=" Miercoles";
    	jaja[0][4]=" Jueves";
    	jaja[0][5]=" Viernes";
    	jaja[0][6]=" Sabado";
    	
    	jaja[1][0]="7AM - 8AM  ";
    	jaja[2][0]="8AM - 9AM  ";
    	jaja[3][0]="9AM - 10AM ";
    	jaja[4][0]="10AM - 11AM";
    	jaja[5][0]="11AM - 12PM";
    	jaja[6][0]="12PM - 1PM ";
    	jaja[7][0]="1PM - 2PM  ";
    	jaja[8][0]="2PM - 3PM  ";
    	jaja[9][0]="3PM - 4PM  ";
    	jaja[10][0]="4PM - 5PM  ";
    	jaja[11][0]="5PM - 6PM  ";
    
    	for (int i = 0; i < jaja.length; i++) {
			for (int j = 0; j < jaja[0].length; j++) {
				if ( i!= 0 && j != 0 ) {
					if (horario[i-1][j-1]==null) {
						 jaja[i][j]= "|libre|";
					}
					if(horario[i-1][j-1]!=null)
					jaja[i][j]="|"+ horario[i-1][j-1].getNombre()+"|";
				}
			}
		}
    	return jaja;
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




