public class Block {
    private int x, y, area; // プライベートフィールド

    public Block(int aX, int aY) { // コンストラクタ
        if (test(aX, aY)) {
            x = aX;
            y = aY;
            area = x * y;
        } else {

            System.out.println("エラー");
            System.exit(1); // プログラム終了
        }
    }

    public void setBlock(int aX, int aY) { // セッター
        if (test(aX, aY)) {
            x = aX;
            y = aY;
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

    public boolean sameBlock(Block obj) {
        return (obj.x == x) && (obj.y == y);
    }

    public boolean sameArea(Block obj) {
        return obj.area == area;
    }

    private boolean test(int i, int j) { // プライベートメソッド
        return i >= 0 && j >= 0;
    }
}