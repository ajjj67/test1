/**
 * 作业3：设计模式 —— 单例模式
 * 学生姓名：陈一
 * 学号：2022001
 */
public class Singleton {
    private static volatile Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) instance = new Singleton();
            }
        }
        return instance;
    }

    public void doWork() { System.out.println("Singleton working"); }

    public static void main(String[] args) {
        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();
        System.out.println(a == b);  // true
        a.doWork();
    }
}
