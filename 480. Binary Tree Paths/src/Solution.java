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

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<String>();
        if (root == null){
            return paths;
        }
        List<String> leftPaths = binaryTreePaths(root.left);
        List<String> rightPaths = binaryTreePaths(root.right);

        for (String path : leftPaths){
            paths.add(root.val + "->" + path);
        }
        for (String path : rightPaths){
            paths.add(root.val + "->" + path);
        }

        if (paths.size() == 0){
            paths.add("" + root.val);
        }
        return paths;
    }
}
