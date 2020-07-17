public class Alternative {
    public class TreeNode {
      public int val;
      public TreeNode left, right;
      public TreeNode(int val) {
          this.val = val;
          this.left = this.right = null;
      }
  }
    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }


        return Math.max(maxDepth(root.left), maxDepth(root.right))+1;

    }
}
