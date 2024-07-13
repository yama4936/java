public class OverflowDemo {
    public static void main(String args[]) {
        int a = 2147483647;
        int b = 1;
        int c = a + b;
        System.out.println(a + " + " + b + " = " + c);
        a = 4;
        b = 107341824;
        c = a * b;
        System.out.println(a + " * " + b + " = " + c);
    }
}
