public class ssss {
    public static void main(String[] args) {
        final double X1 = 1.0, X2 = 3.0;
        final double Y1 = 4.0, Y2 = 8.0;
        final double dx = 0.00025, dy = 0.00025;
        double s, r, yc = Y2 - Y1;
        double ySum;
        long start, stop;

        System.out.println("Part1");
        s = 0;
        start = System.currentTimeMillis();
        for (double x = X1; x < X2; x = x + dx) {
            for (double y = Y1; y < Y2; y = y + dy) {
                s = s + (Math.pow(x, 7) + 7 * Math.pow(x, 2) - Math.pow(y, 3) - 5 * Math.pow(y, 2) - y - 6) * dx * dy;
            }
        }

        stop = System.currentTimeMillis();
        System.out.printf("%.2f%n", s);
        System.out.println((stop - start) + "ミリです");
        System.out.println();

        System.out.println("Part2");
        s = 0;
        start = System.currentTimeMillis();
        ySum = 0;
        for (double y = Y1; y < Y2; y += dy) {
            ySum += (-(y + 5) * (y * (y - 1)));
        }
        ySum *= dy;

        for (double x = X1; x < X2; x += dx) {
            r = x * x;
            s += ((((r * r * x) + 7) * r - 6) * yc + ySum);
        }
        s *= dx;

        stop = System.currentTimeMillis();
        System.out.printf("%.2f%n", s);
        System.out.println((stop - start) + "ミリです");
        System.out.println();
    }

}