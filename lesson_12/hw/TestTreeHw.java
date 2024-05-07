public class TestTreeHw {
    public static void main(String[] args) {
        // int[] keys = {15, 10, 20, 8, 12, 16, 25};
        int[] keys = {13, 5, 15, 6, 3};

        NodeTreeHw root = null;
        for (int key : keys) {
            root = MyTree.insert(root, key);
        }
        // поменять местами значения любых двух узлов
        MyTree.swapData(root.left.left, root.left.right);
        // исправить BST
        MyTree.correctBST(root);
        // распечатать BST после исправления
        MyTree.inorder(root);
    }
}
