class Node{
    public int val;
    public Node next, pre;
    public Node(int val){
        this.val = val;
        pre = next = null;
    }
}

interface InterfaceQueue {
    void push(int element);

    // define an interface for pop method
    /* write your code here */
    int pop();

    // define an interface for top method
    /* write your code here */
    int top();
}

public class MyQueue implements InterfaceQueue {
    /* you can declare your private attributes here */
    public Node first, last;

    public MyQueue() {
        // do initialization if necessary
    }

    // implement the push method
    /* write your code here */
    @Override
    public void push(int val) {
    if (last == null){
        last = new Node(val);
        first = last;
    }
    else{
        Node node = new Node(val);
        last.next = node;
        node.pre = last;
        last= last.next;
    }
    }

    // implement the pop method
    /* write your code here */
    @Override
    public int pop() {
        if (first != null){
            int val = first.val;
            first = first.next;
            if(first != null){
                first.pre = null;
            }
            else{
                last = null;
            }
            return val;
        }
        return -1;
    }

    // implement the top method
    /* write your code here */
    @Override
    public int top() {
    if(first != null){
        return first.val;
    }
    return -1;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue queue = new MyQueue();
 * queue.push(123);
 * queue.top(); will return 123;
 * queue.pop(); will return 123 and pop the first element in the queue
 */