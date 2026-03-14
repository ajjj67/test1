/**
 * 作业2：二叉搜索树（BST）
 * 学生姓名：陈一
 * 学号：2022001
 */
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

    // 中序遍历：左-根-右（得到有序序列）

    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int v) { val = v; }
    }

    private TreeNode root;

    public void insert(int val) {
        root = insertRec(root, val);
    }

    private TreeNode insertRec(TreeNode node, int val) {
        if (node == null) return new TreeNode(val);
        if (val < node.val)      node.left  = insertRec(node.left,  val);
        else if (val > node.val) node.right = insertRec(node.right, val);
        return node;
    }

    public boolean search(int val) {
        TreeNode cur = root;
        while (cur != null) {
            if      (val == cur.val) return true;
            else if (val <  cur.val) cur = cur.left;
            else                     cur = cur.right;
        }
        return false;
    }

    public void inorder() {
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(TreeNode node) {
        if (node == null) return;
        inorderRec(node.left);
        System.out.print(node.val + " ");
        inorderRec(node.right);
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        int[] nums = {5, 3, 7, 1, 4, 6, 8};
        for (int n : nums) bst.insert(n);
        bst.inorder();                      // 1 3 4 5 6 7 8
        System.out.println(bst.search(4));  // true
        System.out.println(bst.search(9));  // false
    }
}
