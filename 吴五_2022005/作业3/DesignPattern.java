/**
 * 作业3：设计模式 —— 装饰器模式
 * 学生姓名：吴五
 * 学号：2022005
 */
interface TextProcessor { String process(String text); }

class PlainText implements TextProcessor {
    public String process(String text) { return text; }
}

class UpperCaseDecorator implements TextProcessor {
    private final TextProcessor wrapped;
    public UpperCaseDecorator(TextProcessor p) { this.wrapped = p; }
    public String process(String text) { return wrapped.process(text).toUpperCase(); }
}

class TrimDecorator implements TextProcessor {
    private final TextProcessor wrapped;
    public TrimDecorator(TextProcessor p) { this.wrapped = p; }
    public String process(String text) { return wrapped.process(text).trim(); }
}

public class Decorator {
    public static void main(String[] args) {
        TextProcessor p = new UpperCaseDecorator(new TrimDecorator(new PlainText()));
        System.out.println(p.process("  hello world  "));  // HELLO WORLD
    }
}
