public class Solution {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode insertNode(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        ListNode node = new ListNode(val);
        dummy.next = head;
        head = dummy;
        while (head.next != null && head.next.val < val) {
            head = head.next;
        }
        node.next = head.next;
        head.next = node;
        return dummy.next;
    }
}

