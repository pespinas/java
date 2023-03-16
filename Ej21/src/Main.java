public class Main {
    public static void main(String[] args) {
        System.out.println(java("JAVA"));
    }
    public static String java(String j){
        if(j.toLowerCase().equals("java")){
            return "Java";
        }
        else{
            return null;
        }
    }
    public static String login(String u, String p){
        if(u.equals("admin") && p == "1234"){
            return "Login true";
        }
        else{
            return "Login true";
        }
    }
    public static String par(int n) {
        if (n % 2 == 0) {
            return "Par";
        } else {
            return "Impar";
        }
    }
}