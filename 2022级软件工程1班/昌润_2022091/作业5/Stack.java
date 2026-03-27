/**
 * 作业5 - 简单栈
 * 学生：昌润 2022091
 */
public class Stack {
    private int[] arr;
    private int count;

    public Stack(int cap) {
        arr = new int[cap];
        count = 0;
    }

    public void push(int x) {
        arr[count++] = x;
    }

    public int pop() {
        return arr[--count];
    }

    public int top() {
        return arr[count - 1];
    }

    public boolean empty() {
        return count == 0;
    }

    public static void main(String[] args) {
        Stack st = new Stack(20);
        st.push(5);
        st.push(15);
        System.out.println(st.top());
        System.out.println(st.pop());
        System.out.println(st.empty());
    }
}