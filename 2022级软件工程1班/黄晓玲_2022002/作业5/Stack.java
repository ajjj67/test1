import java.util.ArrayList;

/**
 * 作业5 - 栈的实现
 * 学生：黄晓玲 2022002
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
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("栈顶元素: " + stack.peek());
        System.out.println("弹出: " + stack.pop());
        System.out.println("大小: " + stack.getSize());
        System.out.println("是否为空: " + stack.isEmpty());
    }
}