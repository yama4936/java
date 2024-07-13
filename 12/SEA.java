public class SEA {
    public static void main(String[] args) {

        String strA = args[0];
        String strB = args[1];

        int[] amari1 = new int[strA.length()];
        int[] amari2 = new int[strB.length()];
        int[] sum = new int[Math.max(strA.length(), strB.length()) + 1];

        int lenA = strA.length();
        int lenB = strB.length();

        if (lenA < lenB) {
            int len = lenB - lenA;
            System.out.println(strA);
            for (int i = 0; i < len; i++) {
                System.out.printf(" ");
            }
            System.out.println(strB);
            for (int i = 0; i < lenB; i++) {
                System.out.printf("-");
            }
            System.out.println(" ");
        } else {
            int len = lenA - lenB;
            for (int i = 0; i < len; i++) {
                System.out.printf(" ");
            }
            System.out.println(strB);
            System.out.println(strA);
            for (int i = 0; i < lenA; i++) {
                System.out.printf("-");
            }
            System.out.println(" ");
        }

        // 文字列を逆順にして各桁を配列に格納
        for (int i = 0; i < lenA; i++) {
            amari1[i] = Character.getNumericValue(strA.charAt(lenA - 1 - i));
        }

        for (int i = 0; i < lenB; i++) {
            amari2[i] = Character.getNumericValue(strB.charAt(lenB - 1 - i));
        }

        int maxLen = Math.max(lenA, lenB);

        for (int i = 0; i < maxLen; i++) {
            if (i < lenA) {
                sum[i] += amari1[i];
            }
            if (i < lenB) {
                sum[i] += amari2[i];
            }
            if (sum[i] >= 10) {
                sum[i] -= 10;
                sum[i + 1] += 1;
            }
        }

        // 結果を表示
        boolean leadingZero = true;
        for (int i = sum.length - 1; i >= 0; i--) {
            if (leadingZero && sum[i] == 0) {
                continue;
            }
            leadingZero = false;

            System.out.print(sum[i]);
        }

    }
}
