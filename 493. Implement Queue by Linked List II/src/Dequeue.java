import java.util.List;
import java.util.NoSuchElementException;

class ListNode{
    int val;
    ListNode next, pre;
    public ListNode(int val){
        this.val = val;
        pre = next = null;
    }
}

public class Dequeue {
    public ListNode first, last;

    public Dequeue() {
        first = last = null;
    }

    /*
     * @param item: An integer
     * @return: nothing
     */
    public void push_front(int item) {
        if (first == null){
            last = new ListNode(item);
            first = last;
        }
        else{
            ListNode temp = new ListNode(item);
            first.pre = temp;
            temp.next = first;
            first = first.pre;
        }
    }

    /*
     * @param item: An integer
     * @return: nothing
     */
    public void push_back(int item) {
        if (last == null){
            last = new ListNode(item);
            first = last;
        }
        else{
            ListNode temp = new ListNode(item);
            last.next = temp;
            temp.pre = last;
            last = last.next;
        }
    }

    /*
     * @return: An integer
     */
    public int pop_front() {
        if (first != null){
            int res = first.val;
            first = first.next;
            if (first != null){
                first.pre = null;
            }
            else
                last = null;
            return res;
        }
        return -11;
    }

    /*
     * @return: An integer
     */
    public int pop_back() {
        if (last != null){
            int res = last.val;
            last = last.pre;
            if (last != null){
                last.next = null;
            }
            else
                first = null;
            return res;
        }
        return -11;
    }
}