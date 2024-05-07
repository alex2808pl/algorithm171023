import java.util.HashSet;

public class MyLinkedListLoop extends MyLinkedList{
 boolean detectLoop() {
        
        HashSet<NodeTreeHw> set = new HashSet<>();
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

    boolean detectLoop2() {
        NodeTreeHw slow = head;
        NodeTreeHw fast = head;

        // Используем алгоритм Флойда для обнаружения петли
        while (fast != null && fast.getNext() != null) {
            slow = slow.getNext();      // Медленный указатель движется на один узел
            fast = fast.getNext().getNext();  // Быстрый указатель движется на два узла

            // Если быстрый и медленный указатели встречаются, значит, есть петля
            if (slow == fast) {
                return true;
            }
        }

        // Если мы дошли до конца списка без обнаружения петли
        return false;
    }
}
