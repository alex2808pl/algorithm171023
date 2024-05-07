package lesson_12;

public class BinaryTree {

// find(key)
// insert(key, value)
// delete(value)
// print(node)


    private Node root;

    // вставка через циклы
    public void insert(int key, String value) {
        Node newNode = new Node();
        newNode.setKey(key);
        newNode.setValue(value);

        if(root==null) { // пустое дерево
            root = newNode; 
        } else {
            Node current = root;
            Node parent = null;

            while(true) {
                parent = current;
                if(key == current.getKey()) {
                    return;
                }
                else if(key < current.getKey()) { // если элемент меньше, уходим в левую подветку
                    current = current.getLeft();
                    if(current == null) {
                        parent.setLeft(newNode);
                        return;
                    }
                } else {
                    current = current.getRight(); // если элемент больше текущего, идем вправо
                    if(current == null) {
                        parent.setRight(newNode);
                        return;
                    }

                }
            }
        }
    }

    // вставка через рекурсию
    public Node insertRecursive(Node current, Node newNode) {
        if(root == null) {
            root = newNode;
            return newNode;
       }
        if(current == null) {
             return newNode;
        }

        if(newNode.getKey() < current.getKey()) {
            current.setLeft(insertRecursive(current.getLeft(), newNode));
        } else if(newNode.getKey() > current.getKey()) {
            current.setRight(insertRecursive(current.getRight(), newNode));
        } else {
            return current;
        }
        return current;
    }

    public void print(Node node) {
        if(node!=null) {
            print(node.getLeft());
            System.out.println(node);
            print(node.getRight());
        }
    }

    
    public void print() {
        System.out.println(root);
     }

    public Node getRoot() {
        return root;
    }

    public Node find(int key) {
        Node current = root; // начинаем поиск с корневого узла

        while (current.getKey() != key) { // поиск пока не будет найден элемент или не будут перебраны все
            if (current.getKey() > key) { // движение влево?
                current = current.getLeft();
            } else {
                current = current.getRight(); //движение вправо
            }
            if (current == null) { // если потомка нет,
                return null;
            }
        }
        return current; // возвращаем найденный элемент
    }

}
