class GFG {
  public static void main(String[] args) {
    int[] arr = new int[5]; // Create a new int array with 5 elements
    arr[0] = 10; // Set the value of the first element to 10
    arr[1] = 20; // Set the value of the second element to 20
    arr[2] = 30; // Set the value of the third element to 30
    arr[3] = 40; // Set the value of the fourth element to 40
    arr[4] = 50; // Set the value of the fifth element to 50
    
    // Loop through each element of the array and print its index and value
    for (int i = 0; i < arr.length; i++) {
      System.out.println("Element at index " + i + ": " + arr[i]);
    }
  }
}