public class Solution {

    public class TreeNode {
      public int val;
      public TreeNode left, right;
      public TreeNode(int val) {
          this.val = val;
          this.left = this.right = null;
      }
  }
    public boolean isBalanced(TreeNode root) {
        if (root == null){
            return true;
        }
        if (!isBalanced(root.left)){
            return false;
        }
        if (!isBalanced(root.right)){
            return false;
        }
        return Math.abs(getHeight(root.right) - getHeight(root.left)) <= 1;
    }
    public int getHeight(TreeNode root){
        if(root == null){
            return 0;
        }

        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }
}
