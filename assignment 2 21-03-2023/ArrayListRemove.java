import java.util.ArrayList;

public class ArrayListRemove {
    
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Grapes");
        
        System.out.println("Original ArrayList: " + list);
        
        list.remove("Banana");
        
        System.out.println("ArrayList after removing element: " + list);
    }
}
