import java.util.Scanner;
public class Main {
    public static int incremento(int n){
        n++;
        return n;
    }
    private static int decremento(int n){
        n--;
        return n;
    }
    public static void main(String[] args) {
        int num = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce cuanto quieres aumentar: ");
        int valor = scanner.nextInt();
        for (int i = 0; i< valor; i++ ){
            num = incremento(num);
            System.out.println(num);
        }
        System.out.print("Introduce cuanto quieres reducir: ");
        valor = scanner.nextInt();
        for (int i = 0; i< valor; i++ ){
            num = decremento(num);
            System.out.println(num);
        }

    }
}