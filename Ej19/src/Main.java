public class Main {
    public static void main(String[] args) {
        int num[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        /*
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]+": "+par(num[i]));

        }
        */
        int l = 0;
        while(l < num.length){
            System.out.println(num[l]+": "+par(num[l]));
            l++;
        }

        letras();
    }

    public static String par(int n){
        if(n%2 == 0){
            return "Es divisible por 2";
        } else if (n%3 == 0) {
            return "Es divisible por 3";
        }
        return "No es divisible por 2 ni 3";
    }
    public static String[] abc (){
        String[] alphabet = new String[26];
        for (int i = 0; i < 26; i++) {
            alphabet[i] = String.valueOf((char)('a' + i));
        }
        return alphabet;
    }

    public static void letras(){
        String[] enove = abc();
        String[] enove2 = new String[enove.length];

        for (int i = enove.length-1; i >= 0 ; i--) {
            String letras = "";
            for (int j = i; j >= 0; j--) {
                System.out.print(enove[j]);
                letras += enove[j];
            }
            enove2[i] = letras;
            System.out.println();
        }
        for (int y = 1; y < enove.length ; y++) {
            System.out.println(enove2[y]);
        }
    }
}