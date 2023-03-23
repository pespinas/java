public class Main {
    public static void main(String[] args) {
        //se desbordaria entonces una solución es guardarlo en otra variable
        byte b = 100;
        int resultado = b * 2;
        System.out.println(resultado);
        byte resultado2 = (byte)(b * 2);
        System.out.println(resultado2);

    }
}