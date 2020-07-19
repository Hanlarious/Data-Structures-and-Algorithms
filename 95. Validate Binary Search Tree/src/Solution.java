public class Solution {
    public class TreeNode {
        public int val;
        public TreeNode left, right;

        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

    public boolean isValidBST(TreeNode root) {


        if (root == null || (root.left == null && root.right == null)){
            return true;
        }
        if (root.left.val >= root.val){
            return false;
        }
        if (root.right.val <= root.val){
            return false;
        }
        return (isValidBST(root.left) && isValidBST(root.right));
    }
    public boolean helper(TreeNode root, long min, long max){
        if (root == null){
            return true;
        }
        if ()

    }
}
