package bit;

/**
 * @Author 袁媛
 * @Date 2020/9/27
 * @Time 20:41
 */

public class TreeNode {
    int v;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        v = x;
    }

    @Override
    public String toString() {
        return String.format("%c", v);
    }
}

