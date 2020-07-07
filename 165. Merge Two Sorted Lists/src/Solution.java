public class Solution {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
            dummy = l1;
        while(l1 != null && l2 != null){
            if (l2.val < l1.val){
                l2.next = l1;
                l2 = l2.next;
                l1 = l1.next;
            }
            else if(l2.val > l1.val && l2.val < l1.next.val){
                l2.next = l1.next;
                l1.next = l2;
                l2 = l2.next;
                l1 = l1.next;
            }

        }
        return dummy.next;
    }

}
