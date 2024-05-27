package lesson_15;

public class FrogSlowFast {
    public static void main(String[] args) {

        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        
        head.setNext(second);
        second.setNext(third);
        third.setNext(fourth);
        
        print(head);
        
        removeNodeFromEnd(head, 2);
        print(head);
            
    }

    // удаление элемента
    public static void removeNodeFromEnd(Node head, int idx) {
        Node fast = head;
        Node slow = head;
    
        for (int i = 0; i < idx; i++) {
            fast = fast.getNext();
        }
    
        while (fast.getNext() != null) {
            fast = fast.getNext();
            slow = slow.getNext();
        }
    
        slow.setNext(slow.getNext().getNext());
    }

    
    public static void print(Node head) {
        Node node = head;
        while (node != null) {
            System.out.print(node.getValue() + " ");
            node = node.getNext();
        }
        System.out.println();
    }   
}

class Node {
    private int value;
    private Node next;

    public Node(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getValue() {
        return value;
    }
}