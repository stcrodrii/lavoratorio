package TGN1;
public abstract class Persona {
    protected String nombre;
    protected int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public abstract String toString();


    public abstract String getTipo();

}
