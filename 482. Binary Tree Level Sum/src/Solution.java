public class Solution {
    public class TreeNode {
      public int val;
      public TreeNode left, right;
      public TreeNode(int val) {
          this.val = val;
          this.left = this.right = null;
      }
  }

    public int levelSum(TreeNode root, int level) {
        if (root == null) {
            return 0;
        }
        if (level == 1) {
            return root.val;
        }
        return levelSum(root.left, level -1) + levelSum(root.right, level - 1);
    }


}
