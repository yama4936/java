public class MethodSample {
    // ここはaddメソッドの定義を追加
    static double add(double a, double b) {
        return a + b;
    }

    public static void main(String args[]) {
        System.out.println("結果：" + add(2.7, 3.3));
        System.out.println("結果：" + add(5.1, 7.4));
    }
}