import java.util.Objects;
import java.util.Stack;

public class MyQueue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public MyQueue() {
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }
    private void stack2ToStack1(){
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
    }
    /*
     * @param element: An integer
     * @return: nothing
     */
    public void push(int element) {
        stack2.push(element);
    }

    /*
     * @return: An integer
     */
    public int pop() {
        while(stack1.isEmpty()){
            this.stack2ToStack1();
        }
        return stack1.pop();
    }

    /*
     * @return: An integer
     */
    public int top() {
        while(stack1.isEmpty()){
            this.stack2ToStack1();
        }
        return stack1.peek();
    }
}