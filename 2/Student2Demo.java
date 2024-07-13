class Student2 {
    String studentNumber;
    String name;

    // データを出力するメソッド
    void speak() {
        System.out.println(studentNumber + "の" + name + "です");
    }
}

public class Student2Demo {
    public static void main(String args[]) {
        // 新しいオブジェクトを２個生成
        Student2 a = new Student2();
        Student2 b = new Student2();
        // a のフィールドに値を代入
        a.studentNumber = "H101000";
        a.name = "Chukyo Taro";
        // b のフィールドに値を代入
        b.studentNumber = "H102000";
        b.name = "Chukyo Jiro";
        a.speak(); // データを出力するメソッドを呼び出す

        b.speak(); // データを出力するメソッドを呼び出す
    }
}
