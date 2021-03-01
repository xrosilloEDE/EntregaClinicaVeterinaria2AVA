package gestion;

/**
 *
 * @author xavier
 */
public class Cosita extends Mascota {
    //ATRIBUTOS

    private float gradosalvaje;

    //CONSTRUCTOR
    /**
     * Constructor de la clase Gato que hereda de Mascota
     * @param ID
     * @param nombre
     * @param edad
     * @param raza
     * @param duenyo
     * @param gradosalvaje
     */
    public Cosita(long ID, String nombre, int edad, String raza, Persona duenyo, float gradosalvaje) {
        super(ID, nombre, edad, raza, duenyo);
        this.gradosalvaje = gradosalvaje;
    }

    //M�TODOS SETTER & GETTER - PARA HACER (P.E. UTILIZANDO LA REFACTORIZACI�N DEL ATRIBUTO)

}
