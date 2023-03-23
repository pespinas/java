public class Main {
    public static void main(String[] args) {
        String[] test = {"A","B","HTML","C","D"};
        tecnologia(test,0);
        naci(1,1);
        String si = "VivaElBetis";
        mariapompones(si,"",si.length()-1);
    }
    public static void tecnologia(String[]array,int i){
        String valor = array[i];
        i++;
        System.out.println(valor);
        if(valor != "HTML"){
            tecnologia(array,i);
        }
    }

    public static void naci(int num, int oldnum){
        oldnum = num-oldnum;
        num = num+oldnum;
        System.out.println(num);
        if (num != 55){
            naci(num,oldnum);
        }
    }
    public static void mariapompones(String palabra, String alReves, int longitud){
        alReves = alReves+palabra.charAt(longitud);
        longitud-=1;

        if (longitud != -1){
            mariapompones(palabra,alReves,longitud);
        }
        else{
            System.out.println(alReves);
        }
    }
}