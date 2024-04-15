import java.util.HashSet;

public class MyLinkedListLoop extends MyLinkedList{
 boolean detectLoop() {
        
        HashSet<Node> set = new HashSet<>();
        while (head != null) {
            // If we have already has this node in hashmap it means there is a cycle
            if (set.contains(head)) {
                return true;
            }
            // If we are seeing the node for the first time, insert it in hash
            set.add(head);
            head = head.getNext();
         }
        return false;
    }
}
