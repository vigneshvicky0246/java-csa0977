import java.util.ArrayList;

public class CheckArrayList {
    
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        
        if (list.isEmpty()) {
            System.out.println("ArrayList is empty");
        } else {
            System.out.println("ArrayList is not empty");
        }
        
        list.add("Apple");
        
        if (list.isEmpty()) {
            System.out.println("ArrayList is empty");
        } else {
            System.out.println("ArrayList is not empty");
        }
    }
}
