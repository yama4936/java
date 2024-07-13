public class SEA614 {
    public static void main(String[] args) {
        long[] a = bionomialCoefficients(Integer.parseInt(args[0]));
        for (int i = 0; a.length > i; i++) {
            System.out.println(a[i]);
        }
    }

    static long[] bionomialCoefficients(int n) {
        long[][] conbi = new long[n + 1][n + 1];

        // こっからコンビネーション
        for (int i = 0; i <= n; i++) {
            for (int r = 0; r <= i; r++) {
                if (r == 0 || r == i) {
                    conbi[i][r] = 1;
                } else {
                    if (IsAdditionOverflow(conbi[i - 1][r], conbi[i - 1][r - 1]))
                        conbi[i][r] = -1;
                    else {
                        conbi[i][r] = conbi[i - 1][r] + conbi[i - 1][r - 1];
                    }
                }
            }
        }
        return conbi[n];

    }

    static boolean IsAdditionOverflow(long a, long b) {
        return ((a == -1 || b == -1) || (Long.MAX_VALUE - a < b) || (Long.MAX_VALUE - b < a));
    }
}