import java.util.ArrayList;
import java.util.List;

public class Solution {
    /**
     * //@param head: the head of linked list.
     * @return: An integer list
     */

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public List<Integer> toArrayList(ListNode head) {
        ArrayList<Integer> res = new ArrayList<Integer>();

        while(head != null){
            res.add(head.val);
            head = head.next;
        } return res;
    }
}