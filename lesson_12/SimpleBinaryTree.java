package lesson_12;

public class SimpleBinaryTree {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        // bt.insert(3, "node 3");
        // bt.insert(1, "node 1");
        // bt.insert(2, "node 2");
        // bt.insert(4, "node 4");

        // // bt.print(bt.getRoot());
        // bt.print();

        bt.insertRecursive(bt.getRoot(), new Node(3, "node 3", null, null));
        bt.insertRecursive(bt.getRoot(), new Node(1, "node 1", null, null));
        bt.insertRecursive(bt.getRoot(), new Node(2, "node 2", null, null));
        bt.insertRecursive(bt.getRoot(), new Node(4, "node 4", null, null));
        bt.print();


       System.out.println(bt.find(4));

    }

}
