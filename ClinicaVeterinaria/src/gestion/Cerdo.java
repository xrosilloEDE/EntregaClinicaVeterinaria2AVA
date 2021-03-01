package gestion;

import java.io.Serializable;

/**
 *
 * @author xavier
 */
public class Cerdo extends Mascota{
    //ATRIBUTOS
    public float peso;
    
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
        this.peso = peso;
    }

}
