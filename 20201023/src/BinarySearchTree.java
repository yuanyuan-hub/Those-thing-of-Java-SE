/**
 * @Author 袁媛
 * @Date 2020/10/25
 * @Time 11:36
 */
public class BinarySearchTree {
    public static class Node {
        int key;
        Node left;
        Node right;

        public Node(int key) {
            this.key = key;
        }
    }
    private Node root = null;

    public boolean search(int key) {
        Node current = root;
        while (current != null) {
            if(key == current.key) {
                return true;
            } else if (key < current.key){
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return false;
    }


    public boolean insert (int key) {
        if(root == null) {
            root = new Node(key);
            return true;
        }
        Node current = root;
        Node parent = null;
        while (current != null) {
            if(key == current.key) {
                return false;
            } else if (key < current.key) {
                parent = current;
                current = current.left;
            } else {
                parent = current;
                current = current.right;
            }
        }
        Node node = new Node(key);
        if (key < parent.key) {
            parent.left = node;
        } else {
            parent.right = node;
        }
        return true;
    }
}
