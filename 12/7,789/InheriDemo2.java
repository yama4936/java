class Person { // スーパークラス
    private String name;

    public void setName(String s) {
        name = s;
    } // セッター

    public String getName() {
        return name;
    } // ゲッター

    public String whoAreYou() {
        return "人";
    }

    public String toString() { // Object クラスのメソッドをオーバーライド
        return getName() + "です\n" + whoAreYou() + "でよかった！\n";
    }
}

class Student extends Person { // サブクラス
    private String studentNumber;

    public void setStudentNumber(String s) {
        studentNumber = s;
    } // セッター

    public String getStudentNumber() {
        return studentNumber;
    }// ゲッター

    public String whoAreYou() {
        return "学生";
    } // スーパークラスのメソッドをオーバーライド

    public String toString() { // スーパークラスのメソッドをオーバーライド
        return "学生番号は" + getStudentNumber() + "です\n"
                + getName() + "です\n" + whoAreYou() + "でよかった！\n";
    }
}

public class InheriDemo2 {
    public static void main(String args[]) {
        Student obj = new Student(); // サブクラスのオブジェクトを生成
        obj.setName("Akira");
        obj.setStudentNumber("h00200");
        System.out.println(obj); // System.out.println (obj.toString( ))と同様
    }
}