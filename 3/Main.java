import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("学籍番号を入力してください");
        String studentNumber = sc.next();
        System.out.println("名前を入力してください");
        String name = sc.next();
        System.out.println(studentNumber + "　:　" + name);
    }
}