public class Main {
    public static void main(String[] args) {
        String verde = "\033[48;5;34m";
        String marron = "\033[48;5;130m";
        String fin = "\033[0m";
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 20; j++) {
                if (i >= 10) {
                    if (j >= 9 && j <= 10) {
                        System.out.print(marron+"*"+fin);
                    } else {
                        System.out.print(" ");
                    }
                } else if (j >= 9 - i && j <= 10 + i) {
                    System.out.print(verde+"*"+fin);
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}