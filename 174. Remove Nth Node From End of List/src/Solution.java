public class Solution {
 public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

    public ListNode removeNthFromEnd(ListNode head, int n) {
     ListNode dummy = new ListNode(-1);
     dummy.next = head;

     for(int i = 0; i < n; i++){
         if(head == null){
             return null;
         }
         else {
             head = head.next;
         }
     }

     ListNode pre = dummy;
     while (head != null){
         pre = pre.next;
         head = head. next;
     }
     pre.next = pre.next.next;
     return dummy.next;
    }


}
