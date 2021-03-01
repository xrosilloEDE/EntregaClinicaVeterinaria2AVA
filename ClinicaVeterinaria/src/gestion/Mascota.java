package gestion;

import java.io.Serializable;

public class Mascota implements Serializable{

	private long ID;
    private String nombre;
    private int edad;
    private String raza;
    private Persona duenyo;

    public Mascota(long ID, String nombre, int edad, String raza, Persona duenyo) {
    	this.setID(ID);
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.duenyo = duenyo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public Persona getDuenyo() {
        return duenyo;
    }

    public void setDuenyo(Persona duenyo) {
        this.duenyo = duenyo;
    }

    @Override
    public String toString() {
        return ("Nombre: " + nombre + " Edad: " + edad + " Raza: " + raza + " Dueño: " + duenyo.toString());
    }

	private long getID() {
		return ID;
	}

	private void setID(long iD) {
		this.ID = iD;
	}
}