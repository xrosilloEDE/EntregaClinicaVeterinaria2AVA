package gestion;

import java.io.Serializable;

/**
 *
 * @author xavier
 */
public class Perro extends Mascota{
    //ATRIBUTOS
    private String funcion;
    
    //CONSTRUCTOR
    /**
     * Constructor de la clase Perro que hereda de Mascota
     * @param ID
     * @param nombre
     * @param edad
     * @param raza
     * @param duenyo
     * @param peso 
     */
    public Perro(long ID, String nombre, int edad, String raza, Persona duenyo, String funcion) {
        super(ID, nombre, edad, raza, duenyo);
        this.setFuncion(funcion);
    }

	/**
	 * @return la función que tiene el perro
	 */
	public String getFuncion() {
		return funcion;
	}

	/**
	 * @param entrada de la funcion que tendrá el perro
	 */
	public void setFuncion(String funcion) {
		this.funcion = funcion;
	}

}