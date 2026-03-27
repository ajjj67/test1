/**
 * 作业3：设计模式 —— 工厂模式
 * 学生姓名：林二
 * 学号：2022002
 */
interface Shape { void draw(); }

class Circle implements Shape {
    public void draw() { System.out.println("Drawing Circle"); }
}

class Rectangle implements Shape {
    public void draw() { System.out.println("Drawing Rectangle"); }
}

class ShapeFactory {
    public static Shape create(String type) {
        return switch (type.toLowerCase()) {
            case "circle"    -> new Circle();
            case "rectangle" -> new Rectangle();
            default -> throw new IllegalArgumentException("Unknown: " + type);
        };
    }
}

public class Factory {
    public static void main(String[] args) {
        Shape s1 = ShapeFactory.create("circle");
        Shape s2 = ShapeFactory.create("rectangle");
        s1.draw();  // Drawing Circle
        s2.draw();  // Drawing Rectangle
    }
}
