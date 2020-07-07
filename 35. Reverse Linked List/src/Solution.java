public class Solution {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
    public ListNode reverse(ListNode head) {
        ListNode pre = null;
        while(head != null){
              ListNode temp = head.next;
              head.next = pre;
              pre = head;
              head = temp;
        }
        return pre;


    }
}


