public class SEA517 {
    public static void main(String[] args) {
        final int N = 20;
        int a = 1, b = 1;
        System.out.println(1 + " : " + a);
        for (int i = 2; i <= N; i++) {
            if (a <= b) {
                a = a + b;
                System.out.println(i + " : " + b);
            } else {
                b = a + b;
                System.out.println(i + " : " + a);
            }
        }
    }
}
