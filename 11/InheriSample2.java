class Hello2 {
    private String name; // 外部クラスから直接アクセス不能

    public void setName(String a) {
        name = a;
    } // セッター

    public String getName() {
        return name;
    } // ゲッター

    public void hello() {
        System.out.println("Hello " + name);
    }
}

// Hello2 クラスの元で Greeting2 クラスを継承し、bye( )メソッドを定義する
class Greeting2 extends Hello2 {
    public void bye() {
        System.out.println("bye" + getName());
    }
}

public class InheriSample2 {
    public static void main(String args[]) {
        Greeting2 obj = new Greeting2();
        obj.setName("Java");
        obj.hello();
        obj.bye();
    }
}