interface Square {
  int calculate(int x);
}

class debug _Q1_interface {
  public static void main(String args[]) {
    // Create an instance of the Square interface using a lambda expression
    Square s = (int x) -> x * x;
    
    int a = 5;
    int ans = s.calculate(a); // Call the calculate method on the Square instance
    System.out.println(ans);
  }
}