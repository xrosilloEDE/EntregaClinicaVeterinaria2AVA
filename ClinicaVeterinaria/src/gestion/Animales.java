package gestion;

import java.io.Serializable;

public class Animal implements InterfazAnimal{

	private long ID;
	protected int edad;
	protected String raza;

	public Animal() {
		super();
	}

	public int getEdad() {
	    return edad;
	}

	public void setEdad(int edad) {
	    this.edad = edad;
	}

	public String getRaza() {
	    return raza;
	}

	public void setRaza(String raza) {
	    this.raza = raza;
	}

	private long getID() {
		return ID;
	}

	protected void setID(long iD) {
		this.ID = iD;
	}

	@Override
	public boolean repira() {
		//aqu� vendr�a el c�digo para la respiraci�n
		return true;
	}

	@Override
	public boolean come(float cantidad) {
		//aqu� vendr�a el c�digo para ver lo que comen
		return true;
	}

}