package Empresa;

public class Empleado {
    protected String nombre;

    public Empleado(){
        this.nombre = "test";
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
