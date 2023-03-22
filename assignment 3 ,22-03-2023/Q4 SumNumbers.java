public class SumNumbers {
    public static void main(String[] args) {
        int sum = sumNumbers(10);
        System.out.println("Sum of numbers up to 10 is: " + sum);
    }
    
    public static int sumNumbers(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumNumbers(n-1);
        }
    }
}
