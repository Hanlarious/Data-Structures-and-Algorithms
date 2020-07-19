public class Solution {
    public class TreeNode {
      public int val;
      public TreeNode left, right;
      public TreeNode(int val) {
          this.val = val;
          this.left = this.right = null;
      }
  }

    public TreeNode sortedArrayToBST(int[] A) {
        TreeNode root = null;
        int len = A.length;
        root = recursion(A, 1, len, root);
        //A = null;
        return root;
    }
    public TreeNode recursion(int[] array, int lhs, int rhs, TreeNode root){
        if(lhs <= rhs){
            int mid = (lhs + rhs + 1)/2;
            root = new TreeNode(array[mid-1]);
            root.left = recursion(array, lhs, mid - 1, root.left);
            root.right = recursion(array, mid + 1, rhs, root.right);
        }
        return root;
    }
}