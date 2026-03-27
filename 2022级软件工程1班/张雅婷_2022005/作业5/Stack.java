import java.util.LinkedList;
import java.util.Deque;

/**
 * 作业5 - 使用双端队列实现栈
 * 学生：张雅婷 2022005
 */
public class Stack {
    private Deque<Integer> deque;

    public Stack() {
        deque = new LinkedList<>();
    }

    public void push(int value) {
        deque.push(value);
    }

    public int pop() {
        if (deque.isEmpty()) {
            throw new IllegalStateException("Stack underflow: cannot pop from empty stack");
        }
        return deque.pop();
    }

    public int peek() {
        if (deque.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return deque.peek();
    }

    public boolean isEmpty() {
        return deque.isEmpty();
    }

    public int size() {
        return deque.size();
    }

    public static void main(String[] args) {
        Stack myStack = new Stack();
        myStack.push(100);
        myStack.push(200);
        myStack.push(300);
        System.out.println("Size: " + myStack.size());
        System.out.println("Peek: " + myStack.peek());
        System.out.println("Pop: " + myStack.pop());
        System.out.println("After pop, size: " + myStack.size());
        System.out.println("Is empty: " + myStack.isEmpty());
    }
}