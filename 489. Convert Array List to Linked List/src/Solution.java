import java.util.List;

public class Solution {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode toLinkedList(List<Integer> nums) {
        if (nums.size() == 0){
            return null;
        }

        ListNode head = null;
        ListNode move = null;
        for (Integer num : nums){
        if (head == null) {
            head = new ListNode(num);
            move = head;
        }
        else{
            move.next = new ListNode(num);
            move = move.next;
        }
        }
        return head;
    }

}
