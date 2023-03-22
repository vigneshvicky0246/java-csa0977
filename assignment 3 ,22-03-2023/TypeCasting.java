public class TypeCasting {
    public static void main(String[] args) {
        // Widening Casting
        byte numByte = 64;
        short numShort = numByte;  // no explicit casting required
        int numInt = numShort;
        long numLong = numInt; // Implicit casting from int to long
        float numFloat = numLong; // Implicit casting from long to float
        double numDouble = numFloat; // Implicit casting from float to double
        System.out.println("byte value: " + numByte);
        System.out.println("short value: " + numShort);
        System.out.println("Widening Casting:");
        System.out.println("int: " + numInt);
        System.out.println("long: " + numLong);
        System.out.println("float: " + numFloat);
        System.out.println("double: " + numDouble);

        // Narrowing Casting
        double numDouble2 = 123456.789;
        float numFloat2 = (float) numDouble2; // Explicit casting from double to float
        long numLong2 = (long) numFloat2; // Explicit casting from float to long
        int numInt2 = (int) numLong2; // Explicit casting from long to int
        char charVal = (char) numInt2; // Explicit casting from int to char
        byte byteVal = (byte) charVal;// Explicit casting from char to byte
        short shortVal = (short) byteVal;
        System.out.println("\nNarrowing Casting:");
        System.out.println("double: " + numDouble2);
        System.out.println("float: " + numFloat2);
        System.out.println("long: " + numLong2);
        System.out.println("int: " + numInt2);
        System.out.println("char: " + charVal);
        System.out.println("byte: " + byteVal);
        System.out.println("short: " + shortVal);
        
    }
}
