public class Alternative {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

  public ListNode findNode(ListNode head, int val) {
        for (ListNode node = head; node != null; node = node.next) {
            if (node.val == val) {
                return node;
            }
        }
        return null;
    }
}
