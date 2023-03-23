import java.util.Scanner;

public class Q2_DecimalToBinary {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the decimal number from the user
        System.out.print("Enter a decimal number: ");
        int decimal = input.nextInt();

        // Convert the decimal number to binary
        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.append(remainder);
            decimal /= 2;
        }

        // Reverse the binary string
        binary.reverse();

        // Print the binary equivalent
        System.out.println("Binary equivalent: " + binary);
    }
}