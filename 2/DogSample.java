class Dog {

    double weight;

    void outPut() {
        if (weight < 5) // 体重が 5 より小さい場合、"キャンキャン"を出力
            System.out.println("キャンキャン");
        else // そうではない場合、"ワンワン"を出力
            System.out.println("ワンワン");
    }
}

public class DogSample {
    public static void main(String args[]) {
        // 以下は必要な文を追加する
        Dog a = new Dog();
        Dog b = new Dog();

        a.weight = 10;
        b.weight = 3;

        a.outPut();
        b.outPut();
    }
}
