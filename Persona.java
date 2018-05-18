public class Persona{

private String nombre;
private int edad;
private String comidaFavorita;

    public Persona(String nombre, int edad, String comidaFavorita) {
        this.nombre = nombre;
        this.edad = edad;
        this.comidaFavorita = comidaFavorita;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getComidaFavorita() {
        return comidaFavorita;
    }
}
