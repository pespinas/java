import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Introduce un numero del 1 al 9");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        System.out.println(checkNum(value));
    }

    public static String checkNum(int n) {
        switch (n){
            case 1:
                return "Uno";
            case 2:
                return "Dos";
            case 3:
                return "Tres";
            case 4:
                return "Cuatro";
            case 5:
                return "Cinco";
            case 6:
                return "Seis";
            case 7:
                return "Siete";
            case 8:
                return "Ocho";
            case 9:
                return "Nueve";
            default:
                return "Null";
        }
    }
}