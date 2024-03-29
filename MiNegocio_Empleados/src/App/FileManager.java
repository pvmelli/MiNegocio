package App;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import Maps.Empleado;
import Maps.Negocio;

final class FileManager implements Serializable {
	
	static File businessFile = new File("EmpleadosMiNegocio.txt");
	
	public static boolean searchForBusinessFile() {
		
		try {
			boolean wasFileCreated = businessFile.createNewFile();
			return wasFileCreated;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		
		
	}
	
	public static void writeBusinessFile(Negocio myBusiness) {
		writeBusinessSer(myBusiness);
		FileWriter myWriter;
		try {
			myWriter = new FileWriter("EmpleadosMiNegocio.txt");
		      myWriter.write("Nombre del negocio: " + myBusiness.getNombre());
		      myWriter.write(String.format("%n"));
		      myWriter.write("Rubro del negocio: " + myBusiness.getRubro());
		      myWriter.write(String.format("%n"));
		      myWriter.write("Lista de empleados: ");
		      myWriter.write(String.format("%n"));
		      
				Iterator<Empleado> it = myBusiness.empleados.iterator();
				
				while(it.hasNext()) {
					myWriter.write(it.next().toString());
					}
		      myWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	private static void writeBusinessSer(Negocio myBusiness) {
		
		FileOutputStream fileOut;
		try {
			fileOut = new FileOutputStream("BusinessInfo.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(myBusiness);
			out.close();
			fileOut.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static Negocio readBusinessSer() {

		try {
			Negocio myBusiness;
			
			FileInputStream fileIn;
			fileIn = new FileInputStream("BusinessInfo.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			myBusiness = (Negocio) in.readObject();
			in.close();
			fileIn.close();
			//System.out.println(myBusiness);
			
			return myBusiness;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Negocio();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Negocio();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Negocio();
		}
		
	}
	
	

}
