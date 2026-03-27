import java.util.ArrayList;

/**
 * 作业5 - 栈
 * 学生：陈思婷 2022003
 */
public class Stack {
    private ArrayList<Integer> data;
    private int size;

    public Stack() {
        data = new ArrayList<Integer>();
        size = 0;
    }

    public void push(int value) {
        data.add(value);
        size++;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        int top = data.get(size - 1);
        data.remove(size - 1);
        size--;
        return top;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return data.get(size - 1);
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println("Top: " + s.peek());
        System.out.println("Pop: " + s.pop());
        System.out.println("Size: " + s.getSize());
        System.out.println("Empty: " + s.isEmpty());
    }
}