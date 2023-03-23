public class Q4_BitwiseComplementExample {
    public static void main(String[] args) {
        int num = 10; // binary representation: 0000 1010

        int complement = ~num;

        System.out.println("~num = " + complement); // prints -11 (binary representation: 1111 0101)
    }
}