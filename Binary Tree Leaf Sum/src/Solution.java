public class Solution {

    public class TreeNode {
        public int val;
        public TreeNode left, right;
        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }
    int sum = 0;
    public int leafSum(TreeNode root) {
        if(root == null){
            return 0;
        }

        if(root.left == null && root.right == null){
            sum += root.val;
        }
        else{
            leafSum(root.left);
            leafSum(root.right);
        }
        return sum;
    }
}
