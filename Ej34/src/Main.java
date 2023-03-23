import empresa.*;
public class Main {
    public static void main(String[] args) {
        Trabajador paco = new Trabajador();
        Programador pepe = new Programador();
        System.out.println(pepe.getSueldo());
        System.out.println(paco.getSueldo());
    }
}