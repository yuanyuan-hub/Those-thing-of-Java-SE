package bit;

public class SomeMethod {
    private static int n;  // 这里定义的 n 是静态变量，作用域是看大括号（整个类期间有效）

    // 返回 root 为根的树中，有多少个结点
    // 遍历的写法
    public static int sumTreeNodeSize(TreeNode root) {
        // int n = 0;  // 这里 n 是局部变量，作用域是看大括号（方法期间有效）
        n = 0;  // 每次计数之前，先把 n 归零

        preOrder(root);

        return n;
    }

    private static void preOrder(TreeNode root) {
        // 1. 一个树的结点(root != null)   2. 没有结点(root == null)
        // 只需要关注情况1

        if (root != null) {
            // 处理根的时候不打印，而是让 n++
            n++;
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    // 根的个数 + 左子树的结点个数 + 右子树的结点个数
    public static int sumTreeNodeSize2(TreeNode root) {
        // root 可能有两种情况：
        // 1. root != null    root 指向了某个结点
        // 2. root == null    root 没有指向任意结点
        // 我们下面的代码中，已经假设了根结点的个数一定是 1 了

        if (root == null) {
            // root == null 代表 root 没有指向任何结点
            // 由于 root 是一棵树的根，所以，根不存在
            // 意味着这棵树中一个结点都没有
            // 空树
            return 0;
        } else {
            int rootNodeSize = 1;   // 根的结点个数
            int leftSubTreeNodeSize = sumTreeNodeSize2(root.left);
            int rightSubTreeNodeSize = sumTreeNodeSize2(root.right);

            return rootNodeSize + leftSubTreeNodeSize + rightSubTreeNodeSize;
        }
    }

    private static int leafN;
    public static int sumTreeLeafNodeSize(TreeNode root) {
        // 注意，每次计算叶子结点个数之前，都必须归零
        leafN = 0;

        // 2. 使用前序遍历方式，经过每一个结点
        preOrder2(root);

        return leafN;
    }

    private static void preOrder2(TreeNode root) {
        if (root != null) {
            // 根
            // 这个位置，才是每个结点都会经过的代码
            // 所以在找个位置，对 root 结点进行检查，单纯的把 root 看成结点
            if (root.left == null && root.right == null) {
                leafN++;
            }

            preOrder2(root.left);
            preOrder2(root.right);
        }
    }

    public static int sumTreeLeafNodeSize2(TreeNode root) {
        if (root == null) {
            // 对一棵空树，求叶子结点个数
            // 所以，结果是 0
            return 0;
        } else if (root.left == null && root.right == null) {
            // root 进一步的代表的是一棵树
            // 以 root 为根的一棵树
            // root 这棵树的根没有左孩子 并且 没有右孩子
            // 所以，这棵树只有一个结点

            // 对于一棵只有一个结点的树，求叶子结点个数
            // 所以，结果是 1
            return 1;
        } else {
            // 至少一个以上的结点
            // 整棵树的叶子结点个数 = 左子树的叶子节点个数 + 右子树的叶子结点个数
            int leftSubTreeLeafSize = sumTreeLeafNodeSize2(root.left);
            int rightSubTreeLeafSize = sumTreeLeafNodeSize2(root.right);

            return leftSubTreeLeafSize + rightSubTreeLeafSize;
        }
    }

    public static int sumKLevelNodeSize(TreeNode root, int k) {
        if (root == null) {
            // 1. root 代表空树
            return 0;
        } else if (k == 1) {
            // 2. root 不是空树，但 k == 1
            return 1;
        } else {
            // 3. 其他情况
            int leftSubTreeK_1 = sumKLevelNodeSize(root.left, k - 1);
            int rightSubTreeK_1 = sumKLevelNodeSize(root.right, k - 1);

            return leftSubTreeK_1 + rightSubTreeK_1;
        }
    }

    public static int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        } else if (root.left == null && root.right == null) {
            return 1;
        } else {
            int leftSubTreeHeight = getHeight(root.left);
            int rightSubTreeHeight = getHeight(root.right);

            return Math.max(leftSubTreeHeight, rightSubTreeHeight) + 1;
        }
    }

    public static void main(String[] args) {
        TreeNode root = BuildTree.buildTree1();
        /*
        int sum = sumTreeNodeSize2(root);
        System.out.println("树的结点个数: " + sum);
        */

        /*
        int sum = sumTreeLeafNodeSize2(root);
        System.out.println("树的叶子结点个数：" + sum);

        sum = sumTreeLeafNodeSize2(root);
        System.out.println("树的叶子结点个数：" + sum);
        */

        /*
        System.out.println("第 1 层，结点个数: " + sumKLevelNodeSize(root, 1));
        System.out.println("第 2 层，结点个数: " + sumKLevelNodeSize(root, 2));
        System.out.println("第 3 层，结点个数: " + sumKLevelNodeSize(root, 3));
        System.out.println("第 4 层，结点个数: " + sumKLevelNodeSize(root, 4));
        System.out.println("第 5 层，结点个数: " + sumKLevelNodeSize(root, 5));
        System.out.println("第 6 层，结点个数: " + sumKLevelNodeSize(root, 6));
        System.out.println("第 7 层，结点个数: " + sumKLevelNodeSize(root, 7));
        */

        System.out.println("树的高度是: " + getHeight(root));
    }
}
