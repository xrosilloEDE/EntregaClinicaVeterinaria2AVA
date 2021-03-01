package gestion;

import java.io.Serializable;

/**
 *
 * @author xavier
 */
public class Cerdo extends Mascota{
    //ATRIBUTOS
    private float peso;
    
    //CONSTRUCTOR
    /**
     * Constructor de la clase Cerdo que hereda de Mascota
     * @param ID
     * @param nombre
     * @param edad
     * @param raza
     * @param duenyo
     * @param peso 
     */
    public Cerdo(long ID, String nombre, int edad, String raza, Persona duenyo, float peso) {
        super(ID, nombre, edad, raza, duenyo);
        this.setPeso(peso);
    }

	/**
	 * @return the peso
	 */
	public float getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(float peso) {
		this.peso = peso;
	}

}
