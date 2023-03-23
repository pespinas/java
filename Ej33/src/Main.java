import Florentino.*;
public class Main {
    public static void main(String[] args) {
        Tarjeta persona1 = new Tarjeta(1234567, "santander", "Pau Espinas", "19/05/2022");
        persona1.pagar(500);
        System.out.println(persona1.getSaldo());
        persona1.pagar(1000);
        System.out.println(persona1.getSaldo());
        persona1.estado("anular");
        persona1.pagar(500);
        System.out.println(persona1.getSaldo());
        persona1.estado("activar");
    }
}