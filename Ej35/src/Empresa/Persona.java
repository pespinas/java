package Empresa;

public class Persona {
    protected String nombre;
    protected String apellido;
    protected String documento;
    protected String tipo;

    public Persona(String n, String a, String d, String t){
        this.nombre = n;
        this.apellido = a;
        this.documento = d;
        this.tipo = t;
    }
}
