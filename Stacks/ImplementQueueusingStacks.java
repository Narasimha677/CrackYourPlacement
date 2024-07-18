package Stack;

import java.util.Stack;

public class ImplementQueueusingStacks {
    Stack<Integer> first;
    Stack<Integer> second;

    public ImplementQueueusingStacks() {
        first =new Stack<Integer>();
        second =new Stack<Integer>();

    }

    public void push(int x) {
        while(!first.empty()){
            second.push(first.pop());
        }
        first.push(x);
        while(!second.empty()){
            first.push(second.pop());
        }

    }

    public int pop() {
        return first.pop();
    }

    public int peek() {
        return first.peek();
    }

    public boolean empty() {
        return first.empty();
    }

}
