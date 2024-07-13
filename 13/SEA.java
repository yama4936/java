//T323015 岩崎　琢磨 T323052 中嶋恵大 T323088 山田康太
public class SEA {
    public static void main(String[] args) {

        String strA = args[0];
        String strB = args[1];

        // 繰り上げ対策の+!
        int[] retu1 = new int[strA.length() + 1]; // 長さ分の配列を確保
        int[] retu2 = new int[strB.length() + 1]; // 長さ分の配列を確保
        int[] sum = new int[strA.length() + strB.length() + 1]; // 合わせた長さ分の配列を確保

        int lenA = strA.length();
        int lenB = strB.length();

        // 文字列を逆順にして各桁を配列に格納
        for (int i = 0; i < lenA; i++) {
            retu1[i] = Character.getNumericValue(strA.charAt(lenA - 1 - i));
        }

        for (int i = 0; i < lenB; i++) {
            retu2[i] = Character.getNumericValue(strB.charAt(lenB - 1 - i));
        }

        int maxLen = Math.max(lenA, lenB);

        for (int i = 0; i < maxLen; i++) {
            for (int j = 0; j < maxLen; j++) {

                sum[i + j] += retu1[j] * retu2[i]; // sumに掛け算した値を代入

                while (sum[i + j] >= 10) { // 繰り上げの値が10以下になるまで+1に追加
                    sum[i + j] -= 10;
                    sum[i + j + 1] += 1;

                }
            }
        }

        // 結果を表示
        boolean leadingZero = true;
        for (int i = sum.length - 1; i >= 0; i--) {
            if (leadingZero && sum[i] == 0) { // 桁が0の時は表示しない
                continue;
            }
            leadingZero = false;

            System.out.print(sum[i]);
        }

    }
}
