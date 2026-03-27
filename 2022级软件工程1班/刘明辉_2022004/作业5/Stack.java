/**
 * 作业5 - 基于数组的栈实现
 * 学生：刘明辉 2022004
 */
public class Stack {
    private int[] elements;
    private int top;
    private static final int DEFAULT_CAPACITY = 10;

    public Stack() {
        elements = new int[DEFAULT_CAPACITY];
        top = -1;
    }

    public void push(int element) {
        if (top == elements.length - 1) {
            resize();
        }
        elements[++top] = element;
    }

    private void resize() {
        int[] newArray = new int[elements.length * 2];
        System.arraycopy(elements, 0, newArray, 0, elements.length);
        elements = newArray;
    }

    public int pop() {
        if (top == -1) {
            throw new RuntimeException("栈为空，无法弹出元素");
        }
        return elements[top--];
    }

    public int peek() {
        if (top == -1) {
            throw new RuntimeException("栈为空");
        }
        return elements[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    @Override
    public String toString() {
        if (isEmpty()) return "[]";
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i <= top; i++) {
            sb.append(elements[i]);
            if (i < top) sb.append(", ");
        }
        return sb.append("]").toString();
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        for (int i = 1; i <= 5; i++) {
            stack.push(i * 10);
        }
        System.out.println("栈内容: " + stack);
        System.out.println("栈顶: " + stack.peek());
        System.out.println("弹出: " + stack.pop());
        System.out.println("弹出后大小: " + stack.size());
    }
}