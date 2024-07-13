class Employee {
    protected String name;
    protected int age;

    public void setEmployee(String aName, int anAge) {
        name = aName;
        age = anAge;
    }

    public void display() {
        System.out.println("名前：" + name);
        System.out.println("年齢：" + age);
    }
}

// <-- NewEmployeeクラスの定義を追加
class NewEmployee extends Employee {

    protected String money;

    public void setEmployee(String aName, int anAge, String amoney) {
        name = aName;
        age = anAge;
        money = amoney;
    }

    public void display() {
        System.out.println("名前：" + name);
        System.out.println("年齢：" + age);
        System.out.println("給料：" + money);
    }

}

public class EmployeeSample {
    public static void main(String args[]) {
        NewEmployee obj = new NewEmployee(); // サブクラスのオブジェクトを生成
        // オーバーロードした setEmployee( )を呼び出す
        obj.setEmployee("Meidai Hanako", 20, " ¥¥250000");
        obj.display(); // オーバーライドした display( )を呼び出す
    }
}