/**
 * 作业1：单链表实现
 * 学生姓名：黄三
 * 学号：2022003
 */
public class LinkedList {

    // 思路：双指针定位前驱节点

    static class Node {
        int val;
        Node next;
        Node(int v) { val = v; next = null; }
    }

    private Node head;

    public void add(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            return;
        }
        Node cur = head;
        while (cur.next != null) cur = cur.next;
        cur.next = node;
    }

    public boolean remove(int val) {
        if (head == null) return false;
        if (head.val == val) {
            head = head.next;
            return true;
        }
        Node cur = head;
        while (cur.next != null) {
            if (cur.next.val == val) {
                cur.next = cur.next.next;
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    public void print() {
        Node cur = head;
        StringBuilder sb = new StringBuilder();
        while (cur != null) {
            sb.append(cur.val);
            if (cur.next != null) sb.append(" -> ");
            cur = cur.next;
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1); list.add(2); list.add(3);
        list.print();          // 1 -> 2 -> 3
        list.remove(2);
        list.print();          // 1 -> 3
    }
}
