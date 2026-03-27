/**
 * 作业3：设计模式 —— 策略模式
 * 学生姓名：刘四
 * 学号：2022004
 */
interface SortStrategy {
    void sort(int[] arr);
}

class BubbleSort implements SortStrategy {
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - 1 - i; j++)
                if (arr[j] > arr[j + 1]) { int t = arr[j]; arr[j] = arr[j+1]; arr[j+1] = t; }
    }
}

class SelectionSort implements SortStrategy {
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[minIdx]) minIdx = j;
            int t = arr[i]; arr[i] = arr[minIdx]; arr[minIdx] = t;
        }
    }
}

class Sorter {
    private SortStrategy strategy;
    public Sorter(SortStrategy s) { this.strategy = s; }
    public void sort(int[] arr) { strategy.sort(arr); }
}

public class Strategy {
    public static void main(String[] args) {
        int[] data = {5, 3, 8, 1, 9, 2};
        new Sorter(new BubbleSort()).sort(data);
        for (int x : data) System.out.print(x + " ");
    }
}
