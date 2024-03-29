package Maps;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class Negocio implements Serializable {
	String nombre;
	String rubro;
	public ArrayList<Empleado> empleados;
	
	public Negocio() {
		createEmployeeList();
	}
	
	public Negocio(String nombre, String rubro) {
		super();
		this.nombre = nombre;
		this.rubro = rubro;
		empleados = createEmployeeList();
	}
	
	public ArrayList<Empleado> createEmployeeList() {
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		return empleados;
	}
	
	public void addEmployee(Empleado newEmployee) {
		empleados.add(newEmployee);
		
	}
	
	public void deleteEmployee(String employeeName) {
		System.out.println(employeeName);
		empleados.removeIf( employee -> employee.nombre_apellido.contains(employeeName));
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRubro() {
		return rubro;
	}

	public void setRubro(String rubro) {
		this.rubro = rubro;
	}

	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	@Override
	public String toString() {
		return "Nombre del negocio:" + nombre + String.format("%n") + "Rubro del negocio:" +
	rubro + String.format("%n") + "Empleados:" + String.format("%n") + empleados.toString();
	}

	

}
