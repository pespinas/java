import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Long myLong = 123456789L;
        byte myByte = 100;
        short myShort = 32000;
        Integer myInteger = 42;
        int value = 10;
        Integer wrappedValue = Integer.valueOf(value);


        Class myByteClass = Byte.valueOf(myByte).getClass();
        Class myShortClass = Short.valueOf(myShort).getClass();
        System.out.println(myLong.getClass());
        System.out.println(myShortClass);
        identificador(wrappedValue);

    }
    public static <T> void identificador(T parametro){
        String x = String.valueOf(parametro.getClass());
        String result = x.substring(16,x.length());
        System.out.println(result);

    }
}