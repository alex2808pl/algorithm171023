public class AvlPractice {
    public static void main(String[] args) {
        AvlTree tree = new AvlTree();
        int[] keys = {10, 20, 30, 40, 50, 25};
        NodeTree root = constructBST(tree, keys);

        // tree.print(tree.getRoot());
        // System.out.println(tree.getRoot());
        tree.print2(root);
    }

    public static NodeTree constructBST(AvlTree tree, int[] keys) {
        NodeTree root = null;
        for (int key : keys) {
            root = tree.insert(root, key);
        }
        return root;
    }
}
