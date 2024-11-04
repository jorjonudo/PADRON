package dominio;
import java.io.Serializable;
public class Producto implements Serializable {
	private String nombre;
	private String tipo;
	private String precio;
	// Constructor que inicializa los atributos del Producto
	public Producto(String nombre, String tipo, String precio) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.precio = precio;
	}
	// Método para establecer el nombre del Producto
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	// Método para establecer el primer tipo de Prodcuto
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	// Método para establecer el  precio del Producto
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	// Método para obtener el nombre del Producto
	public String getNombre() {
		return nombre;
	}
	// Método para obtener el primer tipo de Producto
	public String getTipo() {
		return tipo;
	}
	// Método para obtener el precio del Producto
	public String getPrecio() {
		return precio;
	}
	// Método que devuelve una representación en texto del Producto
	public String toString() {
		return precio + " " + tipo + ", " + nombre;
	}
}