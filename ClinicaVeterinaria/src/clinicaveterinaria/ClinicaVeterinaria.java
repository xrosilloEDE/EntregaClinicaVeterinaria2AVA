package clinicaveterinaria;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import gestion.*;

/**
 *
 * @author xavier
 */
public class ClinicaVeterinaria {

    private static final String EXCEPCIONENTERO = "Has causado una excepción porque no has entrado un número entero, gracias";

	/**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        //ATRIBUTOS
        int numero = 5;
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Mascota> listaMascotas = new ArrayList<>();
        ArrayList<Persona> clientes = new ArrayList<>();
        Ficheros f = new Ficheros();

        //Clientes iniciales
        Persona pepa = new Persona("Pepa", "Navarro García", "21333412P", 61);
        clientes.add(pepa);
        Persona luna = new Persona("Luna", "Guerrero Cano", "25355471X", 46);
        clientes.add(luna);
        Persona blanca = new Persona("Blanca", "Romero Cano", "04501992H", 32);
        clientes.add(blanca);
        f.guardarFicheroClientes(clientes);

        //Mascotas iniciales
        //ID, String nombre, int edad, String raza, Persona duenyo, float peso || String función
        Cerdo oink1 = new Cerdo(1, "Valiente", 2, "Vietnamita", blanca, 12.50f);
        listaMascotas.add(oink1);
        Cerdo oink2 = new Cerdo(2, "Babe", 10, "Europeo", blanca, 100.75f);
        listaMascotas.add(oink2);
        Perro guau1 = new Perro(3, "GosPolicia", 7, "Pastor Alemán", luna, "policia");
        listaMascotas.add(guau1);
        Perro guau2 = new Perro(4, "Gosset", 1, "Breton", pepa, "compañía");
        listaMascotas.add(guau2);
        f.guardarFicheroMascotas(listaMascotas);
        
        //Menú
        do {
        	muestraMenu();
            try {
                numero = Integer.parseInt(teclado.readLine());
            } catch (IOException e) {
                System.err.println("Vaya, un error de entrada/salida... qué raro");
            } catch (NumberFormatException e) {
                System.err.println(EXCEPCIONENTERO);
            }

            //Seleccionaremos la opción
            String nomCliente = "Introduce el nombre";
			switch (numero) {
                case 1:
                    //CLIENTE NUEVO
                	altaCliente(teclado, clientes, nomCliente, "PRUEBA");
                    break;

                case 2:
                    //CLIENTE EXISTENTE, PRIMERO LO HABREMOS LISTADO CON LA OPCIÓN 3
                	altaMascota(teclado, listaMascotas, clientes, nomCliente);
                    break;

                case 3:
                    for (Persona p : clientes) {
                        System.out.println("Número Cliente: " + clientes.indexOf(p) + " --- DATOS: " + p.toString());
                    }
                    break;
                case 4:
                    for (InterfazAnimal m : listaMascotas) {
                        System.out.println("Número Mascota: " + listaMascotas.indexOf(m) + " --- DATOS: " + m.toString());
                    }
                    break;
                case 5:
                	f.guardarFicheroMascotas(listaMascotas);
                	break;
                case 6:
                	f.guardarFicheroClientes(clientes);
                	break;
            }

        } while (numero != 7);

    }

	/**
	 * @param teclado
	 * @param listaMascotas
	 * @param clientes
	 * @param nomCliente
	 * @throws IOException
	 */
	private static void altaMascota(BufferedReader teclado, ArrayList<Mascota> listaMascotas,
			ArrayList<Persona> clientes, String nomCliente) throws IOException {
		System.out.println("INTRODUCIMOS EL CLIENTE");
		System.out.println("Introduce el número de cliente");
		int indice = 0;
		try {
		    indice = Integer.parseInt(teclado.readLine());
		} catch (Exception e) {
		    System.err.println(EXCEPCIONENTERO);
		    return;
		}
		Persona p2 = null;
		try {
		    p2 = clientes.get(indice);
		} catch (IndexOutOfBoundsException e) {
		    System.err.println("Has causado una excepción porque el cliente no existe");
		    return;
		}

		//MASCOTA NUEVA
		System.out.println("AHORA INTRODUCIMOS LA MASCOTA");
		System.out.println("Introduce la identificación");
		long ID = 0;
		try {
		    ID = Long.parseLong(teclado.readLine());
		} catch (Exception e) {
		    System.err.println(EXCEPCIONENTERO);
		    return;
		}
		System.out.println(nomCliente);
		String nombre = teclado.readLine();
		System.out.println("Introduce la raza");
		String raza = teclado.readLine();
		System.out.println("Introduce la edad");
		int edad = 0;
		try {
		    edad = Integer.parseInt(teclado.readLine());
		} catch (Exception e) {
		    System.err.println(EXCEPCIONENTERO);
		    return;
		}

		int indiceM = 0;
		System.out.println("Introduce el tipo de mascota");
		System.out.println("1. Cerdo");
		System.out.println("2. Perro");
		System.out.println("3. Gato");
		try {
		    indiceM = Integer.parseInt(teclado.readLine());
		} catch (IOException e) {
		    System.err.println("Vaya, un error de entrada/salida... qué raro");
		} catch (NumberFormatException e) {
		    System.err.println(EXCEPCIONENTERO);
		    return;
		}

		Mascota m1;
		switch (indiceM) {
		    case 1:
		        float peso = 0.0f;
		        System.out.println("Introduce el peso del cerdo o la cerda");
		        try {
		            peso = Float.parseFloat(teclado.readLine());
		        } catch (Exception e) {
		            System.err.println(EXCEPCIONENTERO);
		            return;
		        }
		        m1 = new Cerdo(ID, nombre, edad, raza, p2, peso);
		        break;
		    case 2:
		        String funcion = "";
		        System.out.println("Introduce la función del perro o la perra");
		        funcion = teclado.readLine();
		        m1 = new Perro(ID, nombre, edad, raza, p2, funcion);
		        break;
		    case 3:
		        float gradosalvaje = 0.0f;
		        System.out.println("Introduce el peso del gato o la gata");
		        try {
		        	gradosalvaje = Float.parseFloat(teclado.readLine());
		        } catch (Exception e) {
		            System.err.println(EXCEPCIONENTERO);
		            return;
		        }
		        m1 = new Gato(ID, nombre, edad, raza, p2, gradosalvaje);
		        break;
		    default:
		        m1 = new Mascota(ID, nombre, edad, raza, p2);
		        break;
		}
		listaMascotas.add(m1);
	}

	/**
	 * @param teclado
	 * @param clientes
	 * @param nomCliente
	 * @param newParam TODO
	 * @return TODO
	 * @throws IOException
	 */
	private static int altaCliente(BufferedReader teclado, ArrayList<Persona> clientes, String nomCliente, String newParam)
			throws IOException {
		System.out.println("INTRODUCIMOS EL CLIENTE");
		System.out.println(nomCliente);
		String nombre = teclado.readLine();
		System.out.println("Introduce los apellidos");
		String apellidos = teclado.readLine();
		System.out.println("Introduce el DNI");
		String dni = teclado.readLine();
		System.out.println("Introduce la edad");
		int edad = 0;
		try {
		    edad = Integer.parseInt(teclado.readLine());
		} catch (Exception e) {
		    System.err.println(EXCEPCIONENTERO);
		    return 0;
		}
		Persona p1 = new Persona(nombre, apellidos, dni, edad);
		clientes.add(p1);
		return 0;
	}

	/**
	 * 
	 */
	private static void muestraMenu() {
		System.out.println("=====================================================");
		System.out.println("¿Qué quieres hacer?");
		System.out.println("1. Añadir un nuevo cliente");
		System.out.println("2. Añadir una nueva mascota para un cliente existente");
		System.out.println("3. Mostrar todos los dueños");
		System.out.println("4. Mostrar todas las mascotas");
		System.out.println("5. Guardar la información de mascotas en ficheros");
		System.out.println("6. Guardar la información de clientes en ficheros");            
		System.out.println("7. Salir");
		System.out.println("=====================================================");
	}

}
