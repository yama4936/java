//T323015 岩崎　琢磨 T323052 中嶋恵大 T323088 山田康太

public class South_east_asia {
    public static void main(String[] args) {
        final double X1 = 1.0, X2 = 3.0;
        final double Y1 = 4.0, Y2 = 8.0;
        final double dx = 0.00025, dy = 0.00025;
        double s;
        long start, stop;

        System.out.println("Part1");
        s = 0;
        start = System.currentTimeMillis();
        for (double x = X1; x < X2; x += dx) {
            for (double y = Y1; y < Y2; y += dy) {
                s += (Math.pow(x, 7) + 7 * Math.pow(x, 2) - Math.pow(y, 3) - 5 * Math.pow(y, 2) - y - 6) * dx * dy;
            }
        }
        stop = System.currentTimeMillis();
        System.out.printf("%.2f%n", s);
        System.out.println((stop - start) + "ミリです");
        System.out.println();

        System.out.println("Part3");
        double s_x = 0; // xに関する部分の合計
        double s_y = 0; // yに関する部分の合計
        start = System.nanoTime();

        // xに関する部分の計算
        for (double x = X1; x < X2; x += dx) {

            s_x += ((x * x * x * x * x * x * x + 7 * x * x));
        }

        // yに関する部分の計算
        for (double y = Y1; y < Y2; y += dy) {
            s_y += (-1 * (y * (y * y + 5 * y + 1)));
        }

        // 結果の合算
        double result = ((s_x * ((Y2 - Y1) / dx)) + (s_y * ((X2 - X1) / dx))) * dx * dy;

        stop = System.nanoTime();
        System.out.printf("%.2f%n", result);
        System.out.println((stop - start) / 1_000_000.0 + " ミリ秒です");
        System.out.println();
        System.out.println(s_x);
        System.out.println(s_y);

    }
}
