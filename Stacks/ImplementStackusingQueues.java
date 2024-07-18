package Stack;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackusingQueues {
    Queue<Integer> first;
    Queue<Integer> second;

    public ImplementStackusingQueues() {
        first = new LinkedList<>();
        second = new LinkedList<>();
    }

    public void push(int x) {
        while(!first.isEmpty()){
            second.add(first.remove());
        }
        first.add(x);
        while(!second.isEmpty()){
            first.add(second.remove());
        }

    }

    public int pop() {
        return first.remove();
    }

    public int top() {
        return first.peek();
    }

    public boolean empty() {
        return first.isEmpty();
    }

}
