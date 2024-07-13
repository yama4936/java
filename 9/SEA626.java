class Block {
    int area; // 長方形の面積を格納するフィールド

    int setBlock() {

        int a = (int) (11 * Math.random());
        int b = (int) (11 * Math.random());
        area = a * b;

        System.out.println("a " + a + "," + "b " + b);

        return area;
    }

    // ここで sameArea( )メソッドの定義を追加
    boolean sameArea(Block obj) {
        if (obj.area == area)
            return true;
        else
            return false;

    }
}

public class SEA626 {
    public static void main(String args[]) {
        boolean flag = false;
        Block[] obj = new Block[10];

        for (int i = 0; i < 10; i++) {

            obj[i] = new Block();
            obj[i].setBlock();
        }
        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (obj[i].sameArea(obj[j])) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }
        }

        if (flag == true) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
