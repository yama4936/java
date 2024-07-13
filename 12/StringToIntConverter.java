public class StringToIntConverter {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("数字を含む文字列を引数として指定してください。");
            return;
        }

        String inputString = args[0];

        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);

            // 数字の文字をintに変換
            if (Character.isDigit(ch)) {
                int num = Character.getNumericValue(ch);
                System.out.println("文字: " + ch + " 数字: " + num);
            } else {
                System.out.println("文字: " + ch + " は数字ではありません。");
            }
        }
    }
}
