package dominio;

import java.util.ArrayList;
import java.util.List;


public class Provincia {
    private String nombre;
    private List<Municipio> municipios;

    public Provincia(String nombre){
        this.nombre = nombre;
        this.municipios = new ArrayList<>();
    }

    public void agregarMunicipio(Municipio municipio){
        this.municipios.add(municipio);
    }
    public List<Municipio> getMunicipios(){
        return this.municipios;
    }
    public String getNombre(){
        return nombre;
    }
    public int contarHabitantesMunicipio(){
        int totalHabitantesMunicipio = 0;
        for (Municipio municipio : municipios) {
            totalHabitantesMunicipio += municipio.contarHabitantes();
        }
        return totalHabitantesMunicipio;
        
    }
    
    
    public String toString() {
        return "Provincia{" +
                "nombre='" + nombre + '\'' +
                ", municipios=" + municipios +
                ", totalHabitantes=" + contarHabitantesMunicipio() +
                '}';
    }


}
