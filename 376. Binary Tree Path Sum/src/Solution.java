import java.util.List;

public class Solution {
    public class TreeNode {
      public int val;
      public TreeNode left, right;
      public TreeNode(int val) {
          this.val = val;
          this.left = this.right = null;
      }
  }
    private int sum = 0;
    public List<List<Integer>> binaryTreePathSum(TreeNode root, int target) {

    }
    public int getSum(TreeNode node){
        if (node == null){
            return 0;
        }
        sum += node.val;
    }
}
