import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
      public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
    public ListNode removeDuplicates(ListNode head) {
          ListNode dummy = new ListNode(0);
          dummy.next = head;
          head = dummy;

          Set<Integer> temp = new HashSet<Integer>();

          while(head.next != null){
            if(!temp.contains(head.next.val)){
                temp.add(head.next.val);
                head = head.next;
            }
            else  {
                head.next = head.next.next;
            }
        }
          return dummy.next;
    }
}
