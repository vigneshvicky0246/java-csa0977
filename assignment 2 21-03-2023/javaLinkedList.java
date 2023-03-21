import java.util.LinkedList;

public class LinkedListExample {
    
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Grapes");
        
        int size = list.size();
        
        System.out.println("Size of the LinkedList: " + size);
    }
}
