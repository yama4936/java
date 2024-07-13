public class Add {
    public static void main(String args[]) {
        if (args.length < 2) {

            System.out.println("警告");

        } else {
            int a = Integer.parseInt(args[0]); // 第 0 引数
            int b = Integer.parseInt(args[1]); // 第 1 引数
            /*
             * if ( args[0] == null || args[1] == null){
             * System.out.println("警告");
             * }
             */
            System.out.println(a + " + " + b + " = " + (a + b));
        }
    }
}