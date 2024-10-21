package dominio;
import java.util.ArrayList;
import java.util.List;

public class Municipio {
    private String nombre;
    private List<Localidad> localidades = new ArrayList<>();

    public Municipio(String nombre) {
        this.nombre = nombre;
        this.localidades = new ArrayList<>();
    }
    public void agregarLocalidad(Localidad localidad){
        this.localidades.add(localidad);

    }
public List<Localidad> getLocalidades(){
    return this.localidades;
}
public String getNombre(){
    return nombre;
}
public String toString() {
    return "Municipio{" +
            "nombre='" + nombre + '\'' +
            ", localidades=" + localidades +
            ", totalHabitantes=" + contarHabitantes() +
            '}';
}



public int contarHabitantes(){
int totalHabitantes = 0;
for (Localidad localidad : localidades) {
    totalHabitantes += localidad.getnumeroDeHabitantes();
}
return totalHabitantes;
}
    
}
