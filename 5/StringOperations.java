public class StringOperations {
    public static void main(String[] args) {
        // String変数の宣言と初期化
        String a;
        char s;
        String s1 = "hello";
        String s2 = "Hello";

        // equalsIgnoreCaseメソッドの使用
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("s1 and s2 are equal ignoring case.");
        }

        // charAtメソッドの使用
        int i = 1;
        char c = s1.charAt(i);
        System.out.println("Character at position " + i + " in s1: " + c);

        // concatメソッドの使用
        String s3 = s1.concat(s2);
        System.out.println("Concatenated string: " + s3);

        // trimメソッドの使用
        String s4 = "  hello  ";
        String s5 = s4.trim();
        System.out.println("Trimmed string: '" + s5 + "'");

        // replaceメソッドの使用
        String s6 = s1.replace('a', 'A');
        System.out.println("Replaced string: " + s6);
    }
}
