public class Main {
    public static void main(String[] args) {
        String nombre = "NOMBRE";
        String apellido1 = "APELLIDOI";
        String apellido2 = "APELLID02";
        System.out.printf("%s\t%s\t%s", nombre, apellido1, apellido2);
        System.out.printf("%s\n%s %s\n", nombre, apellido1, apellido2);
        System.out.printf("%3$s, %2$s, %1$s\n", "Nombre", "apellidol", "apellid02");
        System.out.printf("%02d\n", 1122 % 100);
        System.out.printf("%010d\n", 22);
        System.out.printf("%012.3f\n", 17.1829327);
        System.out.printf("Hola %nMundo");


    }
}