import java.util.Scanner;
public class Main {
    public static String Par(int x){
        int result = x%2;
        if (result == 0) {
            return "Par";
        }
        else {
            return "Impar";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int valor = scanner.nextInt();
        System.out.println(Par(valor));

    }
}