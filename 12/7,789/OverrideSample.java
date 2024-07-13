class Greeting { // スーパークラス
    private String name;

    public void setName(String a) {
        name = a;
    }

    public String getName() {
        return name;
    }

    public void hello() {
        System.out.println("Hello " + name);
    }

    public void bye() {
        System.out.println("Goodbye " + name);
    }
}

// <-- Aisatsuクラスの定義を追加
class Aisatsu extends Greeting {

    public void hello() {
        System.out.println(getName() + "こんにちは");
    }

    public void bye() {
        System.out.println(getName() + "こんばんは");
    }

}

class OverrideSample {
    public static void main(String args[]) {
        Aisatsu obj = new Aisatsu(); // サブクラスのオブジェクトを生成
        obj.setName("Java"); // スーパークラスの setName( )を呼び出す
        obj.hello(); // オーバーライドした hello( )を呼び出す
        obj.bye(); // オーバーライドした bye( )を呼び出す
    }
}
