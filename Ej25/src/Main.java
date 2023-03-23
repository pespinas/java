public class Main {
    public static void main(String[] args) {
        String typeName = "short";
        int byteSize = Short.BYTES;
        int bitSize = byteSize * 8;
        short minValue = Short.MIN_VALUE;
        short maxValue = Short.MAX_VALUE;

        System.out.println("Type: " + typeName);
        System.out.println("Byte size: " + byteSize);
        System.out.println("Bit size: " + bitSize);
        System.out.println("Value range: " + minValue + " to " + maxValue);
    }
}