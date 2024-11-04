package dominio;
import java.io.*;
import java.util.*;

public class Gestion implements Serializable {
	private List<Producto> Balones = new ArrayList<>(); 
	public void annadir(Producto Balon) {
		Balones.add(Balon);
	}
	public List<Producto> Balones() {
		return Balones; 
	}
	public int calcularNumeroBalones() {
		return Balones.size();
	}
	public String toString() {
		StringBuilder cad = new StringBuilder(); 
		for (Producto h : Balones) {
			cad.append(h).append("\n"); 
		}
		cad.append("Total de habitantes: ").append(calcularNumeroBalones()).append("\n");
		return cad.toString(); // Devuelve la cadena completa
	}
}