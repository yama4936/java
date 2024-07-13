class Block {
    private int x, y, area; // プライベートフィールド

    public Block(int x, int y) { // コンストラクタ1
        if (test(x, y)) {
            this.x = x;
            this.y = y; // 引数をフィールドに代入
            area = x * y;
        } else {
            System.out.println("エラー");
            System.exit(1); // プログラム終了
        }
    }

    public Block() { // コンストラクタ2
        this(0, 0); // コンストラクタ1を呼び出す
    }

    public void setBlock(int x, int y) { // セッター
        if (test(x, y)) {
            this.x = x;
            this.y = y; // 引数をフィールドに代入
            area = x * y;
        } else
            System.out.println("エラー");
    }

    public int getX() {
        return x;
    } // ゲッター

    public int getY() {
        return y;
    } // ゲッター

    public int getArea() {
        return area;
    } // ゲッター

    public String toString() {
        return getX() + "," + getY();
    }

    public boolean sameBlock(Block obj) {
        return (obj.x == x) && (obj.y == y);
    }

    public boolean sameArea(Block obj) {
        return obj.area == area;
    }

    private boolean test(int i, int j) {
        return i >= 0 && j >= 0;
    }
}

public class ThisDemo {
    public static void main(String args[]) {
        Block r1 = new Block();
        Block r2 = new Block(8, 3);
        System.out.println(r1 + "と" + r2 + "は同じ体積を持つ：" + r1.sameArea(r2));
        r1.setBlock(4, 6);
        System.out.println(r1 + "と" + r2 + "は同じ体積を持つ：" + r1.sameArea(r2));
    }
}
