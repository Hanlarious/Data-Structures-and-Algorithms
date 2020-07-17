public class Alternative {

    public class TreeNode {
      public int val;
      public TreeNode left, right;
      public TreeNode(int val) {
          this.val = val;
          this.left = this.right = null;
      }
  }
    int sum;
    public int leafSum(TreeNode root) {
        sum = 0;
        traverse(root);
        return sum;

    }
    public void traverse(TreeNode root){
        if (root == null){
            return;
        }
        if (root.left == null & root. right == null){
            sum += root.val;
        }
        traverse(root.left);
        traverse(root.right);
    }

}
