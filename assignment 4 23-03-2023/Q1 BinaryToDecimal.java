import java.util.Scanner;

public class Q1_BinaryToDecimal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the binary number from the user
        System.out.print("Enter a binary number: ");
        String binaryStr = input.nextLine();

        // Convert the binary number to decimal
        int decimal = 0;
        int base = 1;
        for (int i = binaryStr.length() - 1; i >= 0; i--) {
            if (binaryStr.charAt(i) == '1') {
                decimal += base;
            }
            base *= 2;
        }

        // Print the decimal equivalent
        System.out.println("Decimal equivalent: " + decimal);
    }
}