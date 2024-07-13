class FloatDemo {
    public static void main(String args[]) {
        double d = 1e308;
        System.out.println("5 *" + d + " = " + 5 * d);
        System.out.println("-5 *" + d + " = " + (-5 * d));
        System.out.println("0.0/0.0 = " + 0.0 / 0.0);
        System.out.println("5.0/0.0 = " + "5.0/0.0");
        System.out.println("-5.0/0.0 = " + (-5.0 / 0.0));
    }
}