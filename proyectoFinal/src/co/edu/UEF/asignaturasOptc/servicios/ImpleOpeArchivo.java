package co.edu.UEF.asignaturasOptc.servicios;



import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import co.edu.UEF.asignaturasOptc.modelo.Clase;


/**
 * 
 */
public class ImpleOpeArchivo implements OpeArchivo {

    /**
     * Default constructor
     */
    public ImpleOpeArchivo() {
    }


    public Clase[][] deserializar(String path, String name) {
    	Clase[][] a= null;
		
		try {
			FileInputStream fis = new FileInputStream(path + name);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			a = (Clase[][]) ois.readObject();
			
			ois.close();
			fis.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		catch (ClassNotFoundException c) {
			System.out.println("Class not found");
			c.printStackTrace();
		}
	
		return a;
	}

    

	@Override
	public void serializar(Clase[][] horario, String path, String name) {
		try {
			FileOutputStream fos = new FileOutputStream(path + name);
			ObjectOutputStream oos = new ObjectOutputStream(fos); 
			oos.writeObject(horario);
			oos.close();
			fos.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
		
	}

}