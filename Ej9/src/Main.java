public class Main {
    public static void main(String[] args) {
        String nombre = "Pau";
        String apellido = "Espinás";
        String calle = "Calle Principal 123";
        String municipio = "Barcelona";
        int codigoPostal = 12345;
        char sexo = 'M';
        String correoElectronico = "pespinas@fasas.com";

        String direccionCompleta = "Nombre: " + nombre + "\n"
                + "Apellido: " + apellido + "\n"
                + "Dirección: " + calle + "\n"
                + "Municipio: " + municipio + "\n"
                + "Código Postal: " + codigoPostal + "\n"
                + "Sexo: " + sexo + "\n"
                + "Correo electrónico: " + correoElectronico;

        System.out.println(direccionCompleta);

    }
}