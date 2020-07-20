import java.util.LinkedList;
import java.util.Queue;

public class Stack {
    /*
     * @param x: An integer
     * @return: nothing
     */
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public void push(int x) {
        q1.add(x);
    }

    /*
     * @return: nothing
     */
    public void pop() {
        if (q1.isEmpty()){
            Queue temp = q1;
            q1 = q2;
            q2 = temp;
        }
        while (q1.size() > 1){
            q2.add(q1.poll());
        }
        q1.poll();
    }

    /*
     * @return: An integer
     */
    public int top() {
        if (q1.isEmpty()){
            Queue temp = q1;
            q1 = q2;
            q2 = temp;
        }
        while (q1.size() > 1){
            q2.add(q1.poll());
        }
        return q1.peek();
    }

    /*
     * @return: True if the stack is empty
     */
    public boolean isEmpty() {
        return q1.isEmpty() && q2.isEmpty();
    }
}