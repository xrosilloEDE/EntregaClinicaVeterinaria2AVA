package gestion;

import java.io.Serializable;

public class Persona implements Serializable{
	private static final long serialVersionUID = 1L;
    private String nombre;
    private String apellidos;
    private String dni;
    private int edad;

    public Persona(String nombre, String apellidos, String dni, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int dameAnyoNacimiento(int anyoactual) {
        return (anyoactual - this.getEdad());
    }
    
    @Override
    public String toString() {
        return("Nombre: " + nombre + " Apellidos: " + apellidos + " DNI: " + dni + " Edad: " + edad);        
    }
    
}