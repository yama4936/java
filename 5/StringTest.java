public class StringTest {
    public static void main(String args[]) {
        String str = "I am a nice string";
        String s;
        int i;
        // 文字列の長さを求める
        i = str.length();
        // 文字列の長さを表示する
        System.out.println(i);
        // 小文字を大文字に変換する
        s = str.toUpperCase();
        // 変換後の文字列を表示する
        System.out.println(s);

    }
}
