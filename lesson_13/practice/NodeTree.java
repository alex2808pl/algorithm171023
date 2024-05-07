public class NodeTree {
    private int key;
    private String value;
    private int height;
    private NodeTree left;
    private NodeTree right;
    public int getKey() {
        return key;
    }
    public void setKey(int key) {
        this.key = key;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public NodeTree getLeft() {
        return left;
    }
    public void setLeft(NodeTree left) {
        this.left = left;
    }
    public NodeTree getRight() {
        return right;
    }
    public void setRight(NodeTree right) {
        this.right = right;
    }
    @Override
    public String toString() {
        return "NodeTree [key=" + key + ", height=" + height + ", left=" + left + ", right="
                + right + "]";
    }

    
}

