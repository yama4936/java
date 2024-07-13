public class BlockSample {
    public static void main(String args[]) {
        // Block クラスの 2 つのオブジェクト b1 および b2 を作成
        Block b1 = new Block(2, 7);
        Block b2 = new Block(1, 6);
        // b1 および b2 の x,y,area フィールドの中身を表示
        System.out.println(b1.getX() + b1.getY() + b1.getArea());
        System.out.println(b2.getX() + b2.getY() + b2.getArea());
        // b1 の面積を b2 と比較
        System.out.println(b1.sameArea(b2));
        // b1 および b2 の x,y の中身を変更
        b1.setBlock(3, 6);
        b2.setBlock(5, 10);
        // b1 および b2 の x,y,area フィールドの中身を表示
        System.out.println(b1.getX() + b1.getY() + b1.getArea());
        System.out.println(b2.getX() + b2.getY() + b2.getArea());
        // b1 の面積を b2 と比較
        System.out.println(b1.sameArea(b2));
    }
}
