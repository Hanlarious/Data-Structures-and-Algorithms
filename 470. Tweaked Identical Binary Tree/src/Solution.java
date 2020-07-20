public class Solution {

      public class TreeNode {
          public int val;
          public TreeNode left, right;
          public TreeNode(int val) {
              this.val = val;
              this.left = this.right = null;
          }
      }

        /**
         * @param a: the root of binary tree a.
         * @param b: the root of binary tree b.
         * @return: true if they are tweaked identical, or false.
         */
        public boolean isTweakedIdentical(TreeNode a, TreeNode b) {
            if (a == null && b == null){
                return true;
            }
            if (a == null || b == null){
                return false;
            }
            if (a.val != b.val){
                return false;
            }

            if (isTweakedIdentical(a.right, b.right) && isTweakedIdentical(a.left, b.left)){
                return true;
            }
            if (isTweakedIdentical(a.right, b.left) && isTweakedIdentical(a.left, b.right)){
                return true;
            }
            return false;


    }
}

