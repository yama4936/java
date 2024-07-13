public class MethodSample1 {

    void check(int a, int... n) {
        int x = 0;
        for (int i = 0; i < n.length; i++) {
            x += n[i]; // 個々の要素を加算する
        }
        if (a < x) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static void main(String[] args) {
        MethodSample obj = new MethodSample();
        obj.check(5, 1, 2, 3); // 呼び出し例
    }
}
