public class CmdArgs {
    public static void main(String args[]) {
        // コマンドライン引数の数をもとめる
        System.out.println("Number of args = " + args.length);
        for (int i = 0; i < args.length; i++) { // コマンドライン引数を表示する
            System.out.println("args[" + i + "] = " + args[i]);
        }
    }
}
