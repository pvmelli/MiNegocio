package Maps;

import java.io.Serializable;

public class Empleado implements Serializable {
	
	//private static int counter = 0;
	//final int Id;
	String nombre_apellido;
	String sector;
	Categoria categoria;
	double sueldo;	
	
	enum Categoria {
		Trainee,
		Junior,
		SemiSenior,
		Senior
	}
	
	/*public Empleado() {
		Id = counter++;
		
	}*/

	public Empleado(String nombre_apellido, String sector, int categoria, double sueldo) {
		super();
		//Id = counter++;
		this.nombre_apellido = nombre_apellido;
		this.sector = sector;
		
		switch(categoria) {
		case 1:
			this.categoria = Categoria.Trainee;
			break;
		case 2:
			this.categoria = Categoria.Junior;
			break;
		case 3:
			this.categoria = Categoria.SemiSenior;
			break;
		case 4:
			this.categoria = Categoria.Senior;
			break;
		}
		
		this.sueldo = sueldo;
	}
	
	public Empleado(int id, String nombre_apellido, String sector, String categoria, double sueldo) {
		super();
		//this.Id = id;
		this.nombre_apellido = nombre_apellido;
		this.sector = sector;
		
		switch(categoria) {
		case "Trainee":
			this.categoria = Categoria.Trainee;
			break;
		case "Junior":
			this.categoria = Categoria.Junior;
			break;
		case "SemiSenior":
			this.categoria = Categoria.SemiSenior;
			break;
		case "Senior":
			this.categoria = Categoria.Senior;
			break;
		}
		
		this.sueldo = sueldo;
	}

	public String getNombre_apellido() {
		return nombre_apellido;
	}

	public void setNombre_apellido(String nombre_apellido) {
		this.nombre_apellido = nombre_apellido;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return String.format("%n") + nombre_apellido + "   " + sector + "   "
				+ categoria + "   Sueldo:" + sueldo;
	}
	
	
	
	

}
