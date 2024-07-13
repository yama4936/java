public class MaxDemo {
    // 以下は maximum( )メソッドの定義を追加
    static int maximum(int a[]) {
        int x = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1]) {
                a[i] = a[i - 1];
            }
            x = a[i];
        }
        return x;
    }

    public static void main(String args[]) {
        int a[] = { 10, 20, 50, 15, 5, 40, 35 };
        int b[] = { -10, -20, -50, -15, -5, -40, -35, -60 };
        System.out.println(maximum(a));
        System.out.println(maximum(b));
    }
}
