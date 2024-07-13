import java.util.Random;

public class SEA625 {
    public static void main(String[] args) {
        final int leftlimit = 50, rightlimit = 100, N = 10;
        Random rand = new Random();
        int i, s = 0, z = 0;
        for (i = 0; i < N; i++) {
            int a = rand.nextInt(leftlimit) + rightlimit - leftlimit;
            s = s + a;
            z = z + (int) Math.pow(a, 2);
        }
        int avg = s / i;
        double hensa = Math.sqrt((z + 10 * avg * avg - 2 * avg * s) / i);
        System.out.println("平均値:" + avg);
        System.out.println("標準偏差:" + hensa);
    }
}