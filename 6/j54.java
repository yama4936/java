public class j54 {
    public static void main(String args[]) {
        int a[] = { 12, 4, 59, 33, 2 };
        int b[] = { 24, 6, 5, 18, 22 };
        int c[] = new int[a.length];
        int d[] = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] - b[i];
            d[i] = a[i] * b[i];
            System.out.println(c[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {

            System.out.print(d[i] + " ");
        }

    }
}
