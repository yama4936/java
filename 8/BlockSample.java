class Block {
    int area; // 長方形の面積を格納するフィールド

    void setBlock(int a, int b) {
        x = a;
        y = b;
        area = x * y;
    }

    // ここで sameArea( )メソッドの定義を追加
    boolean sameArea(Block obj) {
        if (obj.area == area)
            return true;
        else
            return false;
    }
}

public class BlockSample {
    public static void main(String args[]) {
        Block[] obj1 = new Block[10];
        Block[] obj2 = new Block[10];
        for (int i = 0; i < 10; i++) {
            obj1[i].setBlock((int) (11 * Math.random()));
            obj2[i].setBlock((int) (11 * Math.random()));

            System.out.println("obj1 は obj2 と一致する：" + obj1[i].sameBlock(obj2));
            // obj1.sameBlock(obj2)は obj1 と obj2 のサイズを比べる
            // obj2.sameBlock(obj1)のように書いても良い
            System.out.println("obj1 は obj2 と同じ面積を持つ：" + obj1[i].sameArea(obj2));
            // obj1.sameArea(obj2)は obj1 と obj2 の面積を比べる
            // obj2.sameArea(obj1) のように書いても良い
        }

    }
}
