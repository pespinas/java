import java.util.Scanner;

public class Main {

    public static Boolean check(int n){
        if(n == 0 || n == 1){
            return true;
        }
        else{
            return false;
        }
    }
    public static String imprimir(boolean x){
        if (x){
            return "Rojo";
        }
        else{
            return "negro";
        }
    }
    public static String temperatura(double t){
        if (t >= 20){
            return "Clima calido";

        } else if (t>= 10 && t<20) {
            return "Clima templado";
        }
        else{
            return "Clima frio";
        }
    }

    public static Double isNum(String n){
        try {
            n = n.replace(',', '.');
            Double result =Double.parseDouble(n);
            return result;
        } catch(NumberFormatException e){
            throw new IllegalArgumentException("El argumento proporcionado no es un número válido.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce 1 o 0: ");
        int valor = scanner.nextInt();
        System.out.println(check(valor));
        System.out.println(imprimir(check(valor)));

        /////////////////////////////////////
        Scanner tempe = new Scanner(System.in);
        System.out.print("Introduce gragos ");
        double grados = isNum(tempe.nextLine());
        System.out.println(temperatura(grados));
    }
}