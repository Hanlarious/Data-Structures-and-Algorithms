import java.util.List;
import java.util.NoSuchElementException;

public class Stack {
    /*
     * @param x: An integer
     * @return: nothing
     */
    public class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }

    }

    ListNode head;

    public void push(int x) {
        ListNode cur = new ListNode(x);
        cur.next = head;
        head = cur;
    }

    /*
     * @return: nothing
     */
    public void pop() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        head = head.next;
    }

    /*
     * @return: An integer
     */
    public int top() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return head.val;
    }

    /*
     * @return: True if the stack is empty
     */
    public boolean isEmpty() {
        return head == null;

    }
}


