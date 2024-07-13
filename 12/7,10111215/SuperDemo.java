class Person {
    private String name;

    public Person(String aName) { // Person クラスのコンストラクタ
        name = aName;
        if (name.length() == 0)
            System.out.println("エラー");
    }

    public void setName(String aName) {
        if (aName.length() > 0)
            name = aName;
        else
            name = "unknown";
    }

    public String getName() {
        return name;
    }

    public String whoAreYou() {
        return "人";
    }

    public String toString() {
        return getName() + "です\n" + whoAreYou() + "でよかった！\n";
    }
}

class Teacher extends Person {
    private String teacherNumber;

    public void setTeacherNumber(String asetTeacherNumber) {
        teacherNumber = asetTeacherNumber;
    };

    public void getTeacherNumber(String agetTeacherNumber) {
        teacherNumber = agetTeacherNumber;
    };

    public String whoAreYou() {
        return "先生";
    };

    public String toString() {
        return "先生番号";
    }
}

class TeacherSample(){

    public static void main(String args[]) {
        Student obj = new Teacher(String a);
        System.out.println(obj.toString());
        // System.out.println( obj.toString( ) ) と同様

    }
}

class Student extends Person {
    private String studentNumber;

    public Student(String aName, String aStudentNumber) { // Student クラスのコンストラクタ
        super(aName); // スーパークラスのコンストラクタを呼び出す
        setStudentNumber(aStudentNumber);
    }

    public void setStudentNumber(String str) {
        if (str.length() > 0)
            studentNumber = str;
        else
            studentNumber = "unknown";
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public String whoAreYou() {
        return "学生";
    } // スーパークラスのメソッドをオーバーライド

    public String toString() { // スーパークラスのメソッドをオーバーライド
        return "学生番号は" + getStudentNumber() + "です\n" + super.toString(); // オーバーライドされたスーパークラスのメソッドを呼び出す
    }
}

public class SuperDemo {
    public static void main(String args[]) {
        Student obj = new Student("Akira", "h00200");
        System.out.println(obj);
        // System.out.println( obj.toString( ) ) と同様
    }
}
