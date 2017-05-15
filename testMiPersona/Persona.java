package testMiPersona;

import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;

public class Persona implements Serializable {
	/**
	 * Uso de la clase Serializable, perteneciente a la clase java.io
	 */

	private String nombrecitotoguapo;
	
	private String apellidos;
	
	private Date fechaNacimiento;	
	
	public Persona(String n, String a, int anno, int mes, int dia){
		
		nombrecitotoguapo=n;
		
		apellidos=a;
		
		GregorianCalendar calendario=new GregorianCalendar(anno, mes-1,dia);
		
		fechaNacimiento=calendario.getTime();
		
	}
		
	
	public String getnombrecitotoguapo() {
		return nombrecitotoguapo;
	}

	public String getApellidos() {
		return apellidos;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	
	
	public String toString(){
		
		return "El nombrecitotoguapo y sus Apellidos es " + nombrecitotoguapo + " " + apellidos + ", su fecha de Nacimiento " + fechaNacimiento;
		
	}

	
}
