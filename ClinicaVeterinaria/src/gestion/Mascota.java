package gestion;

import java.io.Serializable;

public class Mascota extends Animales implements Serializable {

	private String nombre;
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
}