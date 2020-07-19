public class Solution {
    public class TreeNode {
      public int val;
      public TreeNode left, right;
      public TreeNode(int val) {
          this.val = val;
          this.left = this.right = null;
      }
  }

    public TreeNode insertNode(TreeNode root, TreeNode node) {
        if (root == null){
            return node;
        }
        if (root.val < node.val){
            root.right = insertNode(root.right, node);
        }
        else
            root.left =insertNode(root.left, node);
        return root;
    }
}
