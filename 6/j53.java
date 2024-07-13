public class j53 {
    public static void main(String args[]) {

        int a[] = { -12, -4, -59, -33, -2 };
        int x = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1]) {
                a[i] = a[i - 1];
            }
            x = a[i];
        }
        System.out.println(x);

    }
}
