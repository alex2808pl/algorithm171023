package lesson_12;
public class Node {
    private int key;
    private String value;
    private Node left;
    private Node right;

    public Node(int key, String value, Node left, Node right) {
        this.key = key;
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Node() {
    }

    public void setKey(int key) {
        this.key = key;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Node [key=" + key + ", value=" + value + ", left=" + left + ", right=" + right + "]";
    }

    

    
    
}
