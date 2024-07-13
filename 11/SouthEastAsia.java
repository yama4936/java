
//T323015 岩崎　琢磨 T323052 中嶋恵大 T323088 山田康太
public class SouthEastAsia {
    public static void main(String[] args) {
        int n[] = { 2, 7, 99, 2, 3, 99, 99};
        double num = 2, max = n[0], min = n[0], cn1 = 1, cn2 = 1, avg;
        int i;
        for (i = 1; i < n.length; i++) {
            num = num + n[i];
            if (max < n[i]) {
                cn1 = 0;
                max = n[i];
            }
            if (max == n[i]) {
                cn1++;
            }

            if (min > n[i]) {
                cn2 = 0;
                min = n[i];
            }
            if (min == n[i]) {
                cn2++;
            }
        }
        num = num - max * cn1 - min * cn2;
        avg = num / (i - cn1 - cn2);
        System.out.println("平均:"+avg);

    }
}