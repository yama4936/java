class Hello {
    protected String name; // サブクラス及び同一パッケージからアクセス可能

    public void hello() {
        System.out.println("Hello " + name);
    }
}

// Hello クラスの元で Greeting クラスを継承し、bye( )メソッドを定義する
class Greeting extends Hello {
    public void bye() {
        System.out.println("bye" + name);
    }
}

public class InheriSample {
    public static void main(String args[]) {
        Greeting obj = new Greeting();
        obj.name = "Java";
        obj.hello();
        obj.bye();
    }
}
