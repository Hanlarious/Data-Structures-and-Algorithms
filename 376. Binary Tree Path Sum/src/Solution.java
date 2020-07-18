import java.util.ArrayList;
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

    public List<List<Integer>> binaryTreePathSum(TreeNode root, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }

        ArrayList<Integer> path = new ArrayList<Integer>();
        path.add(root.val);
        helper(root, path, root.val, target, result);
        return result;

    }
    private void helper(TreeNode node, ArrayList path, int sum, int target, List<List<Integer>> result){

        if (node.right == null && node.left == null){
            if (sum == target){
                result.add(new ArrayList<Integer>(path));
            }
        }

        if (node.left != null){
            path.add(node.left.val);
            helper(node.left, path, sum + node.left.val, target, result);
            path.remove(path.size()-1);
            }

        if (node.right != null){
            path.add(node.right.val);
            helper(node.right, path, sum + node.right.val, target, result);
            path.remove(path.size()-1);
        }
    }
}
