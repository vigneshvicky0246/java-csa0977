import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        
        // Adding elements to the Queue
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Orange");
        queue.add("Grapes");
        
        // Printing the Queue
        System.out.println("Queue: " + queue);
        
        // Removing the first element from the Queue
        String first = queue.remove();
        System.out.println("Removed element: " + first);
        
        // Printing the updated Queue
        System.out.println("Updated Queue: " + queue);
    }
}
