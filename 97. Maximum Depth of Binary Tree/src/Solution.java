public class Solution {
    public class TreeNode {
      public int val;
      public TreeNode left, right;
      public TreeNode(int val) {
          this.val = val;
          this.left = this.right = null;
      }
  }
    int depth = 0;
    public int maxDepth(TreeNode root) {
        helper(root,1);
        return depth;
    }
    public void helper(TreeNode root, int curDepth){
        if (root == null){
            return;
        }
        if (curDepth > depth){
            depth = curDepth;
        }
        helper(root.left, curDepth +1);
        helper(root.right,curDepth +1);
    }

}
