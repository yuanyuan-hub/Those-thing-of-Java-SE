package bit;

/**
 * @Author 袁媛
 * @Date 2020/9/27
 * @Time 20:40
 */

public class Traversal {
    public static void preOrder(TreeNode root) {
        if (root != null) {
            System.out.printf("%c", root.v);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public static void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.printf("%c", root.v);
            inOrder(root.right);
        }
    }

    public static void postOrder(TreeNode root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.printf("%c", root.v);
        }
    }

    public static void preOrder2(TreeNode root) {
        if (root != null) {
            System.out.printf("%c ", root.v);
            System.out.print(" {");
            preOrder2(root.left);
            System.out.print("} { ");
            preOrder2(root.right);
            System.out.print("}");
        }
    }

    public static void main(String[] args) {
        TreeNode a = BuildTree.buildTree1();

        preOrder2(a);
    }
}

