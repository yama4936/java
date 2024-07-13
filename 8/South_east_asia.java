public class South_east_asia {
    public static void main(String[] args) {
        int a[] = { 586, 583, 591, 590, 589, 585, 571, 570, 572, 572, 575, 583, 578, 602, 603, 607, 597, 595, 599,
                598 };

        int maxprofit = 0;
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            int profit = a[i] - min;

            if (maxprofit < profit) {
                maxprofit = profit;
            }
            if (profit < 0) {
                min = a[i];
            }
            // System.out.println("現在の利益: " + profit);
            // System.out.println("最小価格: " + min);
            // System.out.println("最大利益: " + maxprofit);
        }
        System.out.println("最大利益は: " + maxprofit);
    }
}
