package presentacion;
import dominio.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
// Clase que gestiona la interacción con el usuario
public class InterfazUsuario {
	// Atributo que representa la Gestión de Producto
	private Gestion Producto;
	// Scanner para leer la entrada del usuario desde la consola
	private Scanner sc = new Scanner(System.in);
	// Método que ejecuta una acción basada en la instrucción proporcionada
	public boolean ejecutar(String[] instruccion) {
		// Comprueba si la instrucción contiene solo un comando
		if (instruccion.length == 1) {
			// Si el comando es "mostrar", imprime el padrón en la consola
			if (instruccion[0].equals("mostrar")) {
				System.out.println(Producto);
				// Si el comando es "ayuda", muestra las opciones disponibles
			} else if (instruccion[0].equalsIgnoreCase("ayuda")) {
				System.out.println("opciones: \n mostrar \n ayuda \n añadir <nombre> <tipo> <precio> \n");
				// Si el comando es "salir", guarda el padrón y finaliza el programa
			} else if (instruccion[0].equalsIgnoreCase("salir")) {
				escribirPadron();
				System.out.println("Finalizado con exito");
				return false;  // Indica que el programa debe finalizar
			} else {
				// Si el comando no es reconocido, muestra un mensaje de error
				System.out.println("Error en la instrucción. Ayuda para más info");
			}
			// Si el comando es "anadir" y hay suficientes argumentos, añade un nuevo habitante
		} else if (instruccion[0].equalsIgnoreCase("anadir") && instruccion.length == 4) {
			Producto.annadir(new Producto(instruccion[1], instruccion[2], instruccion[3]));
			System.out.println("Producto añadido correctamente");
		} else {
			// Si el comando no es válido, muestra un mensaje de error
			System.out.println("Error en la instrucción. Ayuda para más info");
		}
		return true;  // Indica que el programa debe seguir ejecutándose
	}
	// Método que lee una instrucción del usuario desde la consola
	public String[] leerInstrucion() {
		System.out.print("?>");
		String linea = sc.nextLine();  // Lee la línea completa ingresada por el usuario
		return linea.split(" ");  // Divide la línea en palabras y devuelve un array
	}
	// Método que lee el padrón desde un archivo
	private void leerProducto() {
		ObjectInputStream oi;  // Declaración del ObjectInputStream para leer objetos
		try {
			// Intenta abrir el archivo y leer el objeto OficinaPadron
			oi = new ObjectInputStream(new FileInputStream("Producto.dat"));
			Producto = (Gestion) oi.readObject();
		} catch (Exception e) {
			// Si hay un error (archivo no encontrado, etc.), se inicializa un nuevo OficinaPadron
			Producto = new Gestion();
		}
	}
	// Método que guarda el Prodcuto en un archivo
	private void escribirProducto() {
		// Método que guarda el Producto en un archivo
		try (ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream("Producto.dat"))) {
			// Intenta abrir el archivo para escribir el objeto Gestion
			oo.writeObject(Producto);  // Escribe el Producto en el archivo
		} catch (Exception e) {
			// Si hay un error al escribir en el archivo, muestra un mensaje de error
			System.out.println("Error al escribir fichero");
		}
	}
	// Constructor de la clase InterfazUsuario
	public InterfazUsuario() {
		leerProducto();  // Al crear una instancia, se lee el padrón desde el archivo
	}
}