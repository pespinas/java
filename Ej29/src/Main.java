public class Main {
    public static void main(String[] args) {
        String[][] datos = new String[3][4];

        datos[0][0] = "Juan";
        datos[0][1] = "Pérez García";
        datos[0][2] = "4";
        datos[0][3] = "2023";

        datos[1][0] = "María";
        datos[1][1] = "González Ruiz";
        datos[1][2] = "0";
        datos[1][3] = "1990";

        datos[2][0] = "José Luis";
        datos[2][1] = "Sánchez Fernández";
        datos[2][2] = "1";
        datos[2][3] = "1975";
        System.out.printf("%10s%20s%10s%10s\n", "Nombre", "Apellido", "Curso", "Año");
        System.out.printf("%s\n", "----------------------------------------------------");
        System.out.printf("%10s%20s%10s%10s\n", datos[0][0], datos[0][1], datos[0][2], datos[0][3]);
        System.out.printf("%10s%20s%10s%10s\n", datos[1][0], datos[1][1], datos[1][2], datos[1][3]);
        System.out.printf("%10s%20s%10s%10s\n\n", datos[2][0], datos[2][1], datos[2][2], datos[2][3]);

        System.out.printf("%-13s%-20s%-10s%s\n", "Nombre", "Apellido", "Curso", "Año");
        System.out.printf("%s\n", "----------------------------------------------------");
        System.out.printf("%-13s%-20s%-10s%s\n", datos[0][0], datos[0][1], datos[0][2], datos[0][3]);
        System.out.printf("%-13s%-20s%-10s%s\n", datos[1][0], datos[1][1], datos[1][2], datos[1][3]);
        System.out.printf("%-13s%-20s%-10s%s\n", datos[2][0], datos[2][1], datos[2][2], datos[2][3]);
    }
}