public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 20; j++) {
                if (i >= 10) {
                    if (j >= 9 && j <= 10) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else if (j >= 9 - i && j <= 10 + i) {
                    System.out.print("*");
                } else{
                System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}