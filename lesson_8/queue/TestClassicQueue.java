import java.util.PriorityQueue;
import java.util.Queue;

public class TestClassicQueue {
    public static void main(String[] args) {
        ClassicQueue queue = new ClassicQueue(8);

        queue.pushToEnd(1);
        queue.pushToEnd(2);
        queue.pushToEnd(3);
        queue.pushToEnd(4);

        System.out.print("Queue: ");
        queue.printQueue();
        System.out.print(" <-- top");
        System.out.println();

        // remove element from queue
        queue.removeFromHead();
        System.out.println("After pop out");
        queue.printQueue();

        System.out.println();
        System.out.println("Call peek()");
        System.out.println(queue.peekFromHead());
        System.out.println("After peek out");
        queue.printQueue();

        // Используя стандартные JCF
        System.out.println("-- JCF ---");
        Queue<Integer> queueStandart = new PriorityQueue<>();
        queueStandart.add(1);
        queueStandart.add(2);
        queueStandart.add(3);
        queueStandart.add(4);
        System.out.println(queueStandart);
        queueStandart.remove();    
        System.out.println(queueStandart);
        queueStandart.remove();  
        System.out.println(queueStandart);
        queueStandart.remove();  
        System.out.println(queueStandart);
        queueStandart.remove();  
        System.out.println(queueStandart);
        queueStandart.peek();    
        System.out.println(queueStandart);


      ;
    }
}
