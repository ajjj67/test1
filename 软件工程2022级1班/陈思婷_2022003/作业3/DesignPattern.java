/**
 * 作业3：设计模式 —— 观察者模式
 * 学生姓名：黄三
 * 学号：2022003
 */
import java.util.ArrayList;
import java.util.List;

interface Observer { void update(String event); }

class EventBus {
    private final List<Observer> observers = new ArrayList<>();
    public void subscribe(Observer o) { observers.add(o); }
    public void publish(String event) {
        for (Observer o : observers) o.update(event);
    }
}

public class Observer {
    public static void main(String[] args) {
        EventBus bus = new EventBus();
        bus.subscribe(e -> System.out.println("Logger: " + e));
        bus.subscribe(e -> System.out.println("Auditor: " + e));
        bus.publish("USER_LOGIN");
        bus.publish("DATA_CHANGED");
    }
}
