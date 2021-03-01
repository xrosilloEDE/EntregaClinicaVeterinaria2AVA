/**
 * 
 */
package clinicaveterinaria;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;

import gestion.*;

/**
 * @author Xavier
 *
 */
public class Ficheros {
	
	private RandomAccessFile archivo = null;
	private ByteArrayOutputStream escribir = null;
	private ObjectOutputStream salida = null;
	private byte array[] = null;
    private ByteArrayInputStream leer = null;
    private ObjectInputStream entrada = null;
	private String rutaClientes;
	
    public void guardarFicheroClientes(ArrayList<Persona> clientes) {
    	try {
            rutaClientes = "Clientes.dat";
			archivo = new RandomAccessFile(rutaClientes, "rw");             
            // Ponemos el puntero al final del archivo
            archivo.seek(archivo.length());
             
            // Serializamos el objeto Persona
            // Lo convertimos en una secuencia de bytes.
            escribir= new ByteArrayOutputStream();
            salida = new ObjectOutputStream(escribir);
            for (Persona cli : clientes) {
            	salida.writeObject(cli.toString());             
            	// Cerramos el objeto.
            	salida.close();
             
            	// obtenemos los bytes serializados
            	array = escribir.toByteArray();
             
            	// Escribimos los bytes en el archivo.
            	archivo.write(array);
            }
            	  
            // Cerramos el archivo
            archivo.close();
            
        } catch (Exception e) {
            System.out.println("No se puede escribir en el archivo" + e.getMessage());
        }
    	
    }
    
    public void guardarFicheroMascotas(ArrayList<Mascota> listaMascotas) {
    	try {
            // Creamos o abrimos un nuevo archivo
            archivo = new RandomAccessFile("Mascotas.dat", "rw");             
            // Ponemos el puntero al final del archivo
            archivo.seek(archivo.length());
             
            // Serializamos el objeto Persona
            // Lo convertimos en una secuencia de bytes.
            escribir= new ByteArrayOutputStream();
            salida = new ObjectOutputStream(escribir);
            for (InterfazAnimal masc : listaMascotas) {
            	salida.writeObject(masc.toString());             
            	// Cerramos el objeto.
            	salida.close();
             
            	// obtenemos los bytes serializados
            	array = escribir.toByteArray();
             
            	// Escribimos los bytes en el archivo.
            	archivo.write(array);
            }
            	  
            // Cerramos el archivo
            archivo.close();
            
        } catch (Exception e) {
            System.out.println("No se puede escribir en el archivo" + e.getMessage());
        }
    	
    }
 
}
