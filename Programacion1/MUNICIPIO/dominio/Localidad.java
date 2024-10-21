package dominio;

public class Localidad {
    private String nombre;
    private int numeroDeHabitantes;

    public Localidad(String nombre, int numeroDeHabitantes){
        this.nombre = nombre;
        this.numeroDeHabitantes = numeroDeHabitantes;
    }
    public String getNombre(){
        return nombre;

    }
public void setNombre(String nombre){
    this.nombre = nombre;

}
 public int getnumeroDeHabitantes(){
     return numeroDeHabitantes;

 }
public void setNumeroDeHabitantes(int numeroDeHabitantes){
    this.numeroDeHabitantes = numeroDeHabitantes;
}
public String toString(){
    return "Localidad{" +
    "nombre=" + nombre + '\'' + ", numeroDeHabitantes=" + numeroDeHabitantes + '}';

}




}
