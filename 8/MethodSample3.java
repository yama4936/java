public class MethodSample3 {
    static int[] add(int array1[], int array2[]) {
        int d = array1.length;
        if (d > array2.length)
            d = array2.length;
        int array[] = new int[d];
        // ここは、array1[i]と array2[i]の和を array[i]に代入し、array を返す
        for (int i = 0; i < array.length; i++) {
            array[i] = array1[i] + array2[i];

        }
        return array;
    }

    public static void main(String args[]) {
        int data1[] = { 9, 6, 5, 2, 1 };
        int data2[] = { 1, 4, 5, 8, 9 };
        int data[];
        // ここは、addメソッドを呼び出す
        data = add(data1, data2);
        for (int n : data) {
            System.out.print(n + " ");
        }
    }
}
