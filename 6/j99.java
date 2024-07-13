public class j99 {
    public static void main(String args[]) {

        double ans = 1;
        double n = 60;
        double r = 20;
        for (int i = 0; i < r; i++) {
            ans *= (n - i) / (r - i);
            System.out.println((n - i) + " " + (r - i));
            System.out.println(String.format("%.0f", ans));
        }
    }
}