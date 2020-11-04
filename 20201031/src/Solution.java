/**
 * @Author 袁媛
 * @Date 2020/10/31
 * @Time 10:59
 */
/*
class Solution {
     public void sortColors(int[] nums) {
         int len = nums.length;
         if(len < 2) {
             return;
         }
         //[0,zero)=0;
         //[zero,i)=1;
         //[two,len-1)=2;
         int two = len;
         int zero = 0;
         int i = 0;
         while (i < two) {
             if(nums[i] == 0) {
                 swap(nums,i,zero);
                 i++;
                 zero++;
             } else if(nums[i]==1) {
                 i++;
             } else {
                 len--;
                 swap(nums,i,two);
             }
         }
     }

    private void swap(int[] nums, int i, int zero) {
         int temp = nums[i];
         nums[i] = nums[zero];
         nums[zero] = temp;
    }
}
 */


/*
class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if( t1 == null) {
            return t2;
        }
        if( t2 == null) {
            return t1;
        }
        TreeNode merged = new TreeNode(t1.val + t2.val);
        merged.left = mergeTrees(t1.left , t2.left);
        merged.right = mergeTrees(t1.right , t2.right);
        return merged;
    }
}
 */
/*
class Solution {
    TreeNode cur;
    public TreeNode increasingBST(TreeNode root) {
        TreeNode ans = new TreeNode(0);
        cur = ans;
        inorder(root);
        return ans.right;
    }

    private void inorder(TreeNode root) {
        if(root == null) {
            return;
        }
        inorder(root.left);
        root.left = null;
        cur.right = root;
        cur = root;
        inorder(root.right);
    }
}
*/

class Solution {
    int size = 0;
    int maxCode = 0;
    public boolean isCompleteTree(TreeNode root) {
        if(root == null) {
            return true;
        }
        recursize(root,1);
        return size == maxCode;
    }

    private void recursize(TreeNode root, int i) {
        if(root == null) {
            return;
        }
        size++;
        maxCode = Math.max(maxCode,i);
        recursize(root.left,i * 2);
        recursize(root.right,i * 2 + 1);
    }
}