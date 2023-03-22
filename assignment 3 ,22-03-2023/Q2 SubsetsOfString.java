import java.util.Scanner;

public class SubsetsOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.next();

        System.out.println("All subsets of the string are:");
        int len = str.length();

        // Loop to generate all subsets of the given string
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j <= len; j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }
}
