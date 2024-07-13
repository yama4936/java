public class fanal {
    public static final double FEET_PER_METER = 3.28;

    public static void main(String args[]) {
        final int N = 10;
        int i;
        System.out.println("Conversion Table");
        for (i = 0; i < N; i++) {
            System.out.printf("%2d meter = %5.2f feet\n", i, FEET_PER_METER * i);
        }
    }
}